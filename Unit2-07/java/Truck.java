/*
* This program is the standard truck class.
*
* @author  Ayaat Ahmedou
* @version 1.0
* @since   2024-12-18
*/

/**
 * This is truck the class.
*/
public class Truck extends Vehicle {
    /**
     * Variable.
    */
    protected String licensePlateNumber = "";

    /**
     * Creates the base truck.
     *
     * @param color the base colour
     * @param plateNumber the base license plate number
     * @param maxSpeed the maximum speed of the vehicle
    */
    public Truck(
            String color, double maxSpeed, String plateNumber
    ) {
        super(color, maxSpeed);
        this.licensePlateNumber = plateNumber;
    }

    /**
     * Gets the license plate number of the vehicle.
     *
     * @return the current licensePlateNumber
    */
    public String getLicensePlateNumber() {
        return this.licensePlateNumber;
    }

    /**
     * Creates a string about the status of the vehicle.
     *
     * @return the string about the vehicle's status
    */
    public String getStatus() {
        final String lineBreak = "\n";
        super.status();
        status += " -> License Plate: " + this.licensePlateNumber + lineBreak;

        return status;
    }

    /**
     * Provides air the the wheels of the truck, which changes speed.
     *
     * @param airPressure applied to the truck
    */
    public void applyAir(double airPressure) {
        this.setSpeed(this.getSpeed() - airPressure / 2);
    }
}
