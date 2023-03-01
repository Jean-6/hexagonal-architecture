package domain.model;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.UUID;

@Builder
@Value
@Document("Client")
public class Client {
    @With
    private UUID id;
    private  String name;
    private String firstName;
    private ArrayList<Offer> offer ;


    public void registration(){

    }
    public void submitOffer(){

    }



}
