package com.codecool.thao.network.device;

import com.codecool.thao.network.ScreenSize;

public abstract class ScreenSizedDevice extends Device {
    protected ScreenSize screenSize;

    public ScreenSizedDevice(int age, ScreenSize screenSize) {
        super(age);
        this.screenSize = screenSize;
    }
}
