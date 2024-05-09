/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author edgar
 */
public class EstudianteBuilder implements UsuarioBuilder {
    private Estudiante estudiante;

    public EstudianteBuilder() {
        this.estudiante = new Estudiante();
    }

    @Override
    public void setNombre(String nombre) {
        estudiante.setNombre(nombre);
    }

    @Override
    public void setApellido(String apellido) {
        estudiante.setApellido(apellido);
    }

    @Override
    public void setEdad(int edad) {
        estudiante.setEdad(edad);
    }

    @Override
    public void setUsuario(String usuario) {
        estudiante.setUsuario(usuario);
    }

    @Override
    public void setPassword(String password) {
        estudiante.setPassword(password);
    }

    public void setIdCurso(int idCurso) {
        estudiante.setIdCurso(idCurso);
    }

    public void setIdAsignatura(int idAsignatura) {
        estudiante.setIdAsignatura(idAsignatura);
    }

    @Override
    public Estudiante build() {
        return estudiante;
    }
}