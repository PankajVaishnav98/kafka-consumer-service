package example.kafka.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaConsumer {

    @KafkaListener(topics = "sample_events")
    public void listenKafkaMessage(String message){
        System.out.println("Kafka message : "+message);
    }

}
