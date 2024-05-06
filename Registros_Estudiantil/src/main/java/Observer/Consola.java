package Observer;

public class Consola {
    public static void main(String[] args) {
        // creamos el usuario
        Usuario usuario1 = new Usuario("Leonardo ");
        Usuario usuario2 = new Usuario("Richard ");

        // crear el chat
        Chat chatsito = new Chat();

        chatsito.añadirObserver(usuario1);
        chatsito.añadirObserver(usuario2);

        // enviamos mensaje al chat
        chatsito.enviarMensaje("Hola a todos");

        chatsito.eliminarObserver(usuario1);

        chatsito.enviarMensaje("Como estan todos");
    }
}
