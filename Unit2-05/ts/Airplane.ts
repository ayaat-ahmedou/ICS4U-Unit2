/**
 * Airplane number class
 *
 * By:  Ayaat Ahmedou
 * Version: 1.0
 * Since: 2024-11-07
 */

export class Airplane {
  // This class defines a Airplane number class (int isn't a thing in ts).
  private speed: number

  // The constructor for the Airplane number class.
  // Initializes the speed of the Airplane.
  constructor(speed: number) {
    this.speed = speed
  }

  // Getter and Setter methods

  // Getter method gets current speed of airplane.
  getSpeed(): number {
    return this.speed
  }

  // Setter method updates the speed or the airplane.
  setSpeed(speed: number): void {
    this.speed = speed
  }
}
