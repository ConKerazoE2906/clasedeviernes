public class Accion extends TiposdeVideojuegos{
    int Niveles;
    String Dificultad;
    String Armas;


    public Accion(String accion) {
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

    public String getArmas() {
        return Armas;
    }

    public void setArmas(String armas) {
        Armas = armas;
    }
}
