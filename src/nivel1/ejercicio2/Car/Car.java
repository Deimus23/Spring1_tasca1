package nivel1.ejercicio2.Car;

public class Car {
  private static final String brand="Toyota";
  private  static String model;
  private final int power;

    public Car(String model,int power) {
        this.model=model;
        this.power = power;
    }
    public static void brake(){
        System.out.println("The car are braking");
    }
    public void accelerate(){
        System.out.println("The car are accelerating");
    }
}
