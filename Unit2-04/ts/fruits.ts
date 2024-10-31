
/**
 * This is a program using the MrCoxallStack class.
 *
 * By:    Ayaat Ahmedou
 * Version: 1.0
 * Since: 2024-10-29
 */

import { MrCoxallStack } from './MrCoxallStack'

// Creates an instances for fruits.
const fruitStack = new MrCoxallStack()

console.log('Fruit items:')
console.log(`The size of the stack is: ${fruitStack.size}`)
console.log(`Is the stack empty? ${fruitStack.isEmpty.toString()}`)

// Add items to the stack
fruitStack.pushItem('apple')
fruitStack.pushItem('banana')
fruitStack.pushItem('cherry')
console.log(`Fruit items: ${fruitStack.showStack}`)

// Pop the top item
const topFruit = fruitStack.popItem()
console.log(`Popped fruit item: ${topFruit}`)
console.log(`Fruit items: ${fruitStack.showStack}`)

// Check the size and if it's empty again
console.log(`The size of the stack is: ${fruitStack.size}`)
console.log(`Is the stack empty? ${fruitStack.isEmpty.toString()}`)

console.log('\nDone.')

