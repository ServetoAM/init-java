package fr.m2i;

import static java.lang.Math.abs;

public class Car extends fr.m2i.Vehicle {
    public Car() {
        super(50, 50, 7, 0, 5);
    }

    public Car(float gasCapacity, int passengerCapacity) {
        super(abs(gasCapacity), abs(gasCapacity), 7, 0, abs(passengerCapacity));
    }

    @Override
    public void fixEngine() {

    }

    @Override
    public void accelerate() {
        if(speed <= 200){
        speed+=20;
    } else {
            speed = 220;
        }
    }

    @Override
    public void brake() {
        if (speed >= 20) {
            speed -= 20;
        }
        else{
            speed -= speed; // speed = 0;
        }
    }
}

