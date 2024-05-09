/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baseDeDatos;

/**
 *
 * @author edgar
 */
import clases.DescuentoRendimientoAcademico;
import clases.DescuentoSituacionEconomica;
import clases.Docente;
import clases.EstrategiaDescuento;
import clases.Estudiante;
import clases.EstudianteBuilder;
import clases.Usuario;
import clases.asignatura;
import clases.cursos;
import clases.matricula;
import clases.programaAcademico;
import clases.pensumAcademico;
import clases.semestreAcademico;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JComboBox;

public class GuardarBaseDatos {

    private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/geminis";
    private static final String DATABASE_USER = "root";
    private static final String DATABASE_PASSWORD = "";

    public void guardarPrograma(programaAcademico programaacademico) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            connection = DriverManager.getConnection(DATABASE_URL, DATABASE_USER, DATABASE_PASSWORD);

            String query = "INSERT INTO programaacademico (nombrePrograma, descripcion, duracion, nivelAcademico, facultad, tarifaBase) VALUES (?, ?, ?, ?, ?, ?)";

            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, programaacademico.getNombrePrograma());
            preparedStatement.setString(2, programaacademico.getDescripcion());
            preparedStatement.setString(3, programaacademico.getDuracion());
            preparedStatement.setString(4, programaacademico.getNivelAcademico());
            preparedStatement.setString(5, programaacademico.getFacultad());
            preparedStatement.setFloat(6, programaacademico.getTarifaBase());

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error al guardar el programa académico: " + e.getMessage());
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
    ///////////////////////////////////////////////////////////////////////

    public programaAcademico obtenerProgramaAcademicoDeLaBaseDeDatos(String idPrograma) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {
            connection = DriverManager.getConnection(DATABASE_URL, DATABASE_USER, DATABASE_PASSWORD);

            String query = "SELECT * FROM programaacademico WHERE idProgramaAcademico = ?";

            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, idPrograma);

            resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                String nombrePrograma = resultSet.getString("nombrePrograma");
                String descripcion = resultSet.getString("descripcion");
                String duracion = resultSet.getString("duracion");
                String nivelAcademico = resultSet.getString("nivelAcademico");
                String facultad = resultSet.getString("facultad");
                float tarifaBase = resultSet.getFloat("tarifaBase");

                return new programaAcademico(nombrePrograma, descripcion, duracion, nivelAcademico, facultad, tarifaBase);
            } else {
                return null;
            }
        } catch (SQLException e) {
            System.out.println("Error al obtener el programa académico: " + e.getMessage());
            return null;
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

    ////////////////////////////////////////////////////////////////////////
    public void guardarPensum(pensumAcademico pensumacademico) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            connection = DriverManager.getConnection(DATABASE_URL, DATABASE_USER, DATABASE_PASSWORD);

            String query = "INSERT INTO pensum (totalCreditos, idProgramaAcademico) VALUES (?, ?)";

            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, pensumacademico.getTotalCreditos());
            preparedStatement.setInt(2, pensumacademico.getProgramaAcademico());

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error al guardar el pensum académico: " + e.getMessage());
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

    ///////////////////////////////////////////////////////////////////
    public void guardarAsignatura(asignatura asignatura) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            connection = DriverManager.getConnection(DATABASE_URL, DATABASE_USER, DATABASE_PASSWORD);

            String query = "INSERT INTO asignaturas (nombreAsignatura, horaInicio, horaFin, dia, numeroCreditos ,idPensum , idSemestre) VALUES (?, ?, ?, ?, ? , ? , ?)";

            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, asignatura.getNombreAsignatura());
            preparedStatement.setString(2, asignatura.getHoraInicio());
            preparedStatement.setString(3, asignatura.getHoraFin());
            preparedStatement.setString(4, asignatura.getDia());
            preparedStatement.setInt(5, asignatura.getNumeroCreditos());
            preparedStatement.setInt(6, asignatura.getPensumAcademico());
            preparedStatement.setInt(7, asignatura.getSemestreAcademico());

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error al guardar la asignatura: " + e.getMessage());
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

    //////////////////////////////////////////////
    public void guardarSemestre(semestreAcademico semestre) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            connection = DriverManager.getConnection(DATABASE_URL, DATABASE_USER, DATABASE_PASSWORD);

            String query = "INSERT INTO semestreacademico (añoAcademico , periodoAcademico , fechaInicio , fechaFin) VALUES (?, ?, ?, ?)";

            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, semestre.getAñoAcademico());
            preparedStatement.setString(2, semestre.getPeriodoAcademico());
            preparedStatement.setString(3, semestre.getFechaInicio());
            preparedStatement.setString(4, semestre.getFechaFin());

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error al guardar el semestre: " + e.getMessage());
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

    public void guardarCurso(cursos curso) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            connection = DriverManager.getConnection(DATABASE_URL, DATABASE_USER, DATABASE_PASSWORD);

            String query = "INSERT INTO cursos (nombre, idSemestre, idPrograma) VALUES (?, ?, ?)";

            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, curso.getNombre());
            preparedStatement.setString(2, curso.getIdSemestre());
            preparedStatement.setString(3, curso.getIdProgramaAcademico());

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error al guardar el curso: " + e.getMessage());
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

    public boolean estudianteExiste(String usuario) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {
            connection = DriverManager.getConnection(DATABASE_URL, DATABASE_USER, DATABASE_PASSWORD);
            String query = "SELECT COUNT(*) FROM estudiantes WHERE usuario = ?";
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, usuario);
            resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                int count = resultSet.getInt(1);
                return count > 0;
            }
        } catch (SQLException e) {
            System.out.println("Error al verificar el usuario: " + e.getMessage());
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
        return false;
    }

    public boolean docenteExiste(String usuario) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {
            connection = DriverManager.getConnection(DATABASE_URL, DATABASE_USER, DATABASE_PASSWORD);
            String query = "SELECT COUNT(*) FROM docentes WHERE usuario = ?";
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, usuario);
            resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                int count = resultSet.getInt(1);
                return count > 0;
            }
        } catch (SQLException e) {
            System.out.println("Error al verificar el usuario: " + e.getMessage());
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
        return false;
    }

    public boolean asignaturaExiste(String nombreAsignatura) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {
            connection = DriverManager.getConnection(DATABASE_URL, DATABASE_USER, DATABASE_PASSWORD);
            String query = "SELECT COUNT(*) FROM asignaturas WHERE nombreAsignatura = ?";
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, nombreAsignatura);
            resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                int count = resultSet.getInt(1);
                return count > 0;
            }
        } catch (SQLException e) {
            System.out.println("Error al verificar el usuario: " + e.getMessage());
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
        return false;
    }

    public boolean cursoExiste(String nombre) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {
            connection = DriverManager.getConnection(DATABASE_URL, DATABASE_USER, DATABASE_PASSWORD);
            String query = "SELECT COUNT(*) FROM cursos WHERE nombre = ?";
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, nombre);
            resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                int count = resultSet.getInt(1);
                return count > 0;
            }
        } catch (SQLException e) {
            System.out.println("Error al verificar el usuario: " + e.getMessage());
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
        return false;
    }

    public boolean semestreExiste(String añoAcademico, String periodoAcademico) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {
            connection = DriverManager.getConnection(DATABASE_URL, DATABASE_USER, DATABASE_PASSWORD);
            String query = "SELECT COUNT(*) FROM semestreacademico WHERE añoAcademico = ? AND periodoAcademico = ?";
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, añoAcademico);
            preparedStatement.setString(2, periodoAcademico);
            resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                int count = resultSet.getInt(1);
                return count > 0;
            }
        } catch (SQLException e) {
            System.out.println("Error al verificar el semestre: " + e.getMessage());
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
        return false;
    }

    public boolean programaExiste(String nombrePrograma) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {
            connection = DriverManager.getConnection(DATABASE_URL, DATABASE_USER, DATABASE_PASSWORD);
            String query = "SELECT COUNT(*) FROM programaacademico WHERE nombrePrograma = ?";
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, nombrePrograma);
            resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                int count = resultSet.getInt(1);
                return count > 0;
            }
        } catch (SQLException e) {
            System.out.println("Error al verificar el usuario: " + e.getMessage());
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
        return false;
    }

    public void guardarPersona(Usuario usuario) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            connection = DriverManager.getConnection(DATABASE_URL, DATABASE_USER, DATABASE_PASSWORD);

            String query = "INSERT INTO usuarios (nombre, apellido, edad, usuario, password) VALUES (?, ?, ?, ?, ?)";
            if (usuario instanceof Estudiante) {
                query = "INSERT INTO estudiantes (nombre, apellido, edad, usuario, password, idCurso, idAsignatura) VALUES (?, ?, ?, ?, ?, ?, ?)";
            } else if (usuario instanceof Docente) {
                query = "INSERT INTO docentes (nombre, apellido, edad, usuario, password, especialidad) VALUES (?, ?, ?, ?, ?, ?)";
            }

            preparedStatement = connection.prepareStatement(query);

            preparedStatement.setString(1, usuario.getNombre());
            preparedStatement.setString(2, usuario.getApellido());
            preparedStatement.setInt(3, usuario.getEdad());
            preparedStatement.setString(4, usuario.getUsuario());
            preparedStatement.setString(5, usuario.getPassword());
            if (usuario instanceof Estudiante) {
                preparedStatement.setInt(6, ((Estudiante) usuario).getIdCurso());
                preparedStatement.setInt(7, ((Estudiante) usuario).getIdAsignatura());
            } else if (usuario instanceof Docente) {
                preparedStatement.setString(6, ((Docente) usuario).getEspecialidad());
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

    public void llenarComboBox(JComboBox comboBox, String tabla, String columna) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try {
            connection = DriverManager.getConnection(DATABASE_URL, DATABASE_USER, DATABASE_PASSWORD);
            String query = "SELECT " + columna + " FROM " + tabla;
            preparedStatement = connection.prepareStatement(query);
            resultSet = preparedStatement.executeQuery();

            // Llenar el JComboBox con los datos de la columna especificada
            while (resultSet.next()) {
                comboBox.addItem(resultSet.getString(columna));
            }
        } catch (SQLException e) {
            System.out.println("Error al obtener los datos de la columna '" + columna + "': " + e.getMessage());
        } finally {
            // Asegúrate de cerrar tus recursos de base de datos
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

    public String verificarCredenciales(String usuario, String password) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {
            connection = DriverManager.getConnection(DATABASE_URL, DATABASE_USER, DATABASE_PASSWORD);

            // Primero, verifica en la tabla de estudiantes
            String query = "SELECT * FROM estudiantes WHERE usuario = ? AND password = ?";
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, usuario);
            preparedStatement.setString(2, password);
            resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                return "estudiantes";
            }

            // Luego, verifica en la tabla de docentes
            query = "SELECT * FROM docentes WHERE usuario = ? AND password = ?";
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, usuario);
            preparedStatement.setString(2, password);
            resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                return "docentes";
            }
        } catch (SQLException e) {
            System.out.println("Error al verificar las credenciales: " + e.getMessage());
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
        return null;
    }

    ///metodo para mostrar ventanas del mismo estudiante////
    public Estudiante obtenerEstudiante(String usuario, String password) {
        Estudiante estudiante = null;
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try {
            connection = DriverManager.getConnection(DATABASE_URL, DATABASE_USER, DATABASE_PASSWORD);
            String query = "SELECT * FROM estudiantes WHERE usuario = ? AND password = ?";
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, usuario);
            preparedStatement.setString(2, password);
            resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                EstudianteBuilder builder = new EstudianteBuilder();
                builder.setNombre(resultSet.getString("nombre"));
                builder.setApellido(resultSet.getString("apellido"));
                builder.setEdad(resultSet.getInt("edad"));
                builder.setUsuario(resultSet.getString("usuario"));
                builder.setPassword(resultSet.getString("password"));
                builder.setIdCurso(resultSet.getInt("idCurso"));
                builder.setIdAsignatura(resultSet.getInt("idAsignatura"));
                estudiante = builder.build();
            }
        } catch (SQLException e) {
            System.out.println("Error al obtener el estudiante: " + e.getMessage());
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

        return estudiante;
    }

    public int obtenerIdProgramaAcademico(String nombrePrograma) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {
            connection = DriverManager.getConnection(DATABASE_URL, DATABASE_USER, DATABASE_PASSWORD);

            String query = "SELECT idProgramaAcademico FROM programaacademico WHERE nombrePrograma = ?";

            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, nombrePrograma);

            resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                return resultSet.getInt("idProgramaAcademico");
            } else {
                return -1;
            }
        } catch (SQLException e) {
            System.out.println("Error al obtener el id del programa académico: " + e.getMessage());
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

    public void guardarMatricula(matricula matricula, int idEstudiante) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            connection = DriverManager.getConnection(DATABASE_URL, DATABASE_USER, DATABASE_PASSWORD);

            String query = "INSERT INTO matricula (idProgramaAcademico, tipoDescuento, costoMatricula, estadoMatricula, idEstudiante) VALUES (?, ?, ?, ?, ?)";

            preparedStatement = connection.prepareStatement(query);
            int idProgramaAcademico = obtenerIdProgramaAcademico(matricula.programaAcademico.nombrePrograma);
            if (idProgramaAcademico == -1) {
                System.out.println("No se encontró el programa académico: " + matricula.programaAcademico.nombrePrograma);
                return;
            }
            preparedStatement.setInt(1, idProgramaAcademico);
            preparedStatement.setString(2, matricula.estrategiaDescuento.getClass().getSimpleName());
            preparedStatement.setFloat(3, matricula.getCostoMatricula());
            preparedStatement.setString(4, matricula.getEstadoMatricula());
            preparedStatement.setInt(5, idEstudiante);

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error al guardar la matrícula: " + e.getMessage());
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

    public void guardarMatriculaPorNombre(matricula matricula, String nombreEstudiante) {
        int idEstudiante = obtenerIdEstudiante(nombreEstudiante);
        if (idEstudiante == -1) {
            System.out.println("No se encontró el estudiante: " + nombreEstudiante);
            return;
        }
        guardarMatricula(matricula, idEstudiante);
    }

    public boolean estudianteExiste(int idEstudiante) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {
            connection = DriverManager.getConnection(DATABASE_URL, DATABASE_USER, DATABASE_PASSWORD);

            String query = "SELECT * FROM estudiantes WHERE idEstudiante = ?";

            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, idEstudiante);

            resultSet = preparedStatement.executeQuery();

            return resultSet.next();
        } catch (SQLException e) {
            System.out.println("Error al verificar si el estudiante existe: " + e.getMessage());
            return false;
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

    public void actualizarEstadoMatricula(String nombreEstudiante) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            connection = DriverManager.getConnection(DATABASE_URL, DATABASE_USER, DATABASE_PASSWORD);

            int idEstudiante = obtenerIdEstudiante(nombreEstudiante);
            if (idEstudiante == -1) {
                System.out.println("No se encontró el estudiante: " + nombreEstudiante);
                return;
            }

            String query = "UPDATE matricula SET estadoMatricula = ? WHERE idEstudiante = ?";
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, "APROBADA");
            preparedStatement.setInt(2, idEstudiante);

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error al actualizar el estado de la matrícula: " + e.getMessage());
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

    public matricula obtenerMatriculaEstudiante(String nombreEstudiante) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {
            connection = DriverManager.getConnection(DATABASE_URL, DATABASE_USER, DATABASE_PASSWORD);

            int idEstudiante = obtenerIdEstudiante(nombreEstudiante);
            if (idEstudiante == -1) {
                System.out.println("No se encontró el estudiante: " + nombreEstudiante);
                return null;
            }

            String query = "SELECT * FROM matricula WHERE idEstudiante = ?";

            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, idEstudiante);

            resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                // Crear una instancia de matricula con los datos obtenidos de resultSet
                programaAcademico programaAcademico = obtenerProgramaAcademicoDeLaBaseDeDatos(resultSet.getString("idProgramaAcademico"));
                EstrategiaDescuento estrategiaDescuento = null;
                String tipoDescuento = resultSet.getString("tipoDescuento");
                if (tipoDescuento.endsWith("DescuentoRendimientoAcademico")) {
                    estrategiaDescuento = new DescuentoRendimientoAcademico();

                    matricula matricula = new matricula(programaAcademico, estrategiaDescuento);
                    matricula.setEstadoMatricula(resultSet.getString("estadoMatricula"));
                    // Asegúrate de que estás obteniendo el costo más reciente de la matrícula
                    matricula.setCostoMatricula(resultSet.getFloat("costoMatricula"));
                    return matricula;

                } else if (tipoDescuento.endsWith("DescuentoSituacionEconomica")) {
                    estrategiaDescuento = new DescuentoSituacionEconomica();
                    matricula matricula = new matricula(programaAcademico, estrategiaDescuento);
                    matricula.setEstadoMatricula(resultSet.getString("estadoMatricula"));
                    // Asegúrate de que estás obteniendo el costo más reciente de la matrícula
                    matricula.setCostoMatricula(resultSet.getFloat("costoMatricula"));
                    return matricula;
                }

            } else {
                return null;
            }
        } catch (SQLException e) {
            System.out.println("Error al obtener la matrícula del estudiante: " + e.getMessage());
            return null;
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
        return null;

    }

    public boolean esEstudianteEnPrograma(String nombreEstudiante, String idPrograma) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {
            connection = DriverManager.getConnection(DATABASE_URL, DATABASE_USER, DATABASE_PASSWORD);

            int idEstudiante = obtenerIdEstudiante(nombreEstudiante);
            if (idEstudiante == -1) {
                System.out.println("No se encontró el estudiante: " + nombreEstudiante);
                return false;
            }

            String query = "SELECT p.idProgramaAcademico\n"
                    + "FROM estudiantes e\n"
                    + "JOIN cursos c ON e.idCurso = c.idCurso\n"
                    + "JOIN programaacademico p ON c.idPrograma = p.idProgramaAcademico\n"
                    + "WHERE e.nombre = ? AND p.idProgramaAcademico = ?";

            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, nombreEstudiante);
            preparedStatement.setString(2, idPrograma);

            resultSet = preparedStatement.executeQuery();

            return resultSet.next();
        } catch (SQLException e) {
            System.out.println("Error al verificar si el estudiante está en el programa: " + e.getMessage());
            return false;
        } finally {
            // Cerrar resultSet, preparedStatement y connection
        }
    }

}
