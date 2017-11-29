package org.packt.swarm.petstore.payment;

import org.packt.swarm.petstore.payment.model.Payment;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

@Path("/")
public class PaymentResource {

    @POST
    @Path("payment")
    @Produces(MediaType.APPLICATION_JSON)
    public String createPayment(@QueryParam("merchantId") String merchantId, @QueryParam("description") String description, @QueryParam("amount") int amount){
        return UUID.randomUUID().toString();
    }

    @GET
    @Path("payment/{uid}/status")
    @Produces(MediaType.APPLICATION_JSON)
    public String getStatus(@QueryParam("uid") String paymentId){
        LockSupport.parkNanos(TimeUnit.SECONDS.toNanos(10));
        return Payment.State.NEW.toString();
    }

}
