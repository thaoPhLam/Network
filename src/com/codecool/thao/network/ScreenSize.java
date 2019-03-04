package com.codecool.thao.network;

public enum ScreenSize {
    EDTV (5),
    HD (10),
    FHD (15),
    UHD (20);

    private final int batteryUsage;

    ScreenSize(int batteryUsage) {
        this.batteryUsage = batteryUsage;
    }

    public int getBatteryUsage() {
        return batteryUsage;
    }
}
