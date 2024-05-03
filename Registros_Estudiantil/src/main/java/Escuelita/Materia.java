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

    public int getId_materia() {
        return id_materia;
    }

    public void setId_materia(int id_materia) {
        this.id_materia = id_materia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    public void agregarNota(Notas nota) {
        notas.add(nota);
    }

    public void mostrarNotas() {
        System.out.println("Notas de la materia " + nombre + ":");
        for (Notas nota : notas) {
            System.out.println("- " + nota.getPrimer_parcial() +
                    " - " + nota.getSegundo_parcial() + " - " + nota.getExamen_final());
        }
    }

    public float calcularPromedio() {
        if (notas.isEmpty()) {
            return 0;
        }
        float suma = 0;
        for (Notas nota : notas) {
            suma += (nota.getPrimer_parcial() + nota.getSegundo_parcial() + nota.getExamen_final()) / 3;
        }
        return suma / notas.size();
    }
}

