package massive.controller;


import lombok.RequiredArgsConstructor;
import massive.services.KafkaService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class KafkaController {

    private final KafkaService kafkaService;

    @GetMapping("/kafka")
    public void kafkaMessage(@RequestParam String topic, @RequestParam String message) {
        kafkaService.publish(topic, message);
    }
}
