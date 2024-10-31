/**
 * This is a program using the MrCoxallStack class.
 *
 * <p>This is the start of a new paragraph.
 * By: Ayaat Ahmedou
 * Version: 1.0
 * Since: 2024-10-29
 */
public final class Dogs {

    /**
     * Private constructor to prevent instantiation.
     */
    private Dogs() {
            // Prevents instantiation.
    }

    /**
     * The Dogs method is to run this program.
     *
     * @param args command line arguments (not used).
     */
    public static void main(String[] args) {
        // Creates an instance for fruits.
        final MrCoxallStack dogStack = new MrCoxallStack();

        System.out.println("Dog items:");
        System.out.println("1.0The size of the stack is: "
                        + dogStack.getSize());
        System.out.println("1.0Is the stack empty? " + dogStack.isEmpty());

        // Add items to the stack
        dogStack.pushedItem("poodle");
        dogStack.pushedItem("retriever");
        dogStack.pushedItem("beagle");
        System.out.println("1.0 Dog items: " + dogStack.showStack());

        // Pop the top item
        final String topDog = dogStack.popItem();
        System.out.println("Popped dog item: " + topDog);
        System.out.println("2.0 Dog items: " + dogStack.showStack());

        // Check the size and if it's empty again
        System.out.println("2.0 The size of the stack is: "
                        + dogStack.getSize());
        System.out.println("2.0 Is the stack empty? " + dogStack.isEmpty());

        System.out.println("\nDone.");
    }
}
