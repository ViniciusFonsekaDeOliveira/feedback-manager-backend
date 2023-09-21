package br.com.ada.infra.kafka;

import br.com.ada.adapters.FeedbackSenderAdapterKafka;
import br.com.ada.core.entity.CustomerFeedback;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaFeedbackSenderService implements FeedbackSenderAdapterKafka {

    private final KafkaTemplate<String, CustomerFeedback> kafkaTemplate;

    @Autowired
    public KafkaFeedbackSenderService(KafkaTemplate<String, CustomerFeedback> kafkaTemplate){
        this.kafkaTemplate = kafkaTemplate;
    }

    @Override
    public void sendCustomerFeedback(CustomerFeedback customerFeedback) {
        //TO DO: Logic to send CustomerFeedBack to topic via Kafka accordingly with its type
        kafkaTemplate.send("my_topic_name", customerFeedback);
    }
}
