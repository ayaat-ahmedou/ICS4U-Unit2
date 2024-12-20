/*
 * This is a class of MrCoxallStack string stack.
 *
 * @author Ayaat Ahmedou
 * @version 1.0
 * @since 2024-10-30
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
        final StringBuilder stackValues = new StringBuilder();
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
     * Checks if the stack is empty.
     *
     * @return a boolean indicating if the stack is empty.
     */
    public boolean isEmpty() {
        return this.stackAsList.size() == 0;
    }

    /**
     * Shows the size of the stack.
     *
     * @return string of size of the stack.
     */
    public int getSize() {
        return this.stackAsList.size();
    }

    /**
     * Pushes a string onto the stack.
     *
     * @param pushedString string to be pushed onto the stack.
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
        final String result;
        if (stackAsList.size() > 0) {
            final String topItem = stackAsList.get(stackAsList.size() - 1);
            stackAsList.remove(stackAsList.size() - 1);
            result = topItem;
        } else {
            result = "This stack is empty! Nothing to pop!";
        }
        return result;
    }
}

