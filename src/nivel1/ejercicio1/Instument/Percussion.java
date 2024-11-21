package nivel1.ejercicio1.Instument;

public class Percussion extends Instrument {

    public Percussion(String name, int price){

        super(name, price);
    }
    public static void play(){
        System.out.println("A percussion instrument is playing.");
    }
}
