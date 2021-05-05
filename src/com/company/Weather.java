package com.company;

public interface Weather {


    static boolean setRaining() {
        return Utils.getRandomNumber(1, 4) >= 4;
    }
}
