/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Administrador;

/**
 *
 * @author edgar
 */
public class AlumnoBuilder implements PersonaBuilder {
    private Alumno alumno;

    public AlumnoBuilder() {
        this.alumno = new Alumno();
    }

    @Override
    public void setNombre(String nombre) {
        alumno.setNombre(nombre);
    }

    @Override
    public void setApellido(String apellido) {
        alumno.setApellido(apellido);
    }

    public void setMatricula(String matricula) {
        alumno.setMatricula(matricula);
    }

    public Alumno build() {
        return alumno;
    }

    @Override
    public String toString() {
        return "AlumnoBuilder{" + "alumno=" + alumno + '}';
    }
    
}
