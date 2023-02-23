package domain.port;

import domain.model.Client;

import java.util.List;

public interface IClientRepository {

    public void createClient(Client client);

    public Client getClient(String clientName);

    public List<Client> getAllClient();
}
