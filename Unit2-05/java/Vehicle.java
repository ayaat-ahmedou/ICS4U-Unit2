/**
 * Vehicle class.
 * 
 * By: Ayaat Ahmedou
 * Version: 1.0
 * Since: 2024-11-07
 */
public class Vehicle {

    // Private fields for internal properties.
    private String licensePlate;
    public String color;
    private final int doors;
    public int speed = 0;
    private final int maxSpeed;

    /**
     * Constructor for the Vehicle class.
     * Initializes the vehicle's properties that are set by the user.
     * 
     * @param licensePlate The vehicle's license plate.
     * @param color        The vehicle's color.
     * @param doors        The number of doors on the vehicle.
     * @param maxSpeed     The maximum speed of the vehicle.
     */
    public Vehicle(String licensePlate, String color, int doors, int maxSpeed) {
        this.speed = 0;
        this.licensePlate = licensePlate;
        this.color = color;
        this.doors = doors;
        this.maxSpeed = maxSpeed;
    }

    // Getters and Setters

    /**
     * Gets and returns the license plate.
     * 
     * @return The license plate as a string.
     */
    public String getLicensePlate() {
        return this.licensePlate;
    }

    /**
     * Sets the license plate.
     * 
     * @param licensePlate The new license plate.
     */
    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    /**
     * Gets and returns the color.
     * 
     * @return The color as a string.
     */
    public String getColor() {
        return this.color;
    }

    /**
     * Sets the color.
     * 
     * @param color The new color.
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Gets and returns the number of doors.
     * 
     * @return The number of doors as an integer.
     */
    public int getDoors() {
        return this.doors;
    }

    /**
     * Gets and returns the speed.
     * 
     * @return The speed as an integer.
     */
    public int getSpeed() {
        return this.speed;
    }

    /**
     * Gets and returns the maximum speed.
     * 
     * @return The maximum speed as an integer.
     */
    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    // Public methods

    /**
     * Accelerates the vehicle, increasing its speed. The new speed is calculated
     * based on acceleration power and time.
     * 
     * @param accelerationPower The power of acceleration.
     * @param acceleration      The time duration of acceleration.
     */
    public void accelerate(int accelerationPower, int acceleration) {
        this.speed = (accelerationPower * acceleration) + this.speed;
        if (this.speed > this.maxSpeed) {
            this.speed = this.maxSpeed; // Ensures speed is not greater than maxSpeed
        }
    }

    /**
     * Brakes the vehicle, decreasing its speed. The new speed is calculated based
     * on braking power and time. Speed cannot go below zero.
     * 
     * @param brakePower The power of braking.
     * @param brakeTime  The time duration of braking.
     */
    public void brake(int brakePower, int brakeTime) {
        this.speed = this.speed - (brakePower * brakeTime);
        if (this.speed < 0) {
            this.speed = 0; // Ensures speed is not negative
        }
    }

    /**
     * Displays the current status of the vehicle's properties.
     * 
     * @return A string showing the vehicle's current status.
     */
    public String status() {
        return "-> Speed : " + this.speed + 
               "\n-> Max Speed: " + this.maxSpeed + 
               "\n-> Number of doors: " + this.doors + 
               "\n-> License Plate: " + this.licensePlate + 
               "\n-> Color: " + this.color;
    }
}

