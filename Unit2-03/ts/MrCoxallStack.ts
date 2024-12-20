/**
 * MrCoxallStack string stack.
 *
 * By:    Ayaat Ahmedou
 * Version: 1.0
 * Since: 2024-10-29
 */

export class MrCoxallStack {
  // This class defines a MrCoxallStack string stack
  readonly stackAsList: string[]

  constructor () {
    // The constructor for the MrCoxallStack string stack class.
    // Args: None
    this.stackAsList = []
  }

  // Getters

  // This method returns the stack as a string.
  // Returns:
  // string: The stack as a string.
  get showStack (): string {
    let stackValues = ''
    for (const value of this.stackAsList) {
      stackValues += value + ', '
    }
    // Remove the last two characters (trailing comma and space)
    stackValues = stackValues.slice(0, -2)
    return stackValues
  }

  // Checks if the stack is empty.
  get isEmpty (): boolean {
    return this.stackAsList.length === 0
  }

  // Shows the size of the stack.
  get size (): number {
    return this.stackAsList.length
  }

  // Methods

  // This method pushes a string onto the stack.
  // Args: pusedString (string): The string will be pushed onto the stack.
  pushItem (pushedString: string): void {
    this.stackAsList.push(pushedString)
  }

  popItem (): string {
    if (this.stackAsList.length === 0) {
      return 'The stack is empty! Nothing to pop.'
    }
    return this.stackAsList.pop() as string
  }
}
