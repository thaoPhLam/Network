package com.codecool.thao.network;

import com.codecool.thao.network.device.NormalDevice;

import java.util.List;

public interface DeviceCollector {
    int getNumOfConnected();

    List<NormalDevice> getNormalDevicesWithDiffer(int differ);
}
