/**
 * MrCoxallStack string stack.
 *
 * By:    Ayaat Ahmedou
 * Version: 1.0
 * Since: 2024-10-31
 */

export class MrCoxallStack {
  // This class defines a MrCoxallStack string stack
  stackAsList: string[]

  // The constructor for the MrCoxallStack string stack class.
  // Args: None
  constructor () {
    this.stackAsList = []
  }

  // Getters

  // This method returns the stack as a string.
  // Returns:
  // string: The stack as a string.
  get showStack (): string {
    if (this.isEmpty) {
      return 'Stack is empty'
    }
    let stackValues = ''
    for (const value of this.stackAsList) {
      stackValues += value + ', '
    }

    // Remove the last two characters (trailing comma and space)
    stackValues = stackValues.slice(0, -2)
    return stackValues
  }

  // Checks if the stack is empty. Returns true if empty, false if not empty.
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
    if (pushedString === null || pushedString === '') {
      throw new Error('Cannot push null or empty string into stack')
    }
    this.stackAsList.push(pushedString)
  }

  // This method pops out the last item added (top value) to the stack.
  popItem (): string {
    if (this.isEmpty) {
      throw new Error('Cannot pop from an empty stack.')
    }
    return this.stackAsList.pop()
  }

  // This method returns the top value without removing it.
  peekItem (): string {
    if (this.isEmpty) {
      throw new Error('Cannot peek from an empty stack.')
    }
    return this.stackAsList[this.stackAsList.length - 1]
  }

  // This method clears all items from the stack.
  clearStack (): void {
    this.stackAsList = []
  }
}
