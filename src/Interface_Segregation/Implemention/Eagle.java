package Interface_Segregation.Implemention;

import Interface_Segregation.Interfaces.IFlight;
import Interface_Segregation.Interfaces.IMolting;
import Interface_Segregation.Interfaces.ISwimming;

public class Eagle implements IMolting, IFlight {
    String currentLocation;
    int numberOfFeathers;

    public Eagle(int initialFeatherCount) {
        this.numberOfFeathers = initialFeatherCount;
    }

    @Override
    public void fly() {
        System.out.println(this.currentLocation = "in the air");
    }

    @Override
    public void molt() {

        System.out.println( this.numberOfFeathers -= 1);
    }

}
