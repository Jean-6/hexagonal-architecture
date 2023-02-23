package domain.port.in;

import domain.model.Client;
import domain.model.Offer;

import java.util.List;
import java.util.UUID;

public interface OfferService {

    public void createOffer(String taskDescription);

    public Offer getOffer(UUID offerId);

    public List<Offer> offerList();


}
