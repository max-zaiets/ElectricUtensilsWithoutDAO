package Entities;

import AbstractClasses.AbstractElectricUtensil;

public class Lamp extends AbstractElectricUtensil {


    public Lamp(String name, int powerConsumption) {
        super(name, powerConsumption);
    }

    @Override
    public String toString() {
        return "Lamp{" +
                "power consumption =" + getPowerConsumption() +
                ", is plugged in=" + isPluggedIn() +
                '}';
    }
}
