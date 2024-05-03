package Escuelita;

import java.util.ArrayList;
import java.util.List;

public class Estudiante {
    private int id_estudiante;
    private String nombre;
    private String apellido;
    private String fecha_nacimiento;
    private String carrera;
    private List<Materia> materias;

    public Estudiante(int id_estudiante, String nombre, String apellido, String fecha_nacimiento, String carrera) {
        this.id_estudiante = id_estudiante;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fecha_nacimiento = fecha_nacimiento;
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
        System.out.println("Nombre: " + nombre + " " + apellido);
        System.out.println("Fecha de nacimiento: " + fecha_nacimiento);
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
    public int getId_estudiante() {
        return id_estudiante;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public String getCarrera() {
        return carrera;
    }

    public List<Materia> getMaterias() {
        return materias;
    }

    public void setId_estudiante(int id_estudiante) {
        this.id_estudiante = id_estudiante;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setFecha_nacimiento(String fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public void setMaterias(List<Materia> materias) {
        this.materias = materias;
    }
}

