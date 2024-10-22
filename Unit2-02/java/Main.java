/**
 * This is a program using the MrCoxallStack class.
 *
 * By: Ayaat Ahmedou
 * Version: 1.0
 * Since: 2024-10-22
 */

public class Main {
  /**
   * The main method which runs the program.
   *
   * @param args command line arguments (not used).
   */
  public static void main(String[] args) {
    // Creates an instance for fruit.
    MrCoxallStack fruit = new MrCoxallStack();
    fruitStack.pushItem("apple");
    fruitStack.pushItem("banana");
    fruitStack.pushItem("cherry");
    System.out.println("Fruit items: " + fruitStack.showStack());
    String topFruit = fruitStack.popItem();
    System.out.println("Popped fruit item: " + topFruit);
    System.out.println("Fruit items: " + fruitStack.showStack());
    System.out.println();

    //Creates an instance for colors.
    MrCoxallStack color = new MrCoxallStack();
    color.pushItem("red");
    color.pushItem("green");
    color.pushItem("blue");
    System.out.println("Color items: " + color.showStack());
    String topColor = colorStack.popItem();
    System.out.println("Popped color item: " + topColor);
    System.out.println("Dog items: " +colorStack.showStack());
    System.out.println();

    // Creates an instance for dog breeds.
    MrCoxallStack dogStack = new MrCoxallStack();
    dogStack.pushItem("poodle");
    dogStack.pushItem("retriever");
    dogStack.pushItem("beagle");
    System.out.println("Dog items: " + dogStack.showStack());
    String topDog = dogStack.popItem();
    System.out.println("Popped dog item: " + topDog);
    System.out.println("Dog items: " + dogStack.showStack());
    System.out.println();

    System.out.println("\nDone.");

   }
}
