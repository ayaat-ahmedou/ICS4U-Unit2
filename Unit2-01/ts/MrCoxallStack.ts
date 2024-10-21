/**
 * MrCoxallStack string stack.
 *
 * By:    Ayaat Ahmedou
 * Version: 1.0
 * Since: 2024-10-16
 */

export class MrCoxallStack {
  // This class defines a MrCoxallStack string stack
  private readonly stackAsList: string[]

  constructor () {
    // The constructor for the MrCoxallStack string stack class.
    // Args: None
    this.stackAsList = []
  }

  // Methods

  // This method pushes a string onto the stack.
  // Args: pusedString (string): The string will be pushed onto the stack.
  pushItem (pushedString: string): void {
    this.stackAsList.push(pushedString)
  }

  // This method returns the stack as a string.
  // Returns:
  // string: The stack as  string.
  showStack (): string {
    let stackValues = ''

    // Iterating through the stack and concating the values
    for (const value of this.stackAsList) {
      stackValues += value + ', '
    }

    // Remove the last two characters (trailing comma and space)
    if (stackValues.length > 0) {
      stackValues = stackValues.slice(0, -2)
    }

    return stackValues
  }
}
