package domain.port.in;

import domain.model.Client;
import domain.model.Offer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.UUID;

public interface OfferRestUI {

    @PostMapping
    void createOffer(@RequestBody String description);
    @GetMapping("/{uuid}")
    public Offer getOffer(@PathVariable UUID id);
    @PostMapping
    void addOffer(@RequestBody Offer offer, @RequestBody UUID clientId);

}
