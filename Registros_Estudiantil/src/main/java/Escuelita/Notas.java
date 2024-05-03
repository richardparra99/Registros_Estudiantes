package Escuelita;

public class Notas {
    private int id_nota;
    private int primer_parcial;
    private int segundo_parcial;
    private int examen_final;
    private int cod_materia;
    private int id_estudiante;

    public Notas(int id_nota, int primer_parcial, int segundo_parcial, int examen_final, int id_estudiante) {
        this.id_nota = id_nota;
        this.primer_parcial = primer_parcial;
        this.segundo_parcial = segundo_parcial;
        this.examen_final = examen_final;
        this.id_estudiante = id_estudiante;
    }

    public int getId_nota() {
        return id_nota;
    }

    public int getPrimer_parcial() {
        return primer_parcial;
    }

    public int getSegundo_parcial() {
        return segundo_parcial;
    }

    public int getExamen_final() {
        return examen_final;
    }

    public int getCod_materia() {
        return cod_materia;
    }

    public int getId_estudiante() {
        return id_estudiante;
    }
}
