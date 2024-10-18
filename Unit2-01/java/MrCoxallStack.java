/*
 * This is a class of MrCoxallStack string stack. 
 *
 * @author Ayaat Ahmedou
 * @version 1.0
 * @since 2024-10-15
 */

import java.util.ArrayList;

public class MrCoxallStack {
  // The constructor for the MrCoxallStack string stack class.
  private ArrayList<String> stackAsList;

  public MrCoxallStack() {
    this.stackAsList = new ArrayList<String>();
  }

  // methods
  public void pushItem(String pushedString) {
    // This method returns the stack as a string.
    String stackValues = "";

    for (String value : this.stackAsList) {
      stackValues += value + ", ";
    }

  // Remove the last two characters (trailing comma and space)
  if (stackValues.length() > 0) {
    stackValues = stackValues.substring(0, stackValues.length() - 2);
  }

  return stackValues;
  }
}

