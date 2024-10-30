/**
 * This is a program using the MrCoxallStack class.
 *
 * By: Ayaat Ahmedou
 * Version: 1.0
 * Since: 2024-10-29
 */

public class Colors {
    public static void main(String[] args) {
        // Creates an instance for fruits.
        MrCoxallStack colorStack = new MrCoxallStack();

        System.out.println("Color items:");
        System.out.println("The size of the stack is: " + colorStack.getSize());
        System.out.println("Is the stack empty? " + colorStack.isEmpty());

        // Add items to the stack
        colorStack.pushedItem("red");
        colorStack.pushedItem("green");
        colorStack.pushedItem("blue");
        System.out.println("Color items: " + colorStack.showStack());

        // Pop the top item
        String topColor = colorStack.popItem();
        System.out.println("Popped color item: " + topColor);
        System.out.println("Color items: " + colorStack.showStack());

        // Check the size and if it's empty again
        System.out.println("The size of the stack is: " + colorStack.getSize());
        System.out.println("Is the stack empty? " + colorStack.isEmpty());

        System.out.println("\nDone.");
    }
}

