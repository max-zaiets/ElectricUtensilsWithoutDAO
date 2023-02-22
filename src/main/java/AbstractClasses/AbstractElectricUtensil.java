package AbstractClasses;

import Interfaces.Powerable;

public abstract class AbstractElectricUtensil implements Powerable {
    private String name;
    private int powerConsumption;
    private boolean isPluggedIn = false;

    public AbstractElectricUtensil(String name, int powerConsumption) {
        this.name = name;
        this.powerConsumption = powerConsumption;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(int powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public boolean isPluggedIn() {
        return isPluggedIn;
    }

    @Override
    public String toString() {
        return "AbstractElectricUtensil{" +
                "name='" + name + '\'' +
                ", powerConsumption=" + powerConsumption +
                ", isPluggedIn=" + isPluggedIn +
                '}';
    }

    @Override
    public void plugIn(){
        System.out.println("The device " + this.name + " is plugged in");
        this.isPluggedIn = true;
    }

    @Override
    public void unplug(){
        System.out.println("The device " + this.name + " is unplugged");
        this.isPluggedIn = false;
    }
}
