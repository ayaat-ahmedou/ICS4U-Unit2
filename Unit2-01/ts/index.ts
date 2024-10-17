/**
 * This is a program using the MrCoxallStack class.
 *
 * By:    Ayaat Ahmedou
 * Version: 1.0
 * Since: 2024-10-15
 */

import { MrCoxallStack } from './MrCoxallStack'

function main (): void {
  // This function uses the MrCoxallStack class

  const fruitStack = new MrCoxallStack()
  fruitStack.pushItem('apple')
  fruitStack.pushItem('banana')
  fruitStack.pushItem('cherry')
  console.log(`Fruit items: ${fruitStack.showStack()}`)

  const colorStack = new MrCoxallStack()
  colorStack.pushItem('red')
  colorStack.pushItem('green')
  colorStack.pushItem('blue')
  console.log(`Color items: ${colorStack.showStack()}`)

  const dogStack = new MrCoxallStack()
  dogStack.pushItem('poodle')
  dogStack.pushItem('retriever')
  dogStack.pushItem('beagle')
  console.log(`Dog items: ${dogStack.showStack()}`)

  console.log('\nDone.')
}

if (require.main === module) {
  main()
}
