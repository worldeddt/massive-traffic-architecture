package massive.services;


import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;


@Slf4j
@Service
@RequiredArgsConstructor
public class KafkaService {

    private final KafkaTemplate<String, String> kafkaTemplate;

    public void publish(String topic, String message) {
        kafkaTemplate.send(topic, message);
    }


    @KafkaListener(topics = "chat-Message", groupId = "chatgroup")
    public void kafkaListener1(String topic, String message) {
        log.debug("topic : {} / message : {}", topic, message);
    }
}
