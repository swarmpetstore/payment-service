package org.packt.swarm.petstore.payment;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/")
public class PaymentResource {

    @Inject
    PaymentService paymentService;

    @GET
    @Path("payment")
    @Produces(MediaType.APPLICATION_JSON)
    public String payment(){
        return paymentService.payment();
    }

}
