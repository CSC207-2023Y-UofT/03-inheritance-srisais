/*
 * This file defines an abstract class named Bag.
 * In this exercise, you will be writing a larger class according to
 * the TODOs we have left you. You may find the readings in chapter
 * 1. Introduction to Java helpful.
 */

public abstract class Bag {
    /*
     * DONE: Create the following private instance variables
     *       - a String named color
     *       - an int named numberOfContents
     *       - an int named capacity
     *       - an array of Strings named contents
     */

    /**
     * The colo(u)r of the <code>Bag</code> instance.
     */
    private String color;
    /**
     * The number of contents in the <code>Bag</code> instance.
     */
    private int numberOfContents;
    /**
     * The maximum number of contents the <code>Bag</code> instance can hold.
     */
    private int capacity;
    /**
     * An array of contents that are in the <code>Bag</code> instance.
     */
    private String[] contents;



    /*
     * DONE: Create a constructor that takes two arguments:
     *       - a String representing the Bag's colour
     *       - an int representing the Bag's capacity
     *
     * The other attributes (private instance variables) should
     * be empty (e.g. numberOfContents is 0 and an empty String array for
     * its contents.)
     */

    /**
     * A constructor for an abstract <code>Bag</code> instance.
     * @param color the <code>Bag</code> instance's color
     * @param capacity <code>Bag</code> instance's capacity
     */
    public Bag(String color, int capacity) {
        this.color = color;
        this.capacity = capacity;
        this.numberOfContents = 0;
        this.contents = new String[capacity];
    }



    /*
     * DONE: Create a variety of 'getter' functions.
     *       These should be named:
     *           - getColor
     *           - getNumberOfContents
     *           - getCapacity
     */
     // I used IntelliJ's generate functionality to do this lol

    public String getColor() {
        return color;
    }

    public int getNumberOfContents() {
        return numberOfContents;
    }

    public int getCapacity() {
        return capacity;
    }

    /*
     * DONE: Create a setter function called setColor which sets the
     *       color of this bag to the given color.
     */
     // I used IntelliJ's generate setter functionality for this lol

    public void setColor(String color) {
        this.color = color;
    }

    /*
     * DONE: Create a method called addItem that takes in a String
     *       representing an item in the Bag.
     *       The item is added into the Bag if the number of items
     *       in the bag is < the capacity of the Bag.
     *       Remember to modify numberOfContents accordingly.
     *
     *       This method should return true if the item was added
     *       and false otherwise.
     */

    /**
     * Adds item <code>item</code> into the <code>Bag</code> instance
     * if there exists such capacity.
     *
     * Returns a boolean to indicate whether or not the item was
     * added to the <code>Bag</code> instance.
     * @param item The item to add to the <code>Bag</code> instance.
     * @return whether or not <code>item</code> was added to <code>Bag</code> instance.
     */
    public boolean addItem(String item) {
        boolean itemGotAdded = false;

        if (this.numberOfContents < this.capacity) {
            this.contents[numberOfContents] = item;
            this.numberOfContents++;
            itemGotAdded = true;
        }

        return itemGotAdded;
    }




    /**
     * DONE: Create a method called popItem that returns a String.
     *       The string should be the last item added to this Bag
     *       and the item should be removed from this Bag.
     *       Remember to modify numberOfContents accordingly.
     *
     * If there are no items in this Bag, return null.
     *
     * @return The last item from the <code>Bag</code> instance.
     */
    /**
     * Removes the last item from the <code>Bag</code> instance
     * and returns its value.
     * @return
     */
    public String popItem() {
        String poppedItem = null;

        if (this.numberOfContents > 0) {
            poppedItem = this.contents[numberOfContents - 1];
            this.contents[numberOfContents - 1] = null;
            numberOfContents--;
        }
        return poppedItem;
    }




    /**
     * Increase this bag's capacity by n.
     *
     * @param n the amount to increase this Bag's capacity by
     */
    public void increaseCapacity(int n) {
        this.capacity += n;

    }

    /**
     * Return the details of this Bag.
     * This method requires you to have created the private
     * instance variables mentioned above.
     *
     * @return
     */
    @Override
    public String toString() {
        return this.color + " Bag (" + this.numberOfContents + " / " +
                this.capacity + ")";
    }

    /*
     * Below we have defined an abstract method.
     * This method takes no arguments and does not return anything.
     * It increases the capacity of this Bag.
     *
     * You will need to implement this method in
     * HandBag.java and CrossbodyBag.java.
     *
     * We recommend you look at HandBag.java first.
     */
    public abstract void enhance();
}