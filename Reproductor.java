public class Reproductor {

    private String cancion;
    private boolean reproduccion;

    /** Constructor */
    public Reproductor() {
        this.cancion = "";
        this.reproduccion = false;
    }

    public void reproducir() {
        this.cancion = "Caperuza";
        this.reproduccion = true;
    }

    public void pausar() {
        this.reproduccion = false;
    }

    public String estado() {
        return this.reproduccion ? "Reproduciendo" : "Pausada";
    }

    public String getCancion() {
        return this.cancion;
    }
}