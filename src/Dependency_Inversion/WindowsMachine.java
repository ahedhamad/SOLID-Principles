package Dependency_Inversion;

import Dependency_Inversion.Interfaces.IKeyboard;
import Dependency_Inversion.Interfaces.IMonitor;

public class WindowsMachine {
    private IKeyboard keyboard;
    private IMonitor monitor;

    public WindowsMachine(){
        System.out.println("my constructor methods");
    }

    public void changeKeyboardStatus(boolean status){
        keyboard.keyboardStatus(status);
    }

    public void changeMonitorStatus(boolean status){
       monitor.MonitorStatus(status);
    }

}
