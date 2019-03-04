package com.codecool.thao.network.device;

import com.codecool.thao.network.DeviceCollector;
import com.codecool.thao.network.ScreenSize;

import java.util.ArrayList;
import java.util.List;

public class SmartDevice extends ScreenSizedDevice {
    private String name;
    private static int smartCount = 1;
    private DeviceCollector deviceCollector;

    public SmartDevice(int age, ScreenSize screenSize, DeviceCollector deviceCollector) {
        super(age, screenSize);
        this.defaultBatteryLoss = 15;
        this.name = "Smart " + smartCount++;
        this.deviceCollector = deviceCollector;
    }

    @Override
    public void calculateRemainingPower() {
        for (int i = 0; i < age; i++) {
            this.batteryLife -= defaultBatteryLoss;
            this.batteryLife -= screenSize.getBatteryUsage();
        }
    }

    public List<NormalDevice> getNormalDeviceWithDiffer(int differ) {
        return deviceCollector.getNormalDevicesWithDiffer(differ);
    }

    @Override
    public String toString() {
        return "SmartDevice {" +
                "age=" + age +
                ", batteryLife=" + batteryLife +
                ", defaultBatteryLoss=" + defaultBatteryLoss +
                ", screenSize=" + screenSize +
                ", name='" + name + '\'' +
                '}';
    }
}
