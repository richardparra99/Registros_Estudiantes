package Observer;

public class Usuario implements Observer{
    private String nombre;

    public Usuario(String nombre){
        this.nombre = nombre;
    }

    @Override
    public void actualizacion(String mensaje) {
        System.out.println(nombre + "Recibio un mensaje nuevo: " + mensaje);
    }

    public void eliminadoChat() {
        System.out.println(nombre + " ha dejado el chat.");
    }
    public String getNombre() {
        return nombre;
    }
}
