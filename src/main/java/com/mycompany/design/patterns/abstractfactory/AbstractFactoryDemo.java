/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.design.patterns.abstractfactory;

/**
 *
 * @author channyeintun
 */
abstract class Garden {

    public abstract Plant getCenter();

    public abstract Plant getBorder();

    public abstract Plant getShade();
}

class Plant {

    private String name;

    public Plant(String pname) {
        name = pname; //save name
    }

    public String getName() {
        return name;
    }
}

class VegieGarden extends Garden {

    @Override
    public Plant getShade() {
        return new Plant("Broccoli");
    }

    @Override
    public Plant getCenter() {
        return new Plant("Corn");
    }

    @Override
    public Plant getBorder() {
        return new Plant("Peas");
    }
}

class AnnualGarden extends Garden {

    @Override
    public Plant getShade() {
        return new Plant("Some plant");
    }

    @Override
    public Plant getCenter() {
        return new Plant("Mango");
    }

    @Override
    public Plant getBorder() {
        return new Plant("annual border plant");
    }
}

class PerennialGarden extends Garden {

    @Override
    public Plant getShade() {
        return new Plant("Apple");
    }

    @Override
    public Plant getCenter() {
        return new Plant("Banana");
    }

    @Override
    public Plant getBorder() {
        return new Plant("Orange");
    }
}

class GardenMaker {
//Abstract Factory which returns one of three gardens

    private Garden gd;

    public Garden getGarden(String gtype) {
        gd = new VegieGarden(); //default 
        if (gtype.equals("Perennial")) {
            gd = new PerennialGarden();
        }
        if (gtype.equals("Annual")) {
            gd = new AnnualGarden();
        }
        return gd;
    }
}

public class AbstractFactoryDemo {
    public static void main(String []args){
        GardenMaker gardenMaker=new GardenMaker();
        Garden garden=gardenMaker.getGarden("Annual");
        Plant plant=garden.getCenter();
        System.out.println(plant.getName());
    }
}
