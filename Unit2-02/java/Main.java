/**
 * This is a program using the MrCoxallStack class.
 * <p>
 * By:    Ayaat Ahmedou
 * Version: 1.0
 * Since: 2024-10-22
 */

public class Main {
    /**
     * Prevent instantiation.
     * Throw an IllegalStateException if this is ever called.
     *
     * @throws IllegalStateException if an attempt is made to instantiate
     *      this class.
     *
     * @null this class does not handle null values.
     */
    private Main() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
     * The main method which runs the program.
     *
     * @param args command line arguments (not used).
     */
    public static void main(String[] args) {
        // Creates an instance for fruit.
        final MrCoxallStack fruit = new MrCoxallStack();
        fruit.pushedItem("apple");
        fruit.pushedItem("banana");
        fruit.pushedItem("cherry");
        System.out.println("Fruit items: " + fruit.showStack());
        final String topFruit = fruit.popItem();
        System.out.println("Popped fruit item: " + topFruit);
        System.out.println("Fruit items: " + fruit.showStack());
        System.out.println();

        // Creates an instance for colors.
        final MrCoxallStack color = new MrCoxallStack();
        color.pushedItem("red");
        color.pushedItem("green");
        color.pushedItem("blue");
        System.out.println("Color items: " + color.showStack());
        final String topColor = color.popItem();
        System.out.println("Popped color item: " + topColor);
        System.out.println("Color items: " + color.showStack());
        System.out.println();

        // Creates an instance for dog breeds.
        final MrCoxallStack dog = new MrCoxallStack();
        dog.pushedItem("poodle");
        dog.pushedItem("retriever");
        dog.pushedItem("beagle");
        System.out.println("Dog items: " + dog.showStack());
        final String topDog = dog.popItem();
        System.out.println("Popped dog item: " + topDog);
        System.out.println("Dog items: " + dog.showStack());
        System.out.println();

        System.out.println("\nDone.");

    }
}
