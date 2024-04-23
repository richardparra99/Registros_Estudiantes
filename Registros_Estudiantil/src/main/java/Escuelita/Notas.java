package Escuelita;

public class Notas {
    private int id_nota;
    private float puntaje;

    public Notas(int id_nota, float puntaje) {
        this.id_nota = id_nota;
        this.puntaje = puntaje;
    }

    public float getPuntaje() {
        return puntaje;
    }
}
