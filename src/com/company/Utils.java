package com.company;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public interface Utils {

    static int getRandomNumber(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min) + min + 1;
    }

    static String getRandomCarName() {
        String[] names = readFile("src/com/company/resources/car names.txt");
        return names[getRandomNumber(0,names.length - 1)] + " " + names[getRandomNumber(0,names.length - 1)];
    }


    static String[] readFile(String path) {
        File text = new File(path);
        List<String> names = new ArrayList<>();
        try {
            Scanner sc = new Scanner(text);
            while(sc.hasNextLine()) {
                String line = sc.nextLine();
                names.add(line);
            }
        }
        catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
        return names.toArray(new String[0]);
    }
}
