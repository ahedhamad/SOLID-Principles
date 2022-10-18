package Dependency_Inversion.Implements;

import Dependency_Inversion.Interfaces.IKeyboard;

public class MyKeyboard implements IKeyboard {

    @Override
    public void powerOn() {
        System.out.println("Power on " + this.getClass().getName());
    }

    @Override
    public void powerOff() {
        System.out.println("Power off " + this.getClass().getName());
    }

    @Override
    public void keyboardStatus(Boolean status) {
        if (status){
           powerOn();
        } else {
            powerOff();
        }
    }
}
