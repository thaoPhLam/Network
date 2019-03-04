package com.codecool.thao.network.device;

import com.codecool.thao.network.ScreenSize;

public class NormalDevice extends ScreenSizedDevice {
    private int yearOfManufacturing;

    public NormalDevice(int age, ScreenSize screenSize, int yearOfManufacturing) {
        super(age, screenSize);
        this.defaultBatteryLoss = 3;
        this.yearOfManufacturing = yearOfManufacturing;
        if (this.yearOfManufacturing >= 2000) {
            this.batteryLife *= 2;
        } else {
            this.batteryLife /= 2;
        }
    }

    @Override
    public void calculateRemainingPower() {
        for (int i = 0; i < age; i++) {
            this.batteryLife -= defaultBatteryLoss;
        }
    }
}
