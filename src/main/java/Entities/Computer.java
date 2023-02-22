package Entities;

import AbstractClasses.AbstractElectricUtensil;

public class Computer extends AbstractElectricUtensil {
    public Computer(String name, int powerConsumption) {
        super(name, powerConsumption);
    }

    @Override
    public String toString() {
        return "Computer{" +
                "power consumption =" + getPowerConsumption() +
                ", is plugged in=" + isPluggedIn() +
                '}';
    }
}
