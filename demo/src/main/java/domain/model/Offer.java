package domain.model;

import lombok.*;

import java.util.UUID;

@Builder
@Value
@Data
public class Offer {
    @With
    private UUID id;
    private String taskDescription;


}
