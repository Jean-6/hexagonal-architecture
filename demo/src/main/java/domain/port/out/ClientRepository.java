package domain.port.out;

import domain.model.Client;

import java.util.List;

public interface ClientRepository {

    public void createClient(Client client);

    public Client getClient(String clientName);

    public List<Client> getAllClient();
}
