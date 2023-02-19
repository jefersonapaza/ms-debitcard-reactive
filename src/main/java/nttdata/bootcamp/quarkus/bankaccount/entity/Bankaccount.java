package nttdata.bootcamp.quarkus.bankaccount.entity;

import entity.Comment;
import io.quarkus.mongodb.panache.reactive.ReactivePanacheMongoEntity;
import io.smallrye.mutiny.Multi;
import org.bson.types.ObjectId;

import java.util.Date;

public class Bankaccount extends ReactivePanacheMongoEntity {


    private ObjectId id;

    public String numberaccount;
    public Date openingdate;

    public String description;

    public Double amount ;

    public String mainaccount;

    public String estadotarjeta;

    public static Multi<Bankaccount> streamAllBankAccounts() {
        return streamAll();
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getNumberaccount() {
        return numberaccount;
    }

    public void setNumberaccount(String numberaccount) {
        this.numberaccount = numberaccount;
    }

    public Date getOpeningdate() {
        return openingdate;
    }

    public void setOpeningdate(Date openingdate) {
        this.openingdate = openingdate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getMainaccount() {
        return mainaccount;
    }

    public void setMainaccount(String mainaccount) {
        this.mainaccount = mainaccount;
    }

    public String getEstadotarjeta() {
        return estadotarjeta;
    }

    public void setEstadotarjeta(String estadotarjeta) {
        this.estadotarjeta = estadotarjeta;
    }
}
