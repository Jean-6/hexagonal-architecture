package domain.model;

import lombok.Builder;
import lombok.Value;
import lombok.With;

import java.util.UUID;

@Builder
@Value
public class Client {
    @With
    private final UUID id;
    private final String name;
    private final String firstName;
    private final Offer offer ;

}
