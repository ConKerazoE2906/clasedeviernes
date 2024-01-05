public class Carreras extends  TiposdeVideojuegos{
    int Niveles;
    String Personajes;
    String Escenarios;
    String Dificultad;

    public Carreras(String accion, String puzzle, String carreras) {
        super(accion, puzzle, carreras);
    }

    public int getNiveles() {
        return Niveles;
    }

    public void setNiveles(int niveles) {
        Niveles = niveles;
    }

    public String getPersonajes() {
        return Personajes;
    }

    public void setPersonajes(String personajes) {
        Personajes = personajes;
    }

    public String getEscenarios() {
        return Escenarios;
    }

    public void setEscenarios(String escenarios) {
        Escenarios = escenarios;
    }

    public String getDificultad() {
        return Dificultad;
    }

    public void setDificultad(String dificultad) {
        Dificultad = dificultad;
    }
}
