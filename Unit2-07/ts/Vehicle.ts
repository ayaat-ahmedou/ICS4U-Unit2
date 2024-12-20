/*
 * Class that defines string stack.
 *
 * @author  Ayaat Ahmedou
 * @version 1.0
 * @since   2024-12-18
 */

export class Vehicle {
    public color: string
    protected maxSpeed: number
    protected speed: number
  
    // variables
    constructor(color: string, maxSpeed: number) {
      this.color = color
      this.maxSpeed = maxSpeed
      this.speed = 0
    }
  
    //get colour
    public get color() {
      return this.color
    }
  
    // get current speed
    public get speed() {
      return this.speed
    }
  
    //set colour
    public set color(color: string) {
      this.color = color
    }
  
    // checks if stack is empty
    public status() { 
      console.log(" -> Speed: " + this.speed)
      console.log(" -> Max Speed: " + this.maxSpeed)
      console.log(" -> Color: " + this.color)
    }
  
    // change speed via accelerating formula
    public accelerate (accelerationPower: number, accelerationTime: number) {
      this.speed = (accelerationPower * accelerationTime) + this.speed
      if (this.speed > this.maxSpeed) {
        this.speed = this.maxSpeed
      }
    }
  
    // change speed via braking formula
    public brake (breakPower: number, breakTime: number) {
      this.speed = this.speed - (breakPower * breakTime)
      if (this.speed < 0) {
        this.speed = 0
      }
    }
  }
