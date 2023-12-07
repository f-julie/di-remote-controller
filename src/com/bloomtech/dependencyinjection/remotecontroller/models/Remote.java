package com.bloomtech.dependencyinjection.remotecontroller.models;

public class Remote {
    private final TV tv;

    public Remote() {
        this.tv = new TV();
    }

    public void power() {
        tv.turnOn();
    }

    public void adjuster1(boolean up) {
        tv.adjustVolume(up);
    }
}
