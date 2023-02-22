package application;

import AbstractClasses.AbstractElectricUtensil;
import Entities.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {


        List<AbstractElectricUtensil> list = new ArrayList<>();

        Computer computer = new Computer("computer", 100);
        Dryer dryer = new Dryer("dryer", 40);
        Lamp lamp = new Lamp("lamp", 20);
        Toaster toaster = new Toaster("toaster", 10);

        list.add(computer);
        list.add(dryer);
        list.add(lamp);
        list.add(toaster);

        System.out.println("\u001B[33m" + "All electric appliances in the house:" + "\u001B[0m");
        for(AbstractElectricUtensil a : list) System.out.println(a);

        System.out.println("\u001B[33m" + "Turning on some devices..." + "\u001B[0m");

        computer.plugIn();
        lamp.plugIn();
        toaster.plugIn();

        int totalPowerCons = 0;

        for (AbstractElectricUtensil a : list) {
            if(a.isPluggedIn()){
                totalPowerCons += a.getPowerConsumption();
            }
        }

        System.out.println("\u001B[33m" + "Total power consumption of active devices is:"+ totalPowerCons + "\u001B[0m");


        System.out.println("\u001B[33m" + "Sorted by power consumption:" + "\u001B[0m");
        list.sort(Comparator.comparingInt(AbstractElectricUtensil::getPowerConsumption));
        for (AbstractElectricUtensil a : list){
            System.out.println(a);
        }

        System.out.println((char) 27 + "[34m" + "\nElectrical appliances with a power of more than 20 W: " + (char) 27 + "[38m");
        for (AbstractElectricUtensil a : list) {
            if (a.getPowerConsumption() > 20){
                System.out.println(a);
            }
        }

    }
}