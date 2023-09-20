package br.com.ada.adapters;

import br.com.ada.entity.CustomerFeedback;

/** Contrato com o sistema de mensageria a ser escolhido **/
public interface FeedbackSenderAdapter {

    void sendCustomerFeedback(CustomerFeedback customerFeedback);

}
