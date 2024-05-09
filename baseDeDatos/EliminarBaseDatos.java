/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baseDeDatos;

/**
 *
 * @author edgar
 */
import clases.programaAcademico;
import clases.pensumAcademico;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class EliminarBaseDatos {

    private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/geminis";
    private static final String DATABASE_USER = "root";
    private static final String DATABASE_PASSWORD = "";

    public void borrarPrograma(String nombrePrograma) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            connection = DriverManager.getConnection(DATABASE_URL, DATABASE_USER, DATABASE_PASSWORD);

            String query = "DELETE FROM programaacademico WHERE nombrePrograma = ?";

            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, nombrePrograma);

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error al borrar el programa académico: " + e.getMessage());
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

    /////////////////////////////////////////////////////////////////////////////
    public void borrarPensum(int ProgramaAcademico) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            connection = DriverManager.getConnection(DATABASE_URL, DATABASE_USER, DATABASE_PASSWORD);

            String query = "DELETE FROM pensum WHERE idProgramaAcademico = ?";

            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, ProgramaAcademico);

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error al borrar el pensum académico: " + e.getMessage());
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

    /////////////////////////////////////////////////////////////////////
    public void borrarAsignatura(String nombreAsignatura) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            connection = DriverManager.getConnection(DATABASE_URL, DATABASE_USER, DATABASE_PASSWORD);

            String query = "DELETE FROM asignaturas WHERE nombreAsignatura = ?";

            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, nombreAsignatura);

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error al borrar la asignatura: " + e.getMessage());
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

    public void borrarSemestre(String añoAcademico, String periodoAcademico) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            connection = DriverManager.getConnection(DATABASE_URL, DATABASE_USER, DATABASE_PASSWORD);

            String query = "DELETE FROM semestreacademico WHERE añoAcademico = ? AND periodoAcademico = ?";

            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, añoAcademico);
            preparedStatement.setString(2, periodoAcademico);

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error al borrar el semestre: " + e.getMessage());
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

    public void borrarCurso(String nombre) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            connection = DriverManager.getConnection(DATABASE_URL, DATABASE_USER, DATABASE_PASSWORD);

            String query = "DELETE FROM cursos WHERE nombre = ?";

            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, nombre);

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error al borrar el curso: " + e.getMessage());
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

    public void borrarEstudiante(String usuario) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            connection = DriverManager.getConnection(DATABASE_URL, DATABASE_USER, DATABASE_PASSWORD);

            String query = "DELETE FROM estudiantes WHERE usuario = ?";

            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, usuario);

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error al borrar el estudiante: " + e.getMessage());
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

    public void borrarDocente(String usuario) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            connection = DriverManager.getConnection(DATABASE_URL, DATABASE_USER, DATABASE_PASSWORD);

            String query = "DELETE FROM docentes WHERE usuario = ?";

            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, usuario);

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error al borrar el docente: " + e.getMessage());
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
