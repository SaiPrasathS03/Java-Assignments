package com.zoho.remotecontrolcar;

public class ExperimentalRemoteControlCar implements RemoteControlCar{
    int d=0;
    public void drive() {
        d+=20;
    }
    public int getDistanceTravelled() {
        return d;
    }
}
