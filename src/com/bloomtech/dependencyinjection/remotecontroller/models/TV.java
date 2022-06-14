package com.bloomtech.dependencyinjection.remotecontroller.models;

public class TV {
    private boolean on;
    private int volume;
    private final int MAX_VOLUME = 0;

    public TV() {
        on = false;
        volume = 5;
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
}
