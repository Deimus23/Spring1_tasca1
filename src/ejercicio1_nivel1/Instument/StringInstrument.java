package ejercicio1_nivel1.Instument;

public class StringInstrument extends Instrument {

        public StringInstrument(String name, int price){
            super(name, price);
        }
        public static void play(){
            System.out.println("A string instrument is playing.");
        }
}
