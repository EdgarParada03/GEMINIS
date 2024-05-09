/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author edgar
 */
public class Estudiante extends Usuario {
    private int idCurso;
    private int idAsignatura;

    // Constructor privado
    Estudiante() {}

    public int getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(int idCurso) {
        this.idCurso = idCurso;
    }

    public int getIdAsignatura() {
        return idAsignatura;
    }

    public void setIdAsignatura(int idAsignatura) {
        this.idAsignatura = idAsignatura;
    }

    // ... Resto de los métodos ...

    @Override
    public String toString() {
        return "Estudiante{" + "idCurso=" + idCurso + ", idAsignatura=" + idAsignatura + '}';
    }
}
