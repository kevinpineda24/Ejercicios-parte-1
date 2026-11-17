public class Termometro{

    /** Atributos */
    private double temperatura;

    // Constructor
    public Termometro() {
        this.temperatura = 0.0; // Inicializamos en 0 por defecto
    }

    // Método subir(grados)
    public void subir(double grados) {
        this.temperatura += grados;
    }

    // Método bajar(grados)
    public void bajar(double grados) {
        this.temperatura -= grados;
    }

    // Método mostrarTemperatura()
    // El diagrama dice que devuelve la temperatura, así que retornamos un double.
    public double mostrarTemperatura() {
        return this.temperatura;
    }
}