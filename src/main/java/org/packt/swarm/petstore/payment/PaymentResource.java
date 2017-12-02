package org.packt.swarm.petstore.payment;

import org.packt.swarm.petstore.payment.model.Payment;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.UUID;

@Path("/")
public class PaymentResource {

    @POST
    @Path("payment")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public String createPayment(Payment payment){
        //LockSupport.parkNanos(TimeUnit.SECONDS.toNanos(10));
        return UUID.randomUUID().toString();
    }

}
