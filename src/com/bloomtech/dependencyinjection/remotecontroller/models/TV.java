package com.bloomtech.dependencyinjection.remotecontroller.models;

import com.bloomtech.dependencyinjection.remotecontroller.additionaldependencies.StreamingDevice;

public class TV implements IRemote {
    private boolean on;
    private int volume;
    private final int MAX_VOLUME = 10;

    private StreamingDevice streamingDevice;

    public TV(StreamingDevice streamingDevice) {
        on = false;
        volume = 5;

        this.streamingDevice = streamingDevice;
    }

    public void turnOn() {
        //Turn on/off
        on = !on;
        System.out.println("The TV turned " + (on ? "on" : "off"));
    }

    public void adjustVolume(boolean up) {
        if (up) {
            volume++;
        } else {
            volume--;
        }

        volume = Math.max(volume, 0);
        volume = Math.min(volume, MAX_VOLUME);

        System.out.println("Volume: " + volume);
    }

    @Override
    public void onPower() {
        turnOn();
    }

    @Override
    public void onAdjuster1(boolean up) {
        adjustVolume(up);
    }
}
