package Dependency_Inversion.Implements;

import Dependency_Inversion.Interfaces.IMonitor;

public class MyMonitor implements IMonitor {
    @Override
    public void turnOn() {
        System.out.println("Turn on " + this.getClass().getName());
    }

    @Override
    public void turnOff() {
        System.out.println("Turn off " + this.getClass().getName());
    }

    @Override
    public void MonitorStatus(Boolean status) {
        if (status){
            turnOn();
        } else {
            turnOff();
        }
    }
}
