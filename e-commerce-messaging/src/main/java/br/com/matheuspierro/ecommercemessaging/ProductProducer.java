package br.com.matheuspierro.ecommercemessaging;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class ProductProducer {
    private KafkaTemplate<String, String> kafkaTemplate;

    public ProductProducer(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void sendProduct(String product) {
        kafkaTemplate.send("products", product);
    }
}