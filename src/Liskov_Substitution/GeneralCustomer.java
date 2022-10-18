package Liskov_Substitution;

import java.util.ArrayList;

public abstract class GeneralCustomer {
    protected ArrayList<Offer> offers = null;

    public GeneralCustomer(){
        offers = new ArrayList<>();
    }

    public void setOffers(ArrayList<Offer> offers) {
        this.offers = offers;
    }

    public ArrayList<Offer> getOffers() {
        ArrayList<Offer> tmpOffers = new ArrayList<Offer>();
        for (Offer offer : offers) {
            tmpOffers.add(offer);
        }
        return tmpOffers ;
    }
    public abstract void addOffers(Offer offer);



}
