package app;

import domain.model.Offer;
import domain.port.in.OfferRestUI;
import domain.port.in.OfferService;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController("/offer")
public class OfferController implements OfferRestUI {

    private OfferService offerService;
    @Override
    public void createOffer(String description) {

    }

    @Override
    public Offer getOffer(UUID id) {
        return null;
    }

    @Override
    public void addOffer(Offer offer, UUID clientId) {

    }

}
