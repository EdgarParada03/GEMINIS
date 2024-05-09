/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baseDeDatos;

/**
 *
 * @author edgar
 */
import clases.Estudiante;
import clases.asignatura;
import java.sql.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class MostrarBaseDatos {

    private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/geminis";
    private static final String DATABASE_USER = "root";
    private static final String DATABASE_PASSWORD = "";

    public Vector<Vector<String>> getTableData(String tableName) throws SQLException {
        Vector<Vector<String>> tableData = new Vector<>();

        try (Connection connection = DriverManager.getConnection(DATABASE_URL, DATABASE_USER, DATABASE_PASSWORD)) {
            String query = "SELECT * FROM " + tableName;
            PreparedStatement ps = connection.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            ResultSetMetaData rsmd = rs.getMetaData();

            // Obtiene el número de columnas
            int columns = rsmd.getColumnCount();

            while (rs.next()) {
                Vector<String> row = new Vector<>();
                for (int i = 1; i <= columns; i++) {
                    row.add(rs.getString(i));
                }
                tableData.add(row);
            }
        }

        return tableData;
    }

    public Vector<String> getColumnNames(String tableName) throws SQLException {
        Vector<String> columnNames = new Vector<>();

        try (Connection connection = DriverManager.getConnection(DATABASE_URL, DATABASE_USER, DATABASE_PASSWORD)) {
            String query = "SELECT * FROM " + tableName;
            PreparedStatement ps = connection.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            ResultSetMetaData rsmd = rs.getMetaData();

            // Obtiene el número de columnas
            int columns = rsmd.getColumnCount();

            for (int i = 1; i <= columns; i++) {
                columnNames.add(rsmd.getColumnName(i));
            }
        }

        return columnNames;
    }

    public int obtenerIdEstudiante(String nombre) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {
            connection = DriverManager.getConnection(DATABASE_URL, DATABASE_USER, DATABASE_PASSWORD);

            String query = "SELECT idEstudiante FROM estudiantes WHERE nombre = ?";

            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, nombre);

            resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                return resultSet.getInt("idEstudiante");
            } else {
                return -1;
            }
        } catch (SQLException e) {
            System.out.println("Error al obtener el id del estudiante: " + e.getMessage());
            return -1;
        } finally {
            if (resultSet != null) {
                try {
                    resultSet.close();
                } catch (SQLException e) {
                    System.out.println("Error al cerrar ResultSet: " + e.getMessage());
                }
            }
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

    public Vector<Vector<String>> getStudentCourseInfo(Estudiante estudiante) throws SQLException {
        String username = estudiante.getUsuario(); // Usa getUsuario en lugar de getId
        Vector<Vector<String>> tableData = new Vector<>();

        try (Connection connection = DriverManager.getConnection(DATABASE_URL, DATABASE_USER, DATABASE_PASSWORD)) {
            String query = "SELECT "
                    + "cursos.nombre, "
                    + "semestreacademico.añoAcademico, "
                    + "semestreacademico.periodoAcademico, "
                    + "programaacademico.nombrePrograma "
                    + "FROM estudiantes "
                    + "JOIN cursos ON estudiantes.idCurso = cursos.idCurso "
                    + "JOIN semestreacademico ON cursos.idSemestre = semestreacademico.idSemestre "
                    + "JOIN programaacademico ON cursos.idPrograma = programaacademico.idProgramaAcademico "
                    + "WHERE estudiantes.usuario = ?";
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setString(1, username);
            ResultSet rs = ps.executeQuery();
            ResultSetMetaData rsmd = rs.getMetaData();

            // Obtiene el número de columnas
            int columns = rsmd.getColumnCount();

            while (rs.next()) {
                Vector<String> row = new Vector<>();
                for (int i = 1; i <= columns; i++) {
                    row.add(rs.getString(i));
                }
                tableData.add(row);
            }
        }

        return tableData;
    }

    public void showStudentCourseInfoInTable(Estudiante estudiante, JTable table) throws SQLException {
        Vector<Vector<String>> data = getStudentCourseInfo(estudiante);
        Vector<String> columnNames = new Vector<>(Arrays.asList("Nombre del Curso", "Año Académico", "Período Académico", "Nombre del Programa"));

        DefaultTableModel model = new DefaultTableModel(data, columnNames);
        table.setModel(model);
    }

    public List<String> obtenerAsignaturasEstudiante(String nombre) {
        List<String> asignaturas = new ArrayList<>();
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {
            connection = DriverManager.getConnection(DATABASE_URL, DATABASE_USER, DATABASE_PASSWORD);

            String query = "SELECT a.nombreAsignatura FROM asignaturas a "
                    + "INNER JOIN semestreacademico s ON a.idSemestre = s.idSemestre "
                    + "INNER JOIN cursos c ON s.idSemestre = c.idSemestre "
                    + "INNER JOIN estudiantes e ON c.idCurso = e.idCurso "
                    + "WHERE e.nombre = ?";

            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, nombre);

            resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                asignaturas.add(resultSet.getString("nombreAsignatura"));
            }
        } catch (SQLException e) {
            System.out.println("Error al obtener las asignaturas del estudiante: " + e.getMessage());
        } finally {
            if (resultSet != null) {
                try {
                    resultSet.close();
                } catch (SQLException e) {
                    System.out.println("Error al cerrar ResultSet: " + e.getMessage());
                }
            }
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
        return asignaturas;
    }

    public asignatura obtenerAsignatura(String nombreAsignatura) {
        asignatura asignatura = null;
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {
            connection = DriverManager.getConnection(DATABASE_URL, DATABASE_USER, DATABASE_PASSWORD);

            String query = "SELECT nombreAsignatura, dia, horaInicio, horaFin FROM asignaturas WHERE nombreAsignatura = ?";

            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, nombreAsignatura);

            resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                asignatura = new asignatura();
                asignatura.setNombreAsignatura(resultSet.getString("nombreAsignatura"));
                asignatura.setDia(resultSet.getString("dia"));
                asignatura.setHoraInicio(resultSet.getString("horaInicio"));
                asignatura.setHoraFin(resultSet.getString("horaFin"));
            }
        } catch (SQLException e) {
            System.out.println("Error al obtener la asignatura: " + e.getMessage());
        } finally {
            // Cerrar recursos...
        }
        return asignatura;
    }

}
