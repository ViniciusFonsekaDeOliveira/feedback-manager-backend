package br.com.ada.application;

import br.com.ada.adapters.FeedbackSenderAdapterAws;
import br.com.ada.core.FeedbackSenderUseCase;
import br.com.ada.core.entity.CustomerFeedback;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FeedbackSenderService implements FeedbackSenderUseCase {

    private final FeedbackSenderAdapterAws feedbackSenderAdapterAws;

    @Autowired
    public FeedbackSenderService(FeedbackSenderAdapterAws feedbackSenderAdapterAws){
        this.feedbackSenderAdapterAws = feedbackSenderAdapterAws;
    }

    @Override
    public void sendCustomerFeedback(CustomerFeedback customerFeedback) {
        this.feedbackSenderAdapterAws.sendCustomerFeedback(customerFeedback);
    }
}
