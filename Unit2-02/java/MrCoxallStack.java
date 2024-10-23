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
     * Constructor for the MrCoxallStack class.
     * Initializes an empty stack.
     */
    public MrCoxallStack() {
        this.stackAsList = new ArrayList<String>();
    }

    /**
     * Returns as a string with each item seperated by a comma and space.
     *
     * @return a string reprsentaion of the stack. If the stack is empty,
     *         an empty string is returned.
     */
    public String showStack() {
        StringBuilder stackValues = new StringBuilder();
        for (String value : stackAsList) {
            stackValues.append(value).append(", ");
        }
        // Removes the last two cahracters (trailing comma and space)
        if (stackValues.length() > 0) {
            stackValues.setLength(stackValues.length() - 2);
        }
        return stackValues.toString();
    }

    /**
     * Pushes a string onto the stack.
     *
     * @param pushed string to be pushed onto the stack.
     *        Cannot be null.
     * @throws IllegalArgumentException if pushedString is null.
     */
    public void pushedItem(String pushedString) {
        if (pushedString == null) {
            throw new IllegalArgumentException("pushedString cannot be null.");
        }
        stackAsList.add(pushedString);
    }

    /**
     * Pops item from stack.
     *
     * @return the string that popped from the stack. If the stack is empty,
     *         returns the message "The stack is empty!"
     */
    public String popItem() {
        if (stackAsList.size() > 0) {
            String topItem = stackAsList.get(stackAsList.size() - 1);
            stackAsList.remove(stackAsList.size() - 1);
            return topItem;
        } else {
            return "The stack is empty!";
        }
    }
}

