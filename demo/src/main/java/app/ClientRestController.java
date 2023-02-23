package app;

import domain.model.Client;
import domain.port.in.ClientRestUI;
import domain.port.in.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/client")
public class ClientRestController implements ClientRestUI {
    @Autowired
    private ClientService clientService;


    @Override
    public void createClient(Client client) {
    }
    @Override
    public Client getClient(UUID id) {
        return null;
    }

}
