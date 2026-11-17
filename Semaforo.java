public class Semaforo{

    /** Atributos */
    private String color;

    /** Constructor */
    public Semaforo(){
        this.color = "verde";
    }

    /** Cambair el color manualmente */
    public void setcolor(String nuevoColor){
        this.color = nuevoColor;
    }

    /** Avanza al siguiente color (rojo -> amarillo -> verde) */
    public void cambiarColor(){
        if (this.color.equals("rojo")){
            this.color = "amarillo";
        }else if (this.color.equals("amarillo")){
            this.color = "rojo";
        }else if (this.color.equals("verde")){
            this.color = "amarillo";
        }
    }

    /** Devuelce el estado actual */
    public String estado(){
        return this.color;
    }
}