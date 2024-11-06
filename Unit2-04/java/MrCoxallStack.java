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
        if (stackAsList.isEmpty()) {
            return "Stack is empty!";
        }

        String stackValues = "";
        for (String value : this.stackAsList) {
            stackValues += value + ", ";
        }

        /**
         * Removes the last two characters (trailing comma and space).
         * Got StringBuilder from CS50.ai because would not compile with
         *    for loops.
         * StringBuilder is a class.
         */
        final StringBuilder stringBuilder = new StringBuilder();
        if (stringBuilder.length() > 0) {
            stringBuilder.setLength(stringBuilder.length() - 2);
        }
        return stringBuilder.toString();
    }

    /**
     * Checks if the stack is empty.Returns true if empty, false if not empty.
     *
     * @return a boolean indicating if the stack is empty.
     */
    public boolean isEmpty() {
        return stackAsList.isEmpty();
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

    /**
     * This method returns the top value without removing it.
     *
     * @return the top item in the stack.
     * @throws IllegalStateException if the stack is empty.
     */
    public String peekItem() {
        if (isEmpty()) {
            throw new IllegalStateException(
            "Cannot peek from an empty stack.");
        }
        return stackAsList.get(stackAsList.size() - 1);
    }

    /**
     * This method clears all items from the stack.
     */
    public void clearStack() {
        stackAsList.clear();
    }
}

