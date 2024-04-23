package Escuelita;

import java.util.ArrayList;
import java.util.List;

public class Estudiante {
    private int id_estudiante;
    private String nombre;
    private String apellidoP;
    private int fechaNacimiento;
    private String carrera;
    private List<Materia> materias;

    public Estudiante(int id_estudiante, String nombre, String apellidoP, int fechaNacimiento, String carrera) {
        this.id_estudiante = id_estudiante;
        this.nombre = nombre;
        this.apellidoP = apellidoP;
        this.fechaNacimiento = fechaNacimiento;
        this.carrera = carrera;
        this.materias = new ArrayList<>();
    }

    public void inscribirMateria(Materia materia) {
        materias.add(materia);
    }

    public void agregarNota(Materia materia, Notas nota) {
        if (materias.contains(materia)) {
            materia.agregarNota(nota);
        } else {
            System.out.println("El estudiante no está inscrito en la materia.");
        }
    }

    public void mostrarListaEstudiante() {
        System.out.println("ID: " + id_estudiante);
        System.out.println("Nombre: " + nombre + " " + apellidoP);
        System.out.println("Fecha de nacimiento: " + fechaNacimiento);
        System.out.println("Carrera: " + carrera);
    }

    public void verMateriasInscritas() {
        System.out.println("Materias inscritas:");
        for (Materia materia : materias) {
            System.out.println("- " + materia.getNombre());
        }
    }

    public void verNotas(Materia materia) {
        if (materias.contains(materia)) {
            materia.mostrarNotas();
        } else {
            System.out.println("El estudiante no está inscrito en la materia.");
        }
    }

    public float calcularPromedio(Materia materia) {
        if (materias.contains(materia)) {
            return materia.calcularPromedio();
        } else {
            System.out.println("El estudiante no está inscrito en la materia.");
            return 0;
        }
    }
}

