/*
 * This is a class of MrCoxallStack string stack.
 *
 * @author Ayaat Ahmedou
 * @version 1.0
 * @since 2024-10-15
 */

import java.util.ArrayList;
import java.util.List;

/**
 * This is the MrCoxallStack string stack class.
 *
 * @null This class does not handle null value.
 */
public class MrCoxallStack {
    /**
     * The constructor for the MrCoxallStack string stack class has one field.
     */
    private List<String> stackAsList;

    /**
     * This is it being assigned the ArrayList.
     */
    public MrCoxallStack() {
        this.stackAsList = new ArrayList<String>();
    }

    /**
     * Method to pusih a string into a stack.
     *
     * @param item The string that will be added.
     *
     */
    public void pushItem(String item) {
        stackAsList.add(item);
    }

    /**
     * Method to return the stack as a comma-seperated string.
     *
     * @return The string of the stack.
     *
     */
    public String showStack() {
        return String.join(", ", stackAsList);
    }
}

