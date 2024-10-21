/*
 * This class demonstrates the useage of the MrCoxallStack class.
 *
 * @author Ayaat Ahmedou
 * @version 1.0
 * @since 2024-10-15
 */

/**
 * This program uses the MrCoxallStack class to output strings.
 *
 * @null This class does not handle null values.
 */
public final class Main {
    /**
     * Prevent instantiation.
     * Throw an exception IllegalStateException if this ever is called.
     *
     * @throws IllegalStateException if an attempt is made to instantiate
     *     this class.
     *
     * @null this class does not handle null values.
     */
    private Main() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
     * The starting main() function.
     *
     * @param args No args will be used
     */
    public static void main(String[] args) {
        // This function uses the MrCoxallStack class.

        // Creates an instance of MrCoxallStack for fruits.
        final MrCoxallStack fruitStack = new MrCoxallStack();
        fruitStack.pushItem("apple");
        fruitStack.pushItem("banana");
        fruitStack.pushItem("cherry");
        System.out.println("Fruit items: " + fruitStack.showStack());

        // Creates an instance of MrCoxallStack for colors.
        final MrCoxallStack colorStack = new MrCoxallStack();
        colorStack.pushItem("red");
        colorStack.pushItem("green");
        colorStack.pushItem("blue");
        System.out.println("Color items: " + colorStack.showStack());

        // Creates an instance of MrCoxallStack for dog breeds.
        final MrCoxallStack dogStack = new MrCoxallStack();
        dogStack.pushItem("poodle");
        dogStack.pushItem("retriever");
        dogStack.pushItem("beagle");
        System.out.println("Dog items: " + dogStack.showStack());

        System.out.println("\nDone.");
    }
}

