package domain.port.in;

import domain.model.Client;

import java.util.List;
import java.util.UUID;

public interface ClientService {

    public void createClient(String name,String firstname);

    public Client getClient(UUID clientId);

    public List<Client> listClient();
}

/*
public interface ClientRestUI {
    @PostMapping
    void createClient(@RequestBody Client client);
    @GetMapping("/{uuid}")
    public Client getClient(@PathVariable UUID id);
}
/*@GetMapping public List<Client> listClient();
 */
