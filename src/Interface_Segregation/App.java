package Interface_Segregation;

import Interface_Segregation.Implemention.Eagle;
import Interface_Segregation.Implemention.Penguin;
import Interface_Segregation.Interfaces.IFlight;

public class App {
    public static void main(String[] args) {
        Penguin penguin = new Penguin(100);

        Eagle eagle = new Eagle(50);

        try {
            penguin.swim();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

        try {
            eagle.fly();
            eagle.molt();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}
