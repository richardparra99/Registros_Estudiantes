package Escuelita;

public class Consola {
    public static void main(String[] args) {
        // creamos el estudiante
        Estudiante estudiante = new Estudiante(1, "Juan","Perez",
                1995-06-07, "Ingenieria Sistemas");
        Materia calculo = new Materia(1, "Calculo I", 3);

        // === Estudiantes Inscritos ===
        estudiante.inscribirMateria(calculo);

        // == Notas agregadas ==
        estudiante.agregarNota(calculo, new Notas(1, 80));

        System.out.println("== Lista de estudiantes ==");
        estudiante.mostrarListaEstudiante();

        System.out.println("== Ver nota - Matria ==");
        estudiante.verNotas(calculo);

        System.out.println("== Calcular promedio - Materia ==");
        System.out.println("promedio de calculo: " + estudiante.calcularPromedio(calculo));
    }
}
