public class Lampara{

    /** Una lámpara que se puede encender y apagar */

    /** Atributos */
    private boolean encendida;

    /** Constructor */
    public Lampara(){
        this.encendida = false;
    }

    /** Método para encender la lámpara */
    public void encender(){
        this.encendida = true;
    }

    /** Método para apagar la lámpara */
    public void apagar(){
        this.encendida = false;
    }

    /** Método para que devuelva el estado actual */
    public String estado(){
        return this.encendida ? "Encendida" : "Apagada";
    }

}