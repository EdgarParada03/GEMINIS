/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author edgar
 */
public class cursos {
    public String nombre;
    public String idSemestre;
    public String idProgramaAcademico;

    public cursos() {
    }

    public cursos(String nombre, String idSemestre, String idProgramaAcademico) {
        this.nombre = nombre;
        this.idSemestre = idSemestre;
        this.idProgramaAcademico = idProgramaAcademico;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdSemestre() {
        return idSemestre;
    }

    public void setIdSemestre(String idSemestre) {
        this.idSemestre = idSemestre;
    }

    public String getIdProgramaAcademico() {
        return idProgramaAcademico;
    }

    public void setIdProgramaAcademico(String idProgramaAcademico) {
        this.idProgramaAcademico = idProgramaAcademico;
    }

    @Override
    public String toString() {
        return "cursos{" + "nombre=" + nombre + ", idSemestre=" + idSemestre + ", idProgramaAcademico=" + idProgramaAcademico + '}';
    }
    
    
}
