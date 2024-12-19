/*
 * This program is teh jet class extends from the airplane
 *
 * @author Ayaat Ahmedou
 * @version 1.0
 * @since   2024-12-18
 */

import { Airplane } from "./Airplane"

/**
* This is the jet class.
*/
export class Jet extends Airplane {
    /** Jet speed change multiplier. */
    private MULTIPLIER: number = 2

    // Constructor.
    public Jet() {
        // super()
    }

    // Set jet speed.
    public setSpeed(speed: number) {
        super.setSpeed(speed * this.MULTIPLIER)
    }

    // Double speed.
    public accelerate() {
        super.setSpeed(super.getSpeed() * 2)
    }
}
