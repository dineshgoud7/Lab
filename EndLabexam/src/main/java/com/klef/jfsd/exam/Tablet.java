package com.klef.jfsd.exam;


import javax.persistence.Entity;

@Entity
public class Tablet extends Device {

    private double battery;
    private String screenResolution;

    public double Battery() {
        return battery;
    }

    public void setBattery(double battery) {
        this.battery = battery;
    }

    public String getScreenResolution() {
        return screenResolution;
    }

    public void setScreenResolution(String screenResolution) {
        this.screenResolution = screenResolution;
    }
}
