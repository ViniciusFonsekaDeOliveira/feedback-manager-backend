package br.com.ada.infra.aws;

import br.com.ada.adapters.FeedbackSenderAdapterAws;
import br.com.ada.core.entity.CustomerFeedback;
import com.amazonaws.services.sns.AmazonSNS;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SnsFeedbackSenderService implements FeedbackSenderAdapterAws {

    private final AmazonSNS amazonSNS;

    @Autowired
    public SnsFeedbackSenderService(AmazonSNS amazonSNS){
        this.amazonSNS = amazonSNS;
    }
    @Override
    public void sendCustomerFeedback(CustomerFeedback customerFeedback) {
        //TO DO: fazer a publicação do CustomerFeedback no tópico da AWS accordingly with its type.

    }
}
