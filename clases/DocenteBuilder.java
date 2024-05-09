/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author edgar
 */
public class DocenteBuilder implements UsuarioBuilder {
    private Docente docente;

    
    public DocenteBuilder() {
        this.docente = new Docente();
    }
    
    
    @Override
    public void setNombre(String nombre) {
        docente.setNombre(nombre);
    }

    @Override
    public void setApellido(String apellido) {
        docente.setApellido(apellido);
    }

    @Override
    public void setEdad(int edad) {
        docente.setEdad(edad);
    }

    @Override
    public void setUsuario(String usuario) {
        docente.setUsuario(usuario);
    }

    @Override
    public void setPassword(String password) {
        docente.setPassword(password);
    }

    public void setEspecialidad(String especialidad) {
        docente.setEspecialidad(especialidad);
    }

    @Override
    public Docente build() {
        return docente;
    }
}
