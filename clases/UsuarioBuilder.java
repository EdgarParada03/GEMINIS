/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author edgar
 */
public interface UsuarioBuilder {
    void setNombre(String nombre);
    void setApellido(String apellido);
    void setEdad(int edad);
    void setUsuario(String usuario);
    void setPassword(String password);
    Usuario build(); // Agregamos el método build() a la interfaz
}
