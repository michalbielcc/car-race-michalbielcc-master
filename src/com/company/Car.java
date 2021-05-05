package com.company;

import java.util.ArrayList;
import java.util.List;

public class Car extends Vehicle {


    public Car() {
        name = Utils.getRandomCarName();
        speed = Utils.getRandomNumber(82, 102);
    }

    public void moveForAnHour(Race race) {
        if (race.isThereABrokenTruck()) {
            distanceTravelled += 65;
        } else {
            distanceTravelled += speed;
        }
    }
}
