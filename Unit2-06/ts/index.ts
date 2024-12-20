/*
* This program is the standard jet class.
*
* @author  Ayaat Ahmedou
* @version 1.0
* @since   2024-12-18
*/

import { Airplane } from "./Airplane"
import { Jet } from "./Jet"

    let biplane = new Airplane()
    biplane.setSpeed(212)
    console.log(biplane.getSpeed())
    let boeing = new Jet()
    boeing.setSpeed(422)
    console.log(boeing.getSpeed())
    for (let i = 0; i < 4; i++) {
      boeing.accelerate()
      console.log(boeing.getSpeed())
      if (boeing.getSpeed() > 5000) {
        biplane.setSpeed(biplane.getSpeed() * 2)
      } else {
        boeing.accelerate()
      }
    }
    console.log(biplane.getSpeed())
