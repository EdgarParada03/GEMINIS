/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author edgar
 */
public class asignatura {
    public String nombreAsignatura;
    public String horaInicio;
    public String horaFin;
    public String dia;
    public int numeroCreditos;
    public int pensumAcademico;
    public int semestreAcademico;

    public asignatura() {
    }

    public asignatura(String nombreAsignatura, String horaInicio, String horaFin, String dia, int numeroCreditos, int pensumAcademico, int semestreAcademico) {
        this.nombreAsignatura = nombreAsignatura;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
        this.dia = dia;
        this.numeroCreditos = numeroCreditos;
        this.pensumAcademico = pensumAcademico;
        this.semestreAcademico = semestreAcademico;
    }

    public String getNombreAsignatura() {
        return nombreAsignatura;
    }

    public void setNombreAsignatura(String nombreAsignatura) {
        this.nombreAsignatura = nombreAsignatura;
    }

    public String getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(String horaInicio) {
        this.horaInicio = horaInicio;
    }

    public String getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(String horaFin) {
        this.horaFin = horaFin;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public int getNumeroCreditos() {
        return numeroCreditos;
    }

    public void setNumeroCreditos(int numeroCreditos) {
        this.numeroCreditos = numeroCreditos;
    }

    public int getPensumAcademico() {
        return pensumAcademico;
    }

    public void setPensumAcademico(int pensumAcademico) {
        this.pensumAcademico = pensumAcademico;
    }

    public int getSemestreAcademico() {
        return semestreAcademico;
    }

    public void setSemestreAcademico(int semestreAcademico) {
        this.semestreAcademico = semestreAcademico;
    }

    @Override
    public String toString() {
        return "asignatura{" + "nombreAsignatura=" + nombreAsignatura + ", horaInicio=" + horaInicio + ", horaFin=" + horaFin + ", dia=" + dia + ", numeroCreditos=" + numeroCreditos + ", pensumAcademico=" + pensumAcademico + ", semestreAcademico=" + semestreAcademico + '}';
    }
    
    
}