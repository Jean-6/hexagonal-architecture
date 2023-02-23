package domain.port.in;

import domain.model.Client;

import java.util.List;
import java.util.UUID;

public interface ClientService {

    public void createClient(String name,String firstname);

    public Client getClient(UUID clientId);

    public List<Client> listClient();
}
