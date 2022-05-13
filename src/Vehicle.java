public abstract class Vehicle {
    protected float currentGas;
    protected float gasCapacity;
    protected float gasConsumption;

    protected int speed;

    protected int passengerCapacity;


    public float getCurrentGas() {
        return currentGas;
    }

    public float getGasCapacity() {
        return gasCapacity;
    }

    public float getGasConsumption() {
        return gasConsumption;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setPassengerCapacity(int passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }
}