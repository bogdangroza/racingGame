package org.fasttrackit;

public class AutoVehicle extends Vehicle {

    private double mileage;
    private double fuelLevel;
    private Engine engine;

    // Constructor cu parametru engine(sa aiba cel putin un motor)
    public AutoVehicle(Engine engine) {
        this.engine = engine;

        //System.out.println("Custom constructor called.");
    }

    //Constructor Overloading(putem sa avem mai multi constructorii intr-o clasa cu lista de parametri diferite) fara parametru
    public AutoVehicle() {
        this(new Engine());
    }


    public double getMileage() {
        return mileage;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    public double getFuelLevel() {
        return fuelLevel;
    }

    public void setFuelLevel(double fuelLevel) {
        this.fuelLevel = fuelLevel;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
}

