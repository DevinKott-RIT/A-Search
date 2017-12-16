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
        this.map = createEmptyMap();
    }

    /**
     * Creates an empty map full of EMPTY_MAP characters.
     *
     * @return emptyMap     a matrix of chars containing map icons
     */
    private char[][] createEmptyMap() {
        char[][] emptyMap = new char[heightLength][baseLength];
        for (int i = 0; i < heightLength; i++) {
            for (int j = 0; j < baseLength; j++) {
                emptyMap[i][j] = MAP_EMPTY;
            }
        }
        return emptyMap;
    }

    /**
     * Prints out the view of the map.
     */
    public void printMap() {
        for (int i = 0; i < baseLength + 2; i++) {
            System.out.printf("%c", MAP_WALL);
        }
        System.out.println();

        for (int i = 0; i < heightLength; i++) {
            System.out.printf("%c", MAP_WALL);
            for (int j = 0; j < baseLength; j++) {
                System.out.printf("%c", map[i][j]);
            }
            System.out.printf("%c\n", MAP_WALL);
        }

        for (int i = 0; i < baseLength + 2; i++) {
            System.out.printf("%c", MAP_WALL);
        }
        System.out.println();
    }
}