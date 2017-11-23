package org.fasttrackit;

public class Car extends AutoVehicle {

    private int doorCount;
    // Alt + L


    public Car(Engine engine) {
        super(engine);
    }


    // Alt + Insert



    public int getDoorCount() {
        return doorCount;
    }

    public void setDoorCount(int doorCount) {
        this.doorCount = doorCount;
    }
}
