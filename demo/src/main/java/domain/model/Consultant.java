package domain.model;


import lombok.Builder;
import lombok.Value;
import lombok.With;

import java.util.ArrayList;
import java.util.UUID;

@Builder
@Value
public final class Consultant {

    @With
    private final UUID id;
    private final  float averageDailyRate;
    private final ArrayList<Skill> skill;
    private final String term;
    private final String availability;
}

