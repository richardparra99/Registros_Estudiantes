package Observer;


import java.util.ArrayList;
import java.util.List;

public class Chat implements Observable{
    private List<Observer> observador = new ArrayList<>();


    @Override
    public void añadirObserver(Observer observer) {
        observador.add(observer);
    }

    @Override
    public void eliminarObserver(Observer observer) {
        observador.remove(observer);
        if (observer instanceof Usuario) {
            ((Usuario) observer).eliminadoChat(); // Notificar que el usuario ha dejado el chat
        }
    }

    @Override
    public void notificacionObserver(String mensaje) {
        for (Observer observer: observador) {
            observer.actualizacion(mensaje);
        }
    }

    public void enviarMensaje(String mensaje){
        System.out.println("Mensaje enviado: " + mensaje);
        notificacionObserver(mensaje);
    }
}
