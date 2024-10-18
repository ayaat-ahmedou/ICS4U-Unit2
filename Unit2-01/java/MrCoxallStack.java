/*
 * This is a class of MrCoxallStack string stack. 
 *
 * @author Ayaat Ahmedou
 * @version 1.0
 * @since 2024-10-15
 */

import java.util.ArrayList;
import java.util.List;

public class MrCoxallStack {
  // The constructor for the MrCoxallStack string stack class has one field.
  private List<String> stackAsList;

  public MrCoxallStack() {
    this.stackAsList = new ArrayList<String>();
  }

  // Method to push a string into a stack.
  public void pushItem(String item) {
    stackAsList.add(item);
  }

  // Method to return the stack as a comma-seperated string.
  public String showStack() {
    return String.join(", ", stackAsList);
  }
}
