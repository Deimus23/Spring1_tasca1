package ejercicio1_nivel1.main;

import ejercicio1_nivel1.Instument.Percussion;
import ejercicio1_nivel1.Instument.StringInstrument;
import ejercicio1_nivel1.Instument.Wind;

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