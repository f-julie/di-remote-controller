package com.bloomtech.dependencyinjection.remotecontroller;

import com.bloomtech.dependencyinjection.remotecontroller.additionaldependencies.StreamingDevice;
import com.bloomtech.dependencyinjection.remotecontroller.models.Remote;
import com.bloomtech.dependencyinjection.remotecontroller.models.TV;

public class App {
    public void main(String[] args) {
        StreamingDevice streamingDevice = new StreamingDevice();
        TV tv = new TV(streamingDevice);
        Remote tvRemote = new Remote(tv);
    }
}
