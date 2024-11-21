package Nivel1.Ejercicio2.Main;

import Nivel1.Ejercicio2.Car.Car;

public class Main {

    public static void main(String[]args) {
        Car car = new Car("yaris", 125);
        Car.brake();
        car.accelerate();
    }
}


