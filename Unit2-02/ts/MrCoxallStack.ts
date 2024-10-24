/**
 * MrCoxallStack string stack.
 *
 * By:    Ayaat Ahmedou
 * Version: 1.0
 * Since: 2024-10-16
 */

export class MrCoxallStack {
  // This class defines a MrCoxallStack string stack
  private stackAsList: string[]

  constructor () {
    // The constructor for the MrCoxallStack string stack class.
    // Args: None
    this.stackAsList = []
  }

  // Getters

  // This method returns the stack as a string.
  // Returns:
  // string: The stack as a string.
  get showStack(): string {
    let stackValues = ''
    for (const value of this.stackAsList) {
      stackValues += value + ', '
    }
    // Remove the last two characters (trailing comma and space)
    stackValues = stackValues.slice(0, -2)
    return stackValues
  }

  // Methods

  // This method pushes a string onto the stack.
  // Args: pusedString (string): The string will be pushed onto the stack.
  pushItem (pushedString: string): void {
    this.stackAsList.push(pushedString)
  }

  // This method pops a string from the stack.
  // Returns:
  // string: The string that was popped from the stack.
  popItem (): string {
    let returnValue = ''
    if (this.stackAsList.length > 0) {
      const topItem = this.stackAsList[this.stackAsList.length - 1]
      this.stackAsList = this.stackAsList.slice(0, -1)
      returnValue = topItem
    } else {
      returnValue = 'The stack is empty!'
    }
    return returnValue
  }
}
