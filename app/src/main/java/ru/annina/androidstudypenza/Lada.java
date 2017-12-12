package ru.annina.androidstudypenza;

/**
 * Created by Yulia on 12.12.2017.
 */

public class Lada extends Car {

    @Override
    public String getBrand() {
        return "Lada";
    }

    @Override
    public float getAmountFuel() {
        System.out.print("Расчет топлива: ");
        return 0;
    }

    @Override
    public String getModel() {
        return null;
    }
}
