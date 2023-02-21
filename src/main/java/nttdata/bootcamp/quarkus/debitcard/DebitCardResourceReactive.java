package nttdata.bootcamp.quarkus.debitcard;

import io.smallrye.mutiny.Multi;
import io.smallrye.mutiny.Uni;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import nttdata.bootcamp.quarkus.debitcard.dto.DebitCardSaveDTO;
import nttdata.bootcamp.quarkus.debitcard.entity.Debitcard;
import nttdata.bootcamp.quarkus.debitcard.service.DebitCardService;

@Path("/api/debitcard")
public class DebitCardResourceReactive {


    @Inject
    private DebitCardService service;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Hello from RESTEasy Reactive debit card";
    }





    @GET
    @Path("/all")
    @Produces(MediaType.APPLICATION_JSON)
    public Multi<Debitcard> getAllBankAccount() {
        return service.listAll();
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Uni<Debitcard> getByNumberCard(@QueryParam("number") String number) {
        return service.getByNumberCard(number);
    }

    @POST
    @Path("/save")
    @Produces(MediaType.APPLICATION_JSON)
    public Uni<Debitcard> saveDebitCard(DebitCardSaveDTO debitCardSaveDTO) {
        return service.saveDebitCard(debitCardSaveDTO);
    }


    @PUT
    @Path("update/{id}")
    public Uni<Debitcard>  updateDebitCard(@PathParam("id") String id,Debitcard debitcard) {
        return service.updateDebitCardById(id,debitcard);
    }

    @DELETE
    @Path("{id}")
    public Uni<Boolean> deleteBankAccount(@PathParam("id") String id) {
        return service.deleteDebitCardById(id);
    }


}
