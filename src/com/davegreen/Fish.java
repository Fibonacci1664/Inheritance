package com.davegreen;

/**
 * Created by daveg on 14/06/2017.
 */
public class Fish extends Animal
{
    private int gills;
    private int eyes;
    private int fins;

    public Fish(String name, int size, int weight, int gills, int eyes, int fins)
    {
        super(name, 1, 1, size, weight);
        this.gills = gills;
        this.eyes = eyes;
        this.fins = fins;
    }

    private void rest()
    {

    }

    private void moveMuscles()
    {

    }

    private void moveBackFin()
    {

    }

    private void swim(int speed)        // The swim method would incorporate the other methods as shown.
    {
        moveMuscles();
        moveBackFin();
        super.move(speed);
    }
}
