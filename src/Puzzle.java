public class Puzzle extends TiposdeVideojuegos{
    int Niveles;
    String Dificultad;
    String Misiones;

    public Puzzle(String accion, String puzzle, String carreras) {
        super(accion, puzzle, carreras);
    }

    public int getNiveles() {
        return Niveles;
    }

    public void setNiveles(int niveles) {
        Niveles = niveles;
    }

    public String getDificultad() {
        return Dificultad;
    }

    public void setDificultad(String dificultad) {
        Dificultad = dificultad;
    }

    public String getMisiones() {
        return Misiones;
    }

    public void setMisiones(String misiones) {
        Misiones = misiones;
    }
}
