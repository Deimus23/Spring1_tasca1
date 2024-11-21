package nivel1.ejercicio1.Instument;

public class Wind extends Instrument {
    public Wind(String name, int price){
    super(name, price);
}
    public static void play(){
        System.out.println("A wind instrument is playing.");
    }
}

