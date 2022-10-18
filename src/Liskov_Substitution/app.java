package Liskov_Substitution;

import java.util.ArrayList;

public class app {
    public static void main(String[] args) {

        Offer offer1 = new Offer();
        offer1.setId(1);


        Offer offer2 = new Offer();
        offer2.setId(3);


        ArrayList<Offer> offers = new ArrayList<Offer>();
        offers.add(0,offer1);
        offers.add(1,offer2);


        GeneralCustomer generalCustomer = new PublicCustomer() ;
        generalCustomer.addOffers(offer1);
        GeneralCustomer generalCustomer1 = new LimitedCustomer();
        generalCustomer1.addOffers(offer2);

        printInfo(generalCustomer);

    }
    public static void printInfo(GeneralCustomer generalCustomer)
    {
            System.out.println(generalCustomer.getOffers());

    }
}
// PublicCustomer publicCustomer = new PublicCustomer();
        //publicCustomer.setOffers(offers);
              //  publicCustomer.addOffers(offer2);

// LimitedCustomer limitedCustomer= new LimitedCustomer();
//        limitedCustomer.setOffers(offers);
//        limitedCustomer.addOffers(offer2);