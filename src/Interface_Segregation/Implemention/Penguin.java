package Interface_Segregation.Implemention;

import Interface_Segregation.Interfaces.IFlight;
import Interface_Segregation.Interfaces.IMolting;
import Interface_Segregation.Interfaces.ISwimming;

public class Penguin implements ISwimming, IMolting {
    String currentLocation;
    int numberOfFeathers;

    public Penguin(int initialFeatherCount) {
        this.numberOfFeathers = initialFeatherCount;
    }

    public void molt() {
        System.out.println(this.numberOfFeathers -= 1);
    }

    public void swim() {

        System.out.println(this.currentLocation = "in the water");
    }
}
