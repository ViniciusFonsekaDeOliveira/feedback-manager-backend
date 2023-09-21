package br.com.ada.adapters;

import br.com.ada.core.entity.CustomerFeedback;

/** Contrato com o sistema de mensageria a ser escolhido **/
public interface FeedbackSenderAdapterAws {

    void sendCustomerFeedback(CustomerFeedback customerFeedback);

}
