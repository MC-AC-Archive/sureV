package me.levansj01.verus.compat;

public enum Direction {

    WEST("WEST", 4),
    EAST("EAST", 5), 
    SOUTH("SOUTH", 3), 
    NORTH("NORTH", 2), 
    UP("UP", 1), 
    DOWN("DOWN", 0);

    private final String name;
    private final int id;

    Direction(final String s, final int n) {
        this.name = s;
        this.id = n;
    }

    public String getName() {
        return this.name;
    }

    public int getId() {
        return this.id;
    }
}
