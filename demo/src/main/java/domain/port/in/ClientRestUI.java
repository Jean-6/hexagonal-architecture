package domain.port.in;

import domain.model.Client;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import java.util.List;
import java.util.UUID;

public interface ClientRestUI {
    @PostMapping
    void createClient(@RequestBody Client client);
    @GetMapping("/{uuid}")
    public Client getClient(@PathVariable UUID id);
}
/*@GetMapping public List<Client> listClient();*/
