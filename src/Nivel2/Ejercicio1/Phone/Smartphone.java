package Nivel2.Ejercicio1.Phone;

public class Smartphone extends Phone{

    public Smartphone(String brand, String model) {
        super(brand, model);
    }
    public static void camera(){
        Camera cam =new Camera();
        cam.photograph();
    }
    public static void clock(){
        Clock clock=new Clock();
        clock.alarm();
    }


}
