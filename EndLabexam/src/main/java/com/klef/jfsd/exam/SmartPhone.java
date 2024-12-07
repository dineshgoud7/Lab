package com.klef.jfsd.exam;


import javax.persistence.Entity;

@Entity
public class SmartPhone extends Device {

    private int batteryCapacity;
    private String operatingSystem;

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }
}

