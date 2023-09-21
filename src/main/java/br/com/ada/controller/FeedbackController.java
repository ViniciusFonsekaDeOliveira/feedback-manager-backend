package br.com.ada.controller;

import br.com.ada.application.FeedbackSenderService;
import br.com.ada.core.entity.CustomerFeedback;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class FeedbackController {
    private final FeedbackSenderService feedbackSenderService;

    @Autowired
    public FeedbackController(FeedbackSenderService feedbackSenderService){
        this.feedbackSenderService = feedbackSenderService;
    }
    @PostMapping("/send")
    public ResponseEntity<String> sendFeedback(@RequestBody CustomerFeedback customerFeedback){
        try {
            this.feedbackSenderService.sendCustomerFeedback(customerFeedback);
            //TO DO : publish feedback accordingly with its type.
            return ResponseEntity.ok("Customer Feedback published sucessfully");
        }catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error in send customer feedback to topic SNS");
        }
    }

    /** Considerando todas as filas possíveis conforme o FeedbackType. **/
    @GetMapping("/size")
    public int queueSize(){
        //TO DO: get size of each queue from sqs.
        return 0;
    }

    /** Considerando que a informação seja relacionada a todos os campos que compõe CustomerFeedback e que sejam referentes a todas as filas
     * Consirar também a info de cada fila separadamente.
     * **/
    @GetMapping("/info")
    public CustomerFeedback[] getInfo(){
        //TO DO: recover the published CustomerFeedback from each possible queue.
        return null;
    }
}
