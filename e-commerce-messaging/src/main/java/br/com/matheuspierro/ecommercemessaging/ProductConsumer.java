package br.com.matheuspierro.ecommercemessaging;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class ProductConsumer {

    @KafkaListener(topics = "products", groupId = "group-1")
    public void receiveProduct(String product) {
        System.out.println("Consumer Products: " + product);
    }
}
