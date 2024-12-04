package massive.controller;


import lombok.RequiredArgsConstructor;
import massive.services.CassandraService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class CassandraController {

    private final CassandraService cassandraService;

    @GetMapping("/cas")
    public void cas() {
        cassandraService.cas();
    }
}
