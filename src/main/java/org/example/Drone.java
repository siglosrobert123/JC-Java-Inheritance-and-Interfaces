package org.example;

public abstract class Drone {
    private String callSign;

    public Drone(String callSign){
        this.callSign = callSign;
    }

    public void takeOff(){
        System.out.println(callSign + " is taking off.");
    }

    public void land() {
        System.out.println(callSign + " is landing.");
    }

    public abstract void fly();


    public String getCallsign() {
        return this.callSign;
    }
}
