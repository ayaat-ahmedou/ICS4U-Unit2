
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

console.log('\nDone.')
