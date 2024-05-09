/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author edgar
 */
// Clase concreta para el descuento por rendimiento académico
public class DescuentoRendimientoAcademico implements EstrategiaDescuento {
    private String nombre;
    
    public DescuentoRendimientoAcademico() {
        this.nombre = "Descuento rendimiento";
    }
    
    @Override
    public double calcularMatricula(programaAcademico programaAcademico) {
        // Implementa la lógica del descuento por rendimiento académico
        return programaAcademico.getTarifaBase() * 0.7; // Supongamos un 30% de descuento
    }
    
    @Override
    public String getNombre() {
        return this.nombre;
    }
}
