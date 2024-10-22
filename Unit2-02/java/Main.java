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
    fruit.pushItem("apple");
    fruit.pushItem("banana");
    fruit.pushItem("cherry");
    System.out.println("Fruit items: " + fruit.showStack());
    String topFruit = fruit.popItem();
    System.out.println("Popped fruit item: " + topFruit);
    System.out.println("Fruit items: " + fruit.showStack());
    System.out.println();

    //Creates an instance for colors.
    MrCoxallStack color = new MrCoxallStack();
    color.pushItem("red");
    color.pushItem("green");
    color.pushItem("blue");
    System.out.println("Color items: " + color.showStack());
    String topColor = color.popItem();
    System.out.println("Popped color item: " + topColor);
    System.out.println("Dog items: " +color.showStack());
    System.out.println();

    // Creates an instance for dog breeds.
    MrCoxallStack dog = new MrCoxallStack();
    dog.pushItem("poodle");
    dog.pushItem("retriever");
    dog.pushItem("beagle");
    System.out.println("Dog items: " + dog.showStack());
    String topDog = dog.popItem();
    System.out.println("Popped dog item: " + topDog);
    System.out.println("Dog items: " + dog.showStack());
    System.out.println();

    System.out.println("\nDone.");

   }
}
