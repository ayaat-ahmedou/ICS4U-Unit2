/**
 * Vehicle number class
 *
 * By:  Ayaat Ahmedou
 * Version: 1.0
 * Since: 2024-11-07
 */

export class Vehicle {
  // This class defines a Vehicle.
  // Private fields for internal properties.
  private licensePlate: string
  public color: string
  private readonly doors: number
  public speed: number = 0
  private readonly maxSpeed: number

  // The constructor for the Vehicle class.]
  // Initializes the vehicles properties that are set by the user.
  constructor (licensePlate: string, color: string, doors: number, maxSpeed:
  number) {
    this.speed = 0
    this.licensePlate = licensePlate
    this.color = color
    this.doors = doors
    this.maxSpeed = maxSpeed
  }

  // Getters and Setters

  // Getter methods for the vehicle properties
  // Gets and returns license plate as a string
  get getLicensePlate (): string {
    return this.licensePlate
  }

  // Setter for license plate
  set setLicensePlate (licensePlate: string) {
    this.licensePlate
  }

  // Gets and returns color as a string.
  get getColor (): string {
    return this.color
  }

  // setter for vehicle color.
  set setColor(color: string) {
    this.color = color
  }

  // Gets and returns the number of doors as a number.
  get getDoors (): number {
    return this.doors
  }

  // Gets and returns the speed as a number.
  get getSpeed (): number {
    return this.speed
  }

  // Gets and returns the maxSpeed as a number.
  get getMaxSpeed (): number {
    return this.maxSpeed
  }

  // Setter methods for the vehicle class.

  // Public methods
  // Accelaerate method that increases its speed, and is calculated based on
  //  acceleration power and time.
  accelerate (accelerationPower: number, acceleration: number): void {
    this.speed = (accelerationPower * acceleration) + this.speed
    if (this.speed > this.maxSpeed) {
      this.speed = this.maxSpeed // Makes sure speed !> maxSpeed and if make =
    }
  }

  // Break method that decrease vehicle speed but cannot go below zero, and is
  //  calculated with the rate of decelerationandtime it takes to break.
  break (breakPower: number, breakTime: number): void {
    this.speed = this.speed - (breakPower * breakTime)
    if (this.speed < 0) {
      this.speed = 0 // Speed cannot be negative
    }
  }

  // Status method that shows the current status of the vehicles properties.
  status (): string {
    return `-> Speed : ${this.speed}
-> Max Speed: ${this.maxSpeed}
-> Number of doors: ${this.doors}
-> License Plate: ${this.licensePlate}
-> Color: ${this.color}`
  }
}
