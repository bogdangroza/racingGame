package org.fasttrackit;

public class Vehicle {
    // Constata: daca adaugam "final"(nu mai pot fi schimbate, sunt finale) variabila constnta se scrie cu litera mare.
    private String name;
    private String color;


    // Metoda
    public double accelerate(double speed) {

        System.out.println(speed);

        return 10.1;
    }
    //Metod Overloading
    public double accelerate(double speed, double time) {

        return 20;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name.trim();
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    //Override

    @Override
    public String toString() {
        return "Vehicle{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
