/**
 * This is a program using the MrCoxallStack class.
 *
 * <p>This is a new paragraph.
 * By: Ayaat Ahmedou
 * Version: 1.0
 * Since: 2024-10-29
 */
public final class Fruits {

    /**
     * Private constructor to prevent instantiation.
     */
    private Fruits() {
        // Prevents instantiation
    }

    /**
     * The main method to which runs this fruits program.
     *
     * @param args command line arguments (not used).
     */
    public static void main(String[] args) {
        // Creates an instance for fruits.
        final MrCoxallStack fruitStack = new MrCoxallStack();

        System.out.println("Fruit items:");
        System.out.println("1.0 The size of the stack is: "
                        + fruitStack.getSize());
        System.out.println("1.0 Is the stack empty? " + fruitStack.isEmpty());

        // Add items to the stack
        fruitStack.pushedItem("apple");
        fruitStack.pushedItem("banana");
        fruitStack.pushedItem("cherry");
        System.out.println("1.0 Fruit items: " + fruitStack.showStack());

        // Pop the top item
        final String topFruit = fruitStack.popItem();
        System.out.println("Popped fruit item: " + topFruit);
        System.out.println("2.0 Fruit items: " + fruitStack.showStack());

        // Check the size and if it's empty again
        System.out.println("2.0 The size of the stack is: "
                        + fruitStack.getSize());
        System.out.println("2.0 Is the stack empty? " + fruitStack.isEmpty());

        System.out.println("\nDone.");
    }
}

