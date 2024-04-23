package Escuelita;

import java.util.ArrayList;
import java.util.List;

public class Materia {
    private int id_materia;
    private String nombre;
    private int creditos;
    private List<Notas> notas;

    public Materia(int id_materia, String nombre, int creditos) {
        this.id_materia = id_materia;
        this.nombre = nombre;
        this.creditos = creditos;
        this.notas = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void agregarNota(Notas nota) {
        notas.add(nota);
    }

    public void mostrarNotas() {
        System.out.println("Notas de la materia " + nombre + ":");
        for (Notas nota : notas) {
            System.out.println("- " + nota.getPuntaje());
        }
    }

    public float calcularPromedio() {
        if (notas.isEmpty()) {
            return 0;
        }
        float suma = 0;
        for (Notas nota : notas) {
            suma += nota.getPuntaje();
        }
        return suma / notas.size();
    }
}

