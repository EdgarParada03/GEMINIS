/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author edgar
 */
public class pensumAcademico {
    public String totalCreditos;
    public int ProgramaAcademico;

    public pensumAcademico() {
    }

    public pensumAcademico(String totalCreditos, int ProgramaAcademico) {
        this.totalCreditos = totalCreditos;
        this.ProgramaAcademico = ProgramaAcademico;
    }

    public String getTotalCreditos() {
        return totalCreditos;
    }

    public void setTotalCreditos(String totalCreditos) {
        this.totalCreditos = totalCreditos;
    }

    public int getProgramaAcademico() {
        return ProgramaAcademico;
    }

    public void setProgramaAcademico(int ProgramaAcademico) {
        this.ProgramaAcademico = ProgramaAcademico;
    }

    @Override
    public String toString() {
        return "pensumAcademico{" + "totalCreditos=" + totalCreditos + ", ProgramaAcademico=" + ProgramaAcademico + '}';
    }
    
    
}
