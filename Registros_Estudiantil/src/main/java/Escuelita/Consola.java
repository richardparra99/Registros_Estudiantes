package Escuelita;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Consola {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Conexion conexion = new Conexion();
        List<Estudiante> listaEstudiantes = new ArrayList<>();
        try {
            Connection conn = conexion.getConnection();
            Statement statement = conn.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM estudiante");

            while (resultSet.next()) {
                int idEstudiante = resultSet.getInt("id_estudiante");
                String nombre = resultSet.getString("nombre");
                String apellido = resultSet.getString("apellido");
                String fechaNacimiento = resultSet.getString("fecha_nacimiento");
                String carrera = resultSet.getString("carrera");

                Estudiante estudiante = new Estudiante(idEstudiante, nombre, apellido, fechaNacimiento, carrera);
                listaEstudiantes.add(estudiante);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        while (true) {
            System.out.println("\nMenú:");
            System.out.println("1. Crear estudiante");
            System.out.println("2. Inscribir estudiante en materia");
            System.out.println("3. Agregar notas a materia");
            System.out.println("4. Ver materias inscritas por estudiante");
            System.out.println("5. Ver notas de una materia");
            System.out.println("6. Calcular promedio de una materia");
            System.out.println("7. Ver lista de estudiantes registrados");
            System.out.println("8. Salir");
            System.out.print("Seleccione una opción: ");

            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el ID del estudiante: ");
                    int idEstudiante = scanner.nextInt();
                    scanner.nextLine(); // Consumir el salto de línea

                    System.out.print("Ingrese el nombre del estudiante: ");
                    String nombreEstudiante = scanner.nextLine();

                    System.out.print("Ingrese el apellido del estudiante: ");
                    String apellidoEstudiante = scanner.nextLine();

                    System.out.print("Ingrese la fecha de nacimiento del estudiante: ");
                    String fechaNacimientoEstudiante = scanner.nextLine();

                    System.out.print("Ingrese la carrera del estudiante: ");
                    String carreraEstudiante = scanner.nextLine();

                    Estudiante estudiante = new Estudiante(idEstudiante, nombreEstudiante, apellidoEstudiante, fechaNacimientoEstudiante, carreraEstudiante);
                    listaEstudiantes.add(estudiante);
                    System.out.println("Estudiante creado exitosamente.");
                    break;
                case 2:
                    // Implementa la lógica para inscribir al estudiante en una materia
                    break;
                case 3:
                    // Implementa la lógica para agregar notas a una materia
                    break;
                case 4:
                    // Implementa la lógica para ver las materias inscritas por un estudiante
                    break;
                case 5:
                    // Implementa la lógica para ver las notas de una materia
                    break;
                case 6:
                    // Implementa la lógica para calcular el promedio de una materia
                    break;
                case 7:
                    System.out.println("Lista de estudiantes registrados:");
                    for (Estudiante e : listaEstudiantes) {
                        e.mostrarListaEstudiante();
                        System.out.println("--------------------");
                    }
                    break;
                case 8:
                    System.out.println("Saliendo del programa...");
                    return;
                default:
                    System.out.println("Opción no válida.");
            }
        }
    }
}
