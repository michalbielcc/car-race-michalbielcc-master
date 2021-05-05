package com.company;

public class Truck extends Vehicle {

    private int breakdownTurnsLeft;

    public Truck() {
        name = String.valueOf(Utils.getRandomNumber(1, 1000));
        speed = 100;
    }

    @Override
    public void moveForAnHour(Race race) {
        switch (breakdownTurnsLeft) {
            case 0: default:
                int roll = Utils.getRandomNumber(1, 20);
                if (roll == 20) {
                    breakdownTurnsLeft += 1;
                    race.setIsThereABrokenTruck(true);
                } else {
                    race.setIsThereABrokenTruck(false);
                    distanceTravelled += 100;
                }
                break;
            case 1:
                breakdownTurnsLeft --;
                race.setIsThereABrokenTruck(true);
                break;
        }
    }
}
