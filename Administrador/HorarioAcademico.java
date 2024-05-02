/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Administrador;

/**
 *
 * @author edgar
 */
import java.util.*;

class Asignatura {
    String nombre;
    String dia;
    String hora;

    public Asignatura(String nombre, String dia, String hora) {
        this.nombre = nombre;
        this.dia = dia;
        this.hora = hora;
    }

    @Override
    public String toString() {
        return nombre;
    }
}

public class HorarioAcademico {
    public static void main(String[] args) {
        Map<String, Map<String, Asignatura>> horario = new HashMap<>();

        // Añadir asignaturas al horario
        añadirAsignatura(horario, new Asignatura("Matemáticas", "Lunes", "09:00"));
        añadirAsignatura(horario, new Asignatura("Física", "Martes", "10:40"));
        añadirAsignatura(horario, new Asignatura("Química", "Miércoles", "12:00"));

        // Imprimir horario
        for (String hora : new TreeSet<>(horario.keySet())) {
            System.out.print(hora);
            Map<String, Asignatura> asignaturasPorDia = horario.get(hora);
            for (String dia : new TreeSet<>(asignaturasPorDia.keySet())) {
                System.out.print("\t" + asignaturasPorDia.get(dia));
            }
            System.out.println();
        }
    }

    public static void añadirAsignatura(Map<String, Map<String, Asignatura>> horario, Asignatura asignatura) {
        if (!horario.containsKey(asignatura.hora)) {
            horario.put(asignatura.hora, new HashMap<>());
        }
        horario.get(asignatura.hora).put(asignatura.dia, asignatura);
    }
}
