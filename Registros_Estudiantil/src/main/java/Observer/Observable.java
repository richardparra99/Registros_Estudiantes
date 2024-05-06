package Observer;

public interface Observable {
    void añadirObserver(Observer observer);
    void eliminarObserver(Observer observer);
    void notificacionObserver(String mensaje);
}
