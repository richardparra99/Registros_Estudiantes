package Escuelita;

public class Consola {
    public static void main(String[] args) {
        Conexion conexion = Conexion.getInstance();

        if (conexion != null) {
            System.out.println("Conexión exitosa a la base de datos");
            // Aquí puedes realizar operaciones con la base de datos utilizando la conexión
            // Por ejemplo:
            // conexion.ejecutarSQL("INSERT INTO tabla (columna1, columna2) VALUES (valor1, valor2)");
            // conexion.desconectar();
        } else {
            System.out.println("No se pudo establecer conexión a la base de datos");
        }
    }
}
