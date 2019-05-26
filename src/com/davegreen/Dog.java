package com.davegreen;

/**
 * Created by daveg on 14/06/2017.
 */
public class Dog extends Animal         // This is the extended(Inherited) class from the Animal class
{                                       // The constructor below calls and initializes all of the fields
    private int eyes;                   // that are relevant not only to what is defined as a field in the Animal
    private int legs;                   // class but more specifically the dog class also.
    private int tail;                   // The brain and body fields have been removed from the parameters in the constructor
    private int teeth;                  // but are still initialized in the super in order to be more efficient with the code
    private String coat;                // The value of 1 just simply states that yes all dogs have a body and yes
                                        // all dogs have a brain, this can also be seen in the fish class.

    public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat)
    {
        super(name, 1, 1, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    private void chew()
    {
        System.out.println("Dog.chew() called");
    }

    @Override
    public void eat()
    {
        System.out.println("Dog.eat() called");
        chew();
        super.eat();
    }

    public void walk()
    {
        System.out.println("Dog.walk() called");
        super.move(5);
    }

    public void run()
    {
        System.out.println("Dog.run() called");
        move(10);
    }

    public void moveLegs(int speed)
    {
        System.out.println("Dog.moveLegs() called");
    }

    @Override
    public void move(int speed)
    {
        System.out.println("Dog.move() called");
        moveLegs(speed);
        super.move(speed);
    }
}
