/**
 * This is a program using the MrCoxallStack class.
 *
 * <p>This is a new paragraph.
 * By: Ayaat Ahmedou
 * Version: 1.0
 * Since: 2024-10-29
 */
public final class Colors {

    /**
     * Private constructor to prevent instantiation.
     */
    private Colors() {
        // Prevents instantiation.
    }

    /**
     * This colors method runs the program.
     *
     * @param args command line arguments (not used).
     */
    public static void main(String[] args) {
        // Creates an instance for fruits.
        final MrCoxallStack colorStack = new MrCoxallStack();

        System.out.println("Color items:");
        System.out.println("1.0 The size of the stack is: "
                        + colorStack.getSize());
        System.out.println("1.0 Is the stack empty? " + colorStack.isEmpty());

        // Add items to the stack
        colorStack.pushedItem("red");
        colorStack.pushedItem("green");
        colorStack.pushedItem("blue");
        System.out.println("1.0 Color items: " + colorStack.showStack());

        // Pop the top item
        final String topColor = colorStack.popItem();
        System.out.println("Popped color item: " + topColor);
        System.out.println("2.0 Color items: " + colorStack.showStack());

        // Check the size and if it's empty again
        System.out.println("2.0 The size of the stack is: "
                        + colorStack.getSize());
        System.out.println("2.0 Is the stack empty? " + colorStack.isEmpty());

        System.out.println("\nDone.");
    }
}

