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
import clases.Usuario;
import clases.asignatura;
import clases.cursos;
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

        String query = "INSERT INTO programaacademico (nombrePrograma, descripcion, duracion, nivelAcademico, facultad, universidad) VALUES (?, ?, ?, ?, ?, ?)";

        preparedStatement = connection.prepareStatement(query);
        preparedStatement.setString(1, programaacademico.getNombrePrograma());
        preparedStatement.setString(2, programaacademico.getDescripcion());
        preparedStatement.setString(3, programaacademico.getDuracion());
        preparedStatement.setString(4, programaacademico.getNivelAcademico());
        preparedStatement.setString(5, programaacademico.getFacultad());
        preparedStatement.setString(6, programaacademico.getUniversidad());

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
    
    public boolean semestreExiste(String añoAcademico , String periodoAcademico) {
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
            query = "INSERT INTO estudiantes (nombre, apellido, edad, usuario, password, idMatricula, idCurso, idAsignatura) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
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
            preparedStatement.setInt(6, ((Estudiante) usuario).getIdMatricula());
            preparedStatement.setInt(7, ((Estudiante) usuario).getIdCurso());
            preparedStatement.setInt(8, ((Estudiante) usuario).getIdAsignatura());
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
    
}
