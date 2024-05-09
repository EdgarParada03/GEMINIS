/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author edgar
 */
public class semestreAcademico {
    public String añoAcademico;
    public String periodoAcademico;
    public String fechaInicio;
    public String fechaFin;

    public semestreAcademico() {
    }

    public semestreAcademico(String añoAcademico, String periodoAcademico, String fechaInicio, String fechaFin) {
        this.añoAcademico = añoAcademico;
        this.periodoAcademico = periodoAcademico;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }

    public String getAñoAcademico() {
        return añoAcademico;
    }

    public void setAñoAcademico(String añoAcademico) {
        this.añoAcademico = añoAcademico;
    }

    public String getPeriodoAcademico() {
        return periodoAcademico;
    }

    public void setPeriodoAcademico(String periodoAcademico) {
        this.periodoAcademico = periodoAcademico;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(String fechaFin) {
        this.fechaFin = fechaFin;
    }

    @Override
    public String toString() {
        return "semestreAcademico{" + "a\u00f1oAcademico=" + añoAcademico + ", periodoAcademico=" + periodoAcademico + ", fechaInicio=" + fechaInicio + ", fechaFin=" + fechaFin + '}';
    }
    
    
}
