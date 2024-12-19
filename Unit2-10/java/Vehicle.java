/*
* This program is the standard vehicle class.
*
* @author  Ayaat Ahmedou
* @version 1.0
* @since   2024-12-18
*/

/**
* This is the vehicle class.
*/
abstract class Vehicle {
    /**
     * Variables.
    */
    protected int numberOfTires;

    /**
     * Variables.
    */
    protected String colour = "";

    /**
     * Variables.
    */
    protected double speed;

    /**
     * Variables.
    */
    protected double maxSpeed;

    /**
     * Creates the base vehicle.
     *
     * @param color the base colour
     * @param maxSpeed the maximum speed of the vehicle
    */
    Vehicle(String color, double maxSpeed) {
        this.colour = color;
        this.speed = 0;
        this.maxSpeed = maxSpeed;
        this.numberOfTires = -1;
    }

    /**
     * Gets the colour of the vehicle.
     *
     * @return the current colour
    */
    public String getColour() {
        return this.colour;
    }

    /**
     * Gets the speed of the vehicle.
     *
     * @return the current speed
    */
    public double getSpeed() {
        return this.speed;
    }

    /**
     * Gets the maximum speed of the vehicle.
     *
     * @return the maximum speed
    */
    public double getMaxSpeed() {
        return this.maxSpeed;
    }

    /**
     * Gets number of tires.
     *
     * @return get tires
    */
    public double getNumberOfTires() {
        return this.numberOfTires;
    }

    /**
     * Creates a string about the status of the vehicle.
     *
     * @return the string about the vehicle's status
    */
    abstract String getStatus();

    /**
     * Sets the colour of the vehicle.
     *
     * @param newColour of the vehicle
    */
    void setColour(String newColour) {
        this.colour = newColour;
    }

    /**
     * Sets the speed of the vehicle.
     *
     * @param newSpeed of the vehicle
    */
    protected void setSpeed(double newSpeed) {
        this.speed = newSpeed;
    }

    /**
     * Accelerates the vehicle, which changes the speed.
     *
     * @param accelPower power of the acceleration
     * @param accelTime time of the acceleration
    */
    void accelerate(double accelPower, double accelTime) {
        this.speed = (accelPower * accelTime) + this.speed;
        if (this.speed > this.maxSpeed) {
            this.speed = this.maxSpeed;
        }
    }

    /**
     * Brakes the vehicle, which changes speed.
     *
     * @param brakePower power of the brake
     * @param brakeTime time of the brake
    */
    void brake(double brakePower, double brakeTime) {
        this.speed = this.speed - (brakePower * brakeTime);
        if (this.speed < 0) {
            this.speed = 0;
        }
    }
}
