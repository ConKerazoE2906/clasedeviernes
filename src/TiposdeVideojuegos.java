public class TiposdeVideojuegos {
    String Genero;

    public TiposdeVideojuegos(String accion, String puzzle, String carreras) {
        Accion = accion;
        Puzzle = puzzle;
        Carreras = carreras;
    }

    public String getAccion() {
        return Accion;
    }

    public void setAccion(String accion) {
        Accion = accion;
    }

    public String getPuzzle() {
        return Puzzle;
    }

    public void setPuzzle(String puzzle) {
        Puzzle = puzzle;
    }

    public String getCarreras() {
        return Carreras;
    }

    public void setCarreras(String carreras) {
        Carreras = carreras;
    }
}
