/**
 * This is a program using the MrCoxallStack class.
 *
 * By: Ayaat Ahmedou
 * Version: 1.0
 * Since: 2024-10-29
 */

import java.util.List;

public class Fruits {
    public static void main(String[] args) {
        // Creates an instance for fruits.
        MrCoxallStack fruitStack = new MrCoxallStack();

        System.out.println("Fruit items:");
        System.out.println("The size of the stack is: " + fruitStack.getSize());
        System.out.println("Is the stack empty? " + fruitStack.isEmpty());

        // Add items to the stack
        fruitStack.pushedItem("apple");
        fruitStack.pushedItem("banana");
        fruitStack.pushedItem("cherry");
        System.out.println("Fruit items: " + fruitStack.showStack());

        // Pop the top item
        String topFruit = fruitStack.popItem();
        System.out.println("Popped fruit item: " + topFruit);
        System.out.println("Fruit items: " + fruitStack.showStack());

        // Check the size and if it's empty again
        System.out.println("The size of the stack is: " + fruitStack.getSize());
        System.out.println("Is the stack empty? " + fruitStack.isEmpty());

        System.out.println("\nDone.");
    }
}

