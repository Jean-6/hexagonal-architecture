package domain.model;

import lombok.*;

import java.util.ArrayList;
import java.util.UUID;

@Builder
@Value
@Data
public class Client {
    @With
    private UUID id;
    private  String name;
    private String firstName;
    private ArrayList<Offer> offer ;



}
