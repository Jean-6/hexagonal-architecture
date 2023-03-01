package domain.model;


import lombok.Builder;
import lombok.Value;
import lombok.With;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.UUID;


@Builder
@Value
@Document("Consultant")
public final class Consultant {
    @With
    private UUID id;
    private float averageDailyRate;
    private ArrayList<Skill> skill;
    private String term;
    private final String availability;

    public void updateProfile(){

    }

}

