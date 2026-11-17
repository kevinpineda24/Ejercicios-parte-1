public class Main{

    public static void main(String[] args) {
        // val t = Termometro()
        Termometro t = new Termometro();

        // t.subir(5.0)
        t.subir(5.0);

        // t.bajar(2.0)
        t.bajar(2.0);

        // print(t.mostrarTemperatura()) // 3.0
        System.out.println(t.mostrarTemperatura()); 
    }
}