package com.codecool.thao.network.device;

import com.codecool.thao.network.DeviceCollector;

public class ConnectedDevice extends Device {
    private DeviceCollector deviceCollector;

    public ConnectedDevice(int age, DeviceCollector deviceCollector) {
        super(age);
        this.defaultBatteryLoss = 7;
        this.deviceCollector = deviceCollector;
    }

    @Override
    public void calculateRemainingPower() {
        for (int i = 0; i < age; i++) {
            this.batteryLife -= defaultBatteryLoss;
        }
        this.batteryLife += 20 * (deviceCollector.getNumOfConnected() - 1);
    }
}
