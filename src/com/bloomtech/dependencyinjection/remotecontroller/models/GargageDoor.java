package com.bloomtech.dependencyinjection.remotecontroller.models;

public class GargageDoor implements IRemote {
    private boolean open;

    public GargageDoor() {
        open = false;
    }

    @Override
    public void onPower() {
        open = !open;
    }

    @Override
    public void onAdjuster1(boolean up) {
        //No implementation
    }
}
