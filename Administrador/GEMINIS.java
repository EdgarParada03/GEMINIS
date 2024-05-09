/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Administrador;

/**
 *
 * @author edgar
 */
public class GEMINIS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DatabaseHandler dbHandler = new DatabaseHandler();

        // Crear un alumno
        AlumnoBuilder alumnoBuilder = new AlumnoBuilder();
        alumnoBuilder.setNombre("Juan");
        alumnoBuilder.setApellido("Perez");
        alumnoBuilder.setMatricula("123456");
        Alumno alumno = alumnoBuilder.build();

        // Guardar el alumno en la base de datos
        dbHandler.guardarPersona(alumno);

        // Crear un docente
        DocenteBuilder docenteBuilder = new DocenteBuilder();
        docenteBuilder.setNombre("Ana");
        docenteBuilder.setApellido("Gomez");
        docenteBuilder.setNumeroEmpleado("789012");
        Docente docente = docenteBuilder.build();

        // Guardar el docente en la base de datos
        dbHandler.guardarPersona(docente);
    }

}
