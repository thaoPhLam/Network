package com.codecool.thao.network.app;

import com.codecool.thao.network.Network;
import com.codecool.thao.network.device.ConnectedDevice;
import com.codecool.thao.network.device.NormalDevice;
import com.codecool.thao.network.ScreenSize;
import com.codecool.thao.network.device.SmartDevice;

public class Main {
    public static void main(String[] args) {
        Network network = new Network();

        network.registerDevice(new ConnectedDevice(3, network));
        network.registerDevice(new ConnectedDevice(3, network));
        network.registerDevice(new ConnectedDevice(3, network));
        network.registerDevice(new ConnectedDevice(3, network));
        network.registerDevice(new NormalDevice(3, ScreenSize.EDTV, 2003));
        network.registerDevice(new SmartDevice(3, ScreenSize.UHD, network));
        network.registerDevice(new SmartDevice(2, ScreenSize.UHD, network));

        network.checkOnNumOfConnectedThenRun();
        /**
         * TODO: Laci
         * - általánosabb Interface
         * - Interface minden methodjának visszatérő értékével kellene h csináljon vmit
         * - ne csak egyik fele itt, másik fele ott
         * - 3 lista getter fele menne el
         *
         * - vagy külön interface-k (viszont db szám probléma)
         *
         * - method elnevezés: checkOnNumOf....()
         */
    }
}
