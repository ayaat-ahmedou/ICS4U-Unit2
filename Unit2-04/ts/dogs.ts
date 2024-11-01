/**
 * This is a program using the MrCoxallStack class.
 *
 * By:    Ayaat Ahmedou
 * Version: 1.0
 * Since: 2024-10-29
 */

import { MrCoxallStack } from './MrCoxallStack'

// Creates an instances for dogs.
const dogStack = new MrCoxallStack()

console.log('Dog items:')
console.log(`The size of the stack is: ${dogStack.size}`)
console.log(`Is the stack empty? ${dogStack.isEmpty.toString()}`)

// Add items to the stack
dogStack.pushItem('poodle')
dogStack.pushItem('retriever')
dogStack.pushItem('beagle')
console.log(`Dog items: ${dogStack.showStack}`)

// Pop the top item
const topDog = dogStack.popItem()
console.log(`Popped dog item: ${topDog}`)
console.log(`Dog items: ${dogStack.showStack}`)

// Check the size and if it's empty again
console.log(`The size of the stack is: ${dogStack.size}`)
console.log(`Is the stack empty? ${dogStack.isEmpty.toString()}`)

// Checks what the top dog is and again it's size.
console.log(`The top dog is: ${dogStack.peekItem()}`)
console.log(`The size of the stack is: ${dogStack.size}`)

// Empties the stack and again checks its size and if it is empty.
console.log('Empting the stack ...')
dogStack.clearStack()
console.log(`The size of the stack is: ${dogStack.size}`)
console.log(`Is the stack empty? ${dogStack.isEmpty.toString()}`)

console.log('\nDone.')
