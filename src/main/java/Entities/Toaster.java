package Entities;

import AbstractClasses.AbstractElectricUtensil;

public class Toaster extends AbstractElectricUtensil {

    public Toaster(String name, int powerConsumption) {
        super(name, powerConsumption);
    }

    @Override
    public String toString() {
        return "Toaster{" +
                "power consumption =" + getPowerConsumption() +
                ", is plugged in=" + isPluggedIn() +
                '}';
    }

}
