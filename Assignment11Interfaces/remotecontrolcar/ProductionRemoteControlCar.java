package com.zoho.remotecontrolcar;

public class ProductionRemoteControlCar implements RemoteControlCar,Comparable<ProductionRemoteControlCar>{
    int d=0;
    private int numberOfVictories;
    public void drive() {
        d+=10;
    }
    public int getDistanceTravelled() {
        return d;
    }
    public int getNumberOfVictories() {
        return numberOfVictories;
    }
    public void setNumberOfVictories(int numberOfVictories) {
        this.numberOfVictories = numberOfVictories;
    }
    public int compareTo(ProductionRemoteControlCar other) {
        return Integer.compare(other.numberOfVictories, this.numberOfVictories);
    }
}