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
/*
public interface OfferService {

    @PostMapping
    void createOffer(@RequestBody String description);
    @GetMapping("/{uuid}")
    public Offer getOffer(@PathVariable UUID id);
    @PostMapping
    void addOffer(@RequestBody Offer offer, @RequestBody UUID clientId);

}

 */