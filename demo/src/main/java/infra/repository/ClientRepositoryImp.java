package infra.repository;

import domain.model.Client;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class ClientRepositoryImp implements domain.port.out.ClientRepository {

    @Override
    public Optional findById(UUID uuid) {
        return Optional.empty();
    }

    @Override
    public Optional findByName(String name) {
        return Optional.empty();
    }

    @Override
    public List findAll() {
        return null;
    }

    @Override
    public void deleteOne(Client client) {

    }

    @Override
    public void deleteById(UUID uuid) {

    }

    @Override
    public void insertOne(Client client) {

    }

    @Override
    public void insertAll(List clients) {

    }

    @Override
    public void deleteAll(List clients) {

    }
}
