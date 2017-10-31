package org.packt.swarm.petstore.payment;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class PaymentService {

    public String payment(){
        try {
            Thread.sleep(10000);
        } catch(Exception e){

        }
        return "PAYMENT DONE";
    }


}
