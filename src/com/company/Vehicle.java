package com.company;


import java.util.ArrayList;
import java.util.List;

public abstract class Vehicle {


    protected String name;
    protected int speed;
    protected int distanceTravelled;


    public abstract void moveForAnHour(Race race);
    public String getName() {
        return name;
    }

    public int getDistanceTravelled() {
        return distanceTravelled;
    }

    public int getAverageSpeed() {
        return distanceTravelled / 50;
    }
}
