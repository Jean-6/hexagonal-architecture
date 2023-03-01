package domain.model;
import lombok.Builder;
import lombok.Value;
import lombok.With;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.UUID;

@Builder
@Value
@Document("Skill")
public class Skill {
    @With
    private UUID id;
    private String title;
    private String description;

}
