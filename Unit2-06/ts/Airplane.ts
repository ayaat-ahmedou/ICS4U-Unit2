/*
 * This program is an airplane class.
 *
 * @author  Ayaat Ahmedou
 * @version 1.0
 * @since   2024-12-18
 */

// This is the airplane class.
export class Airplane {
  /** The internal variable that stores speed. */
  protected speed: number

  // Constructor.
  public Airplane() {
  }

  // Set an airplane speed.
  public setSpeed(speed: number) {
      this.speed = speed
  }

  // Get speed.
  public getSpeed(): number {
      return this.speed
  }
}
