package Liskov_Substitution;

import java.util.ArrayList;
public class PublicCustomer extends  GeneralCustomer {

public PublicCustomer(){
    super();
}
@Override
public void setOffers(ArrayList<Offer> offers) {
    super.setOffers(offers);
}
@Override
    public ArrayList<Offer> getOffers() {
        ArrayList<Offer> tmpOffers = new ArrayList<>();
        for (Offer offer : offers) {
            tmpOffers.add(offer);
        }
        return tmpOffers;
    }
@Override
    public void addOffers(Offer offer) {

    this.offers.add(offer);
    }

}
