package fr.m2i;

public abstract class Vehicle {

    protected float currentGas;
    protected float gasCapacity;

    protected float gasConsumption;
    protected int speed;
    protected int passengerCapacity;


    public Vehicle(float currentGas, float gasCapacity, float gasConsumption, int speed, int passengerCapacity) {
        this.currentGas = currentGas;
        this.gasCapacity = gasCapacity;
        this.gasConsumption = gasConsumption;
        this.speed = speed;
        this.passengerCapacity = passengerCapacity;
    }

    public abstract void fixEngine();

    public void refuel() {
        currentGas = gasCapacity;
    }

    public float drive() throws Exception {
        float consumption = (gasConsumption * speed) / 100;

        if (currentGas < consumption) {
            throw new Exception("Pas assez d'essence !");
        }

        accelerate();

        currentGas -= consumption;
        if(currentGas < 0){
            currentGas = 0;
        }
        System.out.println(String.format("Le véhicule a consommé : %.2f L", consumption));
        return consumption;
    }

    public abstract void accelerate();

    public abstract void brake();

    public float getCurrentGas() {
        return currentGas;
    }

    public void setCurrentGas(float currentGas) {
        this.currentGas = currentGas;
    }

    public float getGasCapacity() {
        return gasCapacity;
    }

    public void setGasCapacity(float gasCapacity) {
        this.gasCapacity = gasCapacity;
    }

    public float getGasConsumption() {
        return gasConsumption;
    }

    public void setGasConsumption(float gasConsumption) {
        this.gasConsumption = gasConsumption;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public void setPassengerCapacity(int passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }
}