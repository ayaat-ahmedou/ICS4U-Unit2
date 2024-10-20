/**
 * This is a program using the MrCoxallStack class.
 *
 * By:    Ayaat Ahmedou
 * Version: 1.0
 * Since: 2024-10-15
 */

import { MrCoxallStack } from './MrCoxallStack'
// This function uses the MrCoxallStack class

// Creates an instance for fruit.
const fruitStack = new MrCoxallStack()
fruitStack.pushItem('apple')
fruitStack.pushItem('banana')
fruitStack.pushItem('cherry')
console.log(`Fruit items: ${fruitStack.showStack()}`)

// Creates an instance for colors.
const colorStack = new MrCoxallStack()
colorStack.pushItem('red')
colorStack.pushItem('green')
colorStack.pushItem('blue')
console.log(`Color items: ${colorStack.showStack()}`)

// Creates an instance for dog breeds.
const dogStack = new MrCoxallStack()
dogStack.pushItem('poodle')
dogStack.pushItem('retriever')
dogStack.pushItem('beagle')
console.log(`Dog items: ${dogStack.showStack()}`)

console.log('\nDone.')
