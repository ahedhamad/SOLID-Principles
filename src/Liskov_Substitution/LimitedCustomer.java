package Liskov_Substitution;


import java.util.ArrayList;

public class LimitedCustomer extends GeneralCustomer{

public LimitedCustomer(){
    super();
}
    private static final int MAX_ALLOWED_OFFER = 3;
     @Override
    public void addOffers(Offer offer) {
        if (isReachedMaxAllowedOffers()){
            System.err.println("Limited customer can not add more that " + MAX_ALLOWED_OFFER + " offers" );
            return;
        }
        this.addOffers(offer);
    }
    private boolean isReachedMaxAllowedOffers() {
        return this.offers.size() >= MAX_ALLOWED_OFFER;
    }

    }

