package com.company;

public class Motorcycle extends Vehicle {

    public Motorcycle(int number) {
        name = "Motorcycle" + number;
        speed = 106;
    }

    @Override
    public void moveForAnHour(Race race) {
        if (race.getIsItRaining()) {
            distanceTravelled -= Utils.getRandomNumber(5, 52);
        }
        distanceTravelled += speed;
    }
}
