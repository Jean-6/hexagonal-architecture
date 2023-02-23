package domain.model;

import lombok.Builder;
import lombok.Value;
import lombok.With;

import java.util.UUID;

@Builder
@Value
public class Offer {
    @With
    private final UUID id;
    private final String taskDescription;


}
