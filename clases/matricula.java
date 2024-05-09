/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author edgar
 */
public class matricula {

    public programaAcademico programaAcademico;
    public EstrategiaDescuento estrategiaDescuento;
    private float costoMatricula; // Nuevo atributo
    public String estadoMatricula; // Añadir nuevo atributo
    

    public matricula(programaAcademico programaAcademico, EstrategiaDescuento estrategiaDescuento) {
        this.programaAcademico = programaAcademico;
        this.estrategiaDescuento = estrategiaDescuento;
        this.costoMatricula = 0.0f; // Inicializar el costo de la matrícula en 0
        this.estadoMatricula = ""; // Inicializar el estado de la matrícula como cadena vacía
    }

    public void setEstrategiaDescuento(EstrategiaDescuento estrategiaDescuento) {
        this.estrategiaDescuento = estrategiaDescuento;
    }

    public void calcularMatricula() {
        this.costoMatricula = (float) this.estrategiaDescuento.calcularMatricula(this.programaAcademico);
    }

    public float getCostoMatricula() {
        return this.costoMatricula;
    }

    public void setCostoMatricula(float costoMatricula) {
        this.costoMatricula = costoMatricula;
    }
    
    

    // Método para establecer el estado de la matrícula
    public void setEstadoMatricula(String estado) {
        this.estadoMatricula = estado;
    }

    // Método para obtener el estado de la matrícula
    public String getEstadoMatricula() {
        return this.estadoMatricula;
    }
}

