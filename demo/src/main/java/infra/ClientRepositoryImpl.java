package infra;

import domain.model.Client;
import domain.port.out.ClientRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientRepositoryImpl implements ClientRepository {
    @Override
    public void createClient(Client client) {

    }

    @Override
    public Client getClient(String clientName) {
        return null;
    }

    @Override
    public List<Client> getAllClient() {
        return null;
    }
}
