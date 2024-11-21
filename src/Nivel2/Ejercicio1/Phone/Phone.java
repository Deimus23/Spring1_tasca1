package Nivel2.Ejercicio1.Phone;

public class Phone {
    private String brand;
    private String model;
    public Phone(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }
    public static void call(){
        int number=123456789;
        System.out.println("You having a call incoming");
        System.out.println(number);
    }
}
