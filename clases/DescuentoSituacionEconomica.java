/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author edgar
 */
// Clase concreta para el descuento por situación económica
public class DescuentoSituacionEconomica implements EstrategiaDescuento {
    
    private String nombre;

    public DescuentoSituacionEconomica() {
        this.nombre = "Descuento situacion economica";
    }
    
    @Override
    public double calcularMatricula(programaAcademico programaAcademico) {
        // Implementa la lógica del descuento por situación económica
        return programaAcademico.getTarifaBase() * 0.5; // Supongamos un 20% de descuento
    }
    
    @Override
    public String getNombre() {
        return this.nombre;
    }
}
