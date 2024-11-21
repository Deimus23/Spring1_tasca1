package nivel1.ejercicio1.main;

import nivel1.ejercicio1.Instument.Percussion;
import nivel1.ejercicio1.Instument.StringInstrument;
import nivel1.ejercicio1.Instument.Wind;

public class Main {
    public static void main(String[] args) {
        Percussion drum = new Percussion("drum",45);
        Wind flute=new Wind("flute",10);
        StringInstrument guitar=new StringInstrument("guitar",200);
        drum.play();
        flute.play();
        guitar.play();
    }

}