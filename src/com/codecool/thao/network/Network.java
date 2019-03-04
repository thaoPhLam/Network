package com.codecool.thao.network;

import com.codecool.thao.network.device.ConnectedDevice;
import com.codecool.thao.network.device.Device;
import com.codecool.thao.network.device.NormalDevice;
import com.codecool.thao.network.device.SmartDevice;

import java.util.ArrayList;
import java.util.List;

public class Network implements DeviceCollector {
    private List<Device> devices = new ArrayList<>();
    private List<ConnectedDevice> connectedDevices = new ArrayList<>();
    private List<NormalDevice> normalDevices = new ArrayList<>();
    private List<SmartDevice> smartDevices = new ArrayList<>();

    public void registerDevice(Device device) {
        if (device instanceof ConnectedDevice) {
            connectedDevices.add((ConnectedDevice) device);
        } else if (device instanceof NormalDevice) {
            normalDevices.add((NormalDevice) device);
        } else if (device instanceof SmartDevice) {
            smartDevices.add((SmartDevice) device);
        }
        devices.add(device);
    }

    public void checkOnNumOfConnectedThenRun() {
        if (connectedDevices.size() >= 4) {
            simulateNetwork();
            getNormalDevicesWitchDifferSmart();
        } else {
            System.out.println("There's not enough connected devices.");
        }
    }

    public void simulateNetwork() {
        for (Device device : devices) {
            device.calculateRemainingPower();
            System.out.println(device);
        }
        System.out.println();
    }

    @Override
    public int getNumOfConnected() {
        return connectedDevices.size();
    }

    @Override
    public List<NormalDevice> getNormalDevicesWithDiffer(int differ) {
        List<NormalDevice> collectedNormalDevices = new ArrayList<>();

        for (SmartDevice smartDevice : smartDevices) {
            for (NormalDevice normalDevice : normalDevices) {
                if (Math.abs(smartDevice.getBatteryLife() - normalDevice.getBatteryLife()) == differ) {
                    collectedNormalDevices.add(normalDevice);
                }
            }
        }
        return collectedNormalDevices;
    }

    public void getNormalDevicesWitchDifferSmart() {
        for (SmartDevice smartDevice : smartDevices) {
            List<NormalDevice> normalDevices = smartDevice.getNormalDeviceWithDiffer(1096);
            for (NormalDevice normalDevice : normalDevices) {
                System.out.println(smartDevice + " differ from: " + normalDevice);
            }
        }
    }
}
