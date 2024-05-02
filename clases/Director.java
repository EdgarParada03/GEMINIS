/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author edgar
 */
public class Director {
    private UsuarioBuilder builder;

    public void setBuilder(UsuarioBuilder builder) {
        this.builder = builder;
    }

    public Usuario construirUsuario() {
        return builder.build();
    }    
}