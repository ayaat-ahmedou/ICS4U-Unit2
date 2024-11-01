/**
 * This is a program using the MrCoxallStack class.
 *
 * By:    Ayaat Ahmedou
 * Version: 1.0
 * Since: 2024-10-29
 */

import { MrCoxallStack } from './MrCoxallStack'

// Creates an instances for colors.
const colorStack = new MrCoxallStack()

console.log('Color items:')
console.log(`The size of the stack is: ${colorStack.size}`)
console.log(`Is the stack empty? ${colorStack.isEmpty.toString()}`)

// Add items to the stack
colorStack.pushItem('red')
colorStack.pushItem('green')
colorStack.pushItem('blue')
console.log(`Color items: ${colorStack.showStack}`)

// Pop the top item
const topColor = colorStack.popItem()
console.log(`Popped color item: ${topColor}`)
console.log(`Color items: ${colorStack.showStack}`)

// Check the size and if it's empty again
console.log(`The size of the stack is: ${colorStack.size}`)
console.log(`Is the stack empty? ${colorStack.isEmpty.toString()}`)

// Checks what the top color is and again it's size.
console.log(`The top color is: ${colorStack.peekItem()}`)
console.log(`The size of the stack is: ${colorStack.size}`)

// Empties the stack and again checks its size and if it is empty.
console.log('Empting the stack ...')
colorStack.clearStack()
console.log(`The size of the stack is: ${colorStack.size}`)
console.log(`Is the stack empty? ${colorStack.isEmpty.toString()}`)

console.log('\nDone.')
