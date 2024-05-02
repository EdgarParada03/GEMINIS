/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Administrador;

/**
 *
 * @author edgar
 */
public class DocenteBuilder implements PersonaBuilder {
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

    public void setNumeroEmpleado(String numeroEmpleado) {
        docente.setNumeroEmpleado(numeroEmpleado);
    }

    public Docente build() {
        return docente;
    }
}