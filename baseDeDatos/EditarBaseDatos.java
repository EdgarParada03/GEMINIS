/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baseDeDatos;

/**
 *
 * @author edgar
 */
import clases.Docente;
import clases.Estudiante;
import java.sql.*;


public class EditarBaseDatos {
    private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/geminis";
    private static final String DATABASE_USER = "root";
    private static final String DATABASE_PASSWORD = "";

    public void editarFila(String tableName, int creditos, int idProgramaAcademico, int id) throws SQLException {
        try (Connection connection = DriverManager.getConnection(DATABASE_URL, DATABASE_USER, DATABASE_PASSWORD)) {
            String query = "UPDATE " + tableName + " SET totalCreditos = ?, idProgramaAcademico = ? WHERE idPensum = ?";
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setInt(1, creditos);
            ps.setInt(2, idProgramaAcademico);
            ps.setInt(3, id);
            ps.executeUpdate();
        }
    }
    
    public void editarProgramaAcademico(String tableName, String nombrePrograma, String descripcion, String duracion, String nivelAcademico, String facultad, String universidad, int id) throws SQLException {
        try (Connection connection = DriverManager.getConnection(DATABASE_URL, DATABASE_USER, DATABASE_PASSWORD)) {
            String query = "UPDATE " + tableName + " SET nombrePrograma = ?, descripcion = ?, duracion = ?, nivelAcademico = ?, facultad = ?, universidad = ? WHERE idProgramaAcademico = ?";
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setString(1, nombrePrograma);
            ps.setString(2, descripcion);
            ps.setString(3, duracion);
            ps.setString(4, nivelAcademico);
            ps.setString(5, facultad);
            ps.setString(6, universidad);
            ps.setInt(7, id);
            ps.executeUpdate();
        }
    }
    
    public void editarAsignatura(String tableName, String nombreAsignatura, String horaInicio, String horaFin, String dia, int numeroCreditos, int idPensum, int idSemestre , int id) throws SQLException {
    try (Connection connection = DriverManager.getConnection(DATABASE_URL, DATABASE_USER, DATABASE_PASSWORD)) {
        String query = "UPDATE " + tableName + " SET nombreAsignatura = ?, horaInicio = ?, horaFin = ?, dia = ?, numeroCreditos = ?,idPensum = ? , idSemestre = ? WHERE idAsignatura = ?";
        PreparedStatement ps = connection.prepareStatement(query);
        ps.setString(1, nombreAsignatura);
        ps.setString(2, horaInicio);
        ps.setString(3, horaFin);
        ps.setString(4, dia);
        ps.setInt(5, numeroCreditos);
        ps.setInt(6, idPensum);
        ps.setInt(7, idSemestre);
        ps.setInt(8, id);
        ps.executeUpdate();
    }
}
    
    
    public void editarSemestre(String tableName, String añoAcademico, String periodoAcademico, String fechaInicio, String fechaFin, int id) throws SQLException {
    try (Connection connection = DriverManager.getConnection(DATABASE_URL, DATABASE_USER, DATABASE_PASSWORD)) {
        String query = "UPDATE " + tableName + " SET añoAcademico = ?, periodoAcademico = ?, fechaInicio = ?, fechaFin = ? WHERE idSemestre = ?";
        PreparedStatement ps = connection.prepareStatement(query);
        ps.setString(1, añoAcademico);
        ps.setString(2, periodoAcademico);
        ps.setString(3, fechaInicio);
        ps.setString(4, fechaFin);
        ps.setInt(5, id);
        ps.executeUpdate();
    } 
}
    public void editarCurso(String tableName, String nombre, int idSemestre, int idPrograma, int idCurso) throws SQLException {
    try (Connection connection = DriverManager.getConnection(DATABASE_URL, DATABASE_USER, DATABASE_PASSWORD)) {
        String query = "UPDATE " + tableName + " SET nombre = ?, idSemestre = ?, idPrograma = ? WHERE idCurso = ?";
        PreparedStatement ps = connection.prepareStatement(query);
        ps.setString(1, nombre);
        ps.setInt(2, idSemestre);
        ps.setInt(3, idPrograma);
        ps.setInt(4, idCurso);
        ps.executeUpdate();
    }
}
    
    public void editarEstudiante(Estudiante estudiante) throws SQLException {
    try (Connection connection = DriverManager.getConnection(DATABASE_URL, DATABASE_USER, DATABASE_PASSWORD)) {
        String query = "UPDATE estudiantes SET nombre = ?, apellido = ?, edad = ?, usuario = ?, password = ?, idMatricula = ?, idCurso = ?, idAsignatura = ? WHERE usuario = ?";
        PreparedStatement ps = connection.prepareStatement(query);
        ps.setString(1, estudiante.getNombre());
        ps.setString(2, estudiante.getApellido());
        ps.setInt(3, estudiante.getEdad());
        ps.setString(4, estudiante.getUsuario());
        ps.setString(5, estudiante.getPassword());
        ps.setInt(6, estudiante.getIdMatricula());
        ps.setInt(7, estudiante.getIdCurso());
        ps.setInt(8, estudiante.getIdAsignatura());
        ps.setString(9, estudiante.getUsuario()); // Usamos el usuario como identificador único para encontrar el estudiante a editar
        ps.executeUpdate();
    }
}
    
    public void editarDocente(Docente docente) throws SQLException {
    try (Connection connection = DriverManager.getConnection(DATABASE_URL, DATABASE_USER, DATABASE_PASSWORD)) {
        String query = "UPDATE docentes SET nombre = ?, apellido = ?, edad = ?, usuario = ?, password = ?, especialidad = ? WHERE usuario = ?";
        PreparedStatement ps = connection.prepareStatement(query);
        ps.setString(1, docente.getNombre());
        ps.setString(2, docente.getApellido());
        ps.setInt(3, docente.getEdad());
        ps.setString(4, docente.getUsuario());
        ps.setString(5, docente.getPassword());
        ps.setString(6, docente.getEspecialidad());
        ps.setString(7, docente.getUsuario()); // Usamos el usuario como identificador único para encontrar el docente a editar
        ps.executeUpdate();
    }
}






}
