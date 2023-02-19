package nttdata.bootcamp.quarkus.bankaccount;

import entity.Comment;
import io.smallrye.mutiny.Multi;
import io.smallrye.mutiny.Uni;
import nttdata.bootcamp.quarkus.bankaccount.dto.BankaccountSaveDTO;
import nttdata.bootcamp.quarkus.bankaccount.entity.Bankaccount;
import nttdata.bootcamp.quarkus.bankaccount.service.BankAccountService;
import org.bson.types.ObjectId;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/api/bank")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class BankAccountResourceReactive {




    @Inject
    private BankAccountService service;



    @GET
    @Path("/all")
    @Produces(MediaType.APPLICATION_JSON)
    public Multi<Bankaccount> getAllBankAccount() {
        return service.listAll();
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Uni<Bankaccount> getByNumberAccount(@QueryParam("number") String number) {
        return service.getByNumberAccount(number);
    }

    @POST
    @Path("/saveaccount")
    @Produces(MediaType.APPLICATION_JSON)
    public Uni<Bankaccount> saveBankAccount(BankaccountSaveDTO bankaccountSaveDTO) {
        return service.saveBankAccount(bankaccountSaveDTO);
    }


    @PUT
    @Path("update/{id}")
    public Uni<Bankaccount>  updateBankAccount(@PathParam("id") String id,Bankaccount bankaccount) {
        return service.updateBankAccountById(id,bankaccount);
    }

    @DELETE
    @Path("{id}")
    public Uni<Boolean> deleteBankAccount(@PathParam("id") String id) {
        return service.deleteBankAccountById(id);
    }










}
