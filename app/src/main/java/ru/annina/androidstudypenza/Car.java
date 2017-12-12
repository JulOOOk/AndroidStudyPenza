package ru.annina.androidstudypenza;

/**
 * Created by Yulia on 12.12.2017.
 */

public abstract class Car {

    private int enginePower;

    public abstract String getBrand();
    public abstract float getAmountFuel();
    public abstract String getModel();

    public int getEnginePower() {
        return enginePower;
    }

    public void setEnginePower(int enginePower) {
        this.enginePower = enginePower;
    }
}
