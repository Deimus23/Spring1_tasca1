package nivel1.ejercicio2.main;

import nivel1.ejercicio2.Car.Car;

public class main {

    public static void main(String[]args) {
        Car car = new Car("yaris", 125);
        Car.brake();
        car.accelerate();
    }
}


