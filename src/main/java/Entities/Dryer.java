package Entities;

import AbstractClasses.AbstractElectricUtensil;

public class Dryer extends AbstractElectricUtensil {

    public Dryer(String name, int powerConsumption) {
        super(name, powerConsumption);
    }

    @Override
    public String toString() {
        return "Dryer{" +
                "power consumption =" + getPowerConsumption() +
                ", is plugged in=" + isPluggedIn() +
                '}';
    }

}
