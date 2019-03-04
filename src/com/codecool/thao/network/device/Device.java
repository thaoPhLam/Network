package com.codecool.thao.network.device;

public abstract class Device {
    protected int age;
    protected int batteryLife = 1000;
    protected int defaultBatteryLoss;

    public Device(int age) {
        this.age = age;
    }

    public abstract void calculateRemainingPower();

    public int getBatteryLife() {
        return batteryLife;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " {" +
                "age=" + age +
                ", batteryLife=" + batteryLife +
                ", defaultBatteryLoss=" + defaultBatteryLoss +
                '}';
    }
}
