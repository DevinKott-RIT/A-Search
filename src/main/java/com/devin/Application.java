package main.java.com.devin;

import main.java.com.devin.exceptions.MapCreationException;

public class Application {

    public static void main(String[] args) {
        Map map;
        try {
            map = new Map(4, 6);
            map.printMap();
        } catch (MapCreationException e) {
            e.printStackTrace();
        }
    }

}
