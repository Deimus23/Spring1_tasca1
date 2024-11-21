package Nivel2.Ejercicio1.Main;

import Nivel2.Ejercicio1.Phone.Smartphone;

public class Main {
    public static void main (String[]args){
        Smartphone telephone = new Smartphone("Xiaomi","Redmi Note 10");
        telephone.camera();
        telephone.clock();
        telephone.call();
    }
}
