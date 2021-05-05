package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class Race implements Weather {


    private boolean isItRaining;
    private boolean isThereABrokenTruck = false;
    private final List<Vehicle> vehicles = new ArrayList<>();


    public void createVehicles() {
        for (int i = 0; i <10; i++) {
            Vehicle car = new Car();
            Vehicle motorcycle = new Motorcycle(i);
            Vehicle truck = new Truck();
            Collections.addAll(vehicles, car, motorcycle, truck);
        }
    }


    public void simulateRace(Race race) {
        for (int i = 0; i < 50; i ++) {
            isItRaining = Weather.setRaining();
            vehicles.forEach(v -> v.moveForAnHour(race));
        }
    }


    public void printRaceResults() {
        for (Vehicle vehicle: vehicles) {
            System.out.println("pojazd: " + vehicle.getName() +" | Dystans: " + vehicle.getDistanceTravelled() +
                               " | average speed: " + vehicle.getAverageSpeed());
        }
    }

    public String printWinner() {
        String winner = "";
        int distance = 0;
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getDistanceTravelled() > distance) {
                distance = vehicle.getDistanceTravelled();
            }
        }
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getDistanceTravelled() == distance) {
                System.out.println("\n\nThe winner of the race is: " + vehicle.getName() + " with a total distance of: " + vehicle.getDistanceTravelled());
                winner = vehicle.getClass().toString().substring(18);
            }
        }
        return winner;
    }


    public boolean getIsItRaining() {
        return isItRaining;
    }


    public boolean isThereABrokenTruck() {
     return isThereABrokenTruck;
    }


    public void setIsThereABrokenTruck(boolean bool) {
        isThereABrokenTruck = bool;
    }


    public static void main(String[] args)  {

        int car = 0;
        int motor = 0;
        int truck = 0;

        for (int i = 0; i < 1; i++) {
            Race race = new Race();
            race.createVehicles();
            race.simulateRace(race);
            race.printRaceResults();
            switch (race.printWinner()) {
                case "Car":
                    car++;
                    break;
                case "Truck":
                    truck++;
                    break;
                case "Motorcycle":
                    motor++;
                    break;
            }
        }
//        System.out.println("car won:   " + car   + " times\n" +
//                           "truck won: " + truck + " times\n" +
//                           "motor won: " + motor + " times");
    }
}