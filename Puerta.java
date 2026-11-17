public class Puerta {

    /** Atributo */
    private boolean abierta;

    /** Constructor */
    public Puerta() {
        this.abierta = false; // Una puerta suele empezar cerrada
    }

    // Método abrir()
    public void abrir() {
        this.abierta = true;
    }

    // Método cerrar()
    public void cerrar() {
        this.abierta = false;
    }

    // Método estado()
    public String estado() {
        if (this.abierta) {
            return "Abierta";
        } else {
            return "Cerrada";
        }
    }
}