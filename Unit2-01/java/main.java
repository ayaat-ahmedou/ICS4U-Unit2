/*
 * This class demonstrates the useage of the MrCoxallStack class.
 *
 * @author Ayaat Ahmedou
 * @version 1.0
 * @since 2024-10-15
 */

public class main {

  public static void main(String[] args) {
    // This function uses the MrCoxallStack class.

    // Creates an instance of MrCoxallStack for fruits.
    MrCoxallStack fruitStack = new MrCoxallStack();
    fruitStack.pushItem("apple");
    fruitStack.pushItem("banana");
    fruitStack.pushItem("cherry");
    System.out.println("Fruit items: " + fruitStack.showStack());

    // Creates an instance of MrCoxallStack for colors.
    MrCoxallStack colorStack = new MrCoxallStack();
    colorStack.pushItem("red");
    colorStack.pushItem("green");
    colorStack.pushItem("blue");
    System.out.println("Color items: " + colorStack.showStack());

    // Creates an instance of MrCoxallStack for dog breeds.
    MrCoxallStack dogStack = new MrCoxallStack();
    dogStack.pushItem("poodle");
    dogStack.pushItem("retriever");
    dogStack.pushItem("beagle");
    System.out.println("Dog items: " + dogStack.showStack());

    System.out.println("\nDone.");
  }
}

