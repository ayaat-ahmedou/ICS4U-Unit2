/*
 * Class that defines string stack.
 *
 * @author  Ayaat Ahmedou
 * @version 1.0
 * @since   2024-12-18
 */

export class Vehicle {
  protected color: string
  protected maxSpeed: number
  protected _speed: number
  protected numberOfTires: int

  // variables
  constructor(color: string, maxSpeed: number) {
    this.color = color
    this.maxSpeed = maxSpeed
    this.numberOfTires = -1
    this._speed = 0
  }

  //get colour
  public get color() {
    return this.color
  }

  // get current speed
  public get speed() {
    return this._speed
  }

  //set colour
  public set color(color: string) {
    this.color = color
  }

  // checks if stack is empty
  public status() { 
    console.log(" -> Speed: " + this.speed)
    console.log(" -> Max Speed: " + this.maxSpeed)
    console.log(" -> Number of tires: " + this.numberOfTires)
    console.log(" -> Color: " + this.color)
  }

  // change speed via accelerating formula
  public accelerate (accelerationPower: number, accelerationTime: number) {
    this._speed = (accelerationPower * accelerationTime) + this._speed
    if (this._speed > this.maxSpeed) {
      this._speed = this.maxSpeed
    }
  }

  // change speed via braking formula
  public brake(breakPower: number, breakTime: number) {
    this._speed = this._speed - (breakPower * breakTime)
    if (this._speed < 0) {
      this._speed = 0
    }
  }
}
