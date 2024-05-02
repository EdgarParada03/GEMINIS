/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Administrador;

/**
 *
 * @author edgar
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DatabaseHandler {
    private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/prueba";
    private static final String DATABASE_USER = "root";
    private static final String DATABASE_PASSWORD = "";

    public void guardarPersona(Persona persona) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            connection = DriverManager.getConnection(DATABASE_URL, DATABASE_USER, DATABASE_PASSWORD);

            String query = "INSERT INTO personas (nombre, apellido) VALUES (?, ?)";
            if (persona instanceof Alumno) {
                query = "INSERT INTO alumnos (nombre, apellido, matricula) VALUES (?, ?, ?)";
            } else if (persona instanceof Docente) {
                query = "INSERT INTO docentes (nombre, apellido, numeroEmpleado) VALUES (?, ?, ?)";
            }

            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, persona.getNombre());
            preparedStatement.setString(2, persona.getApellido());
            if (persona instanceof Alumno) {
                preparedStatement.setString(3, ((Alumno) persona).getMatricula());
            } else if (persona instanceof Docente) {
                preparedStatement.setString(3, ((Docente) persona).getNumeroEmpleado());
            }

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error al guardar la persona: " + e.getMessage());
        } finally {
            if (preparedStatement != null) {
                try {
                    preparedStatement.close();
                } catch (SQLException e) {
                    System.out.println("Error al cerrar PreparedStatement: " + e.getMessage());
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    System.out.println("Error al cerrar Connection: " + e.getMessage());
                }
            }
        }
    }
}