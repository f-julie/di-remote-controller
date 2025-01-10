package com.bloomtech.dependencyinjection.remotecontroller.models;

public class Remote {
    //private final TV tv;

    private final IRemote remoteObject;

    /*
    public Remote() {
        this.tv = new TV();
    }
     */

    public Remote(IRemote remoteObject) {
        this.remoteObject = remoteObject;
    }

    public void power() {
        remoteObject.onPower();
    }

    public void adjuster1(boolean up) {
        remoteObject.onAdjuster1(up);
    }
}
