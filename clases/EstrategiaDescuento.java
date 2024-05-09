/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author edgar
 */

// Interfaz Strategy
public interface EstrategiaDescuento {
    double calcularMatricula(programaAcademico programaAcademico);
    String getNombre();  // Nuevo método
}
