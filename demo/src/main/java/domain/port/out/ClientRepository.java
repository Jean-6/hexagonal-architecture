package domain.port.out;

import domain.model.Client;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public interface ClientRepository {

    Optional findById(UUID uuid);
    Optional findByName(String name);
    List findAll();
    void deleteOne(Client client);
    void deleteById(UUID uuid);
    void insertOne(Client client);
    void insertAll(List clients);
    void deleteAll(List clients);




}
