package main.java.com.devin;

import main.java.com.devin.exceptions.MapCreationException;

public class Map {

    private final int MINIMUM_BASE_LENGTH = 1;
    private final int MINIMUM_HEIGHT_LENGTH = 1;

    private final char MAP_WALL = '#';
    private final char MAP_EMPTY = '-';

    private int baseLength;
    private int heightLength;

    private char[][] map;

    public Map(int base, int height) throws MapCreationException {
        if (base < MINIMUM_BASE_LENGTH) {
            throw new MapCreationException("Invalid base length.");
        } else if (height < MINIMUM_HEIGHT_LENGTH) {
            throw new MapCreationException("Invalid height length.");
        }

        this.baseLength = base;
        this.heightLength = height;
    }

    private char[][] createEmptyMap() {

    }

    public void printMap() {
        final int top = baseLength + 2;
        final int sides = heightLength;

        for (int i = 0; i < top; i++) {
            System.out.printf("%c", MAP_WALL);
        }
        System.out.println();

        for (int i = 0; i < sides; i++) {
            System.out.printf("%c", MAP_WALL);
            for (int j = 0; j < baseLength; j++) {
                System.out.printf("%c", MAP_EMPTY);
            }
            System.out.printf("%c\n", MAP_WALL);
        }

        for (int i = 0; i < top; i++) {
            System.out.printf("%c", MAP_WALL);
        }
        System.out.println();
    }
}