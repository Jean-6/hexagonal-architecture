package domain.model;
import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.UUID;

@Builder
@Value
@Document("Offer")
public class Offer {
    @With
    private UUID id;
    private UUID clientId;
    private String taskDescription;

}
