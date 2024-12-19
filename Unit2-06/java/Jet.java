/*
* This program is the jet class.
*
* @author  Johanna Liu
* @version 1.0
* @since   2024-03-25
*/

public class Jet extends Airplane {
    /**
     * Sets the jet's speed multiplier.
    */
    private static int multiplier = 2;

    /**
     * Creates the base jet.
    */
    public Jet() {
    }

    /**
     * Sets the speed of the jet.
     *
     * @param newSpeed of the jet
    */
    public void setSpeed(int newSpeed) {
        super.setSpeed(newSpeed * Jet.multiplier);
    }

    /**
     * Accelerates the jet, changing speed.
    */
    public void accelerate() {
        super.setSpeed(this.getSpeed() * Jet.multiplier);
    }
}
