/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author edgar
 */
public class programaAcademico {
    public String nombrePrograma;
    public String descripcion;
    public String duracion;
    public String nivelAcademico;
    public String facultad;
    public String universidad;

    public programaAcademico() {
    }

    public programaAcademico(String nombrePrograma, String descripcion, String duracion, String nivelAcademico, String facultad, String universidad) {
        this.nombrePrograma = nombrePrograma;
        this.descripcion = descripcion;
        this.duracion = duracion;
        this.nivelAcademico = nivelAcademico;
        this.facultad = facultad;
        this.universidad = universidad;
    }

    public String getNombrePrograma() {
        return nombrePrograma;
    }

    public void setNombrePrograma(String nombrePrograma) {
        this.nombrePrograma = nombrePrograma;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public String getNivelAcademico() {
        return nivelAcademico;
    }

    public void setNivelAcademico(String nivelAcademico) {
        this.nivelAcademico = nivelAcademico;
    }

    public String getFacultad() {
        return facultad;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }

    public String getUniversidad() {
        return universidad;
    }

    public void setUniversidad(String universidad) {
        this.universidad = universidad;
    }

    @Override
    public String toString() {
        return "programaAcademico{" + "nombrePrograma=" + nombrePrograma + ", descripcion=" + descripcion + ", duracion=" + duracion + ", nivelAcademico=" + nivelAcademico + ", facultad=" + facultad + ", universidad=" + universidad + '}';
    }
    
    
}
