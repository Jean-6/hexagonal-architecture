package domain.model;
import lombok.Builder;
import lombok.Value;
import lombok.With;

import java.util.UUID;

@Builder
@Value
public class Skill {
    @With
    private final UUID id;
    private final String title;
    private final String description;
}
