package infra.re;

import domain.model.Client;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientRepositoryImp implements domain.port.out.ClientRepository {
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
