package org.example;

public class QuadCopter extends Drone implements  VisualRecon{


    public QuadCopter(String callSign) {
        super(callSign);
    }

    @Override
    public void fly() {
        System.out.println(getCallsign() + " is hovering with four rotors.");
    }

    @Override
    public void takePicture() {
        System.out.println(getCallsign() + " takes a picture with its " + SENSOR_TYPE);
    }

}
