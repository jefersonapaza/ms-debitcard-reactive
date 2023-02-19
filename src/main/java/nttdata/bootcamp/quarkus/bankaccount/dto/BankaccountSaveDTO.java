package nttdata.bootcamp.quarkus.bankaccount.dto;

import io.smallrye.mutiny.Uni;
import nttdata.bootcamp.quarkus.bankaccount.entity.Bankaccount;

import java.util.Date;

public class BankaccountSaveDTO {

    public String numberaccount;

    public String description;

    public Double amount ;

    public String mainaccount;

    public Uni<Bankaccount> validator(){
        if(this.numberaccount == null || this.numberaccount.trim().equals("")){
            return Uni.createFrom().failure(new IllegalArgumentException("Number-Account cannot be empty or zero "));
        }
        if(this.description == null || this.description.trim().equals("")){
            return Uni.createFrom().failure(new IllegalArgumentException("Description cannot be empty "));
        }
        if(this.amount == null || this.amount <= 0F ){
            return Uni.createFrom().failure(new IllegalArgumentException("Amount cannot be empty or zero "));
        }
        if(this.mainaccount == null || this.mainaccount.trim().equals("")){
            return Uni.createFrom().failure(new IllegalArgumentException("Main-Account cannot be empty "));
        }
        return Uni.createFrom().nothing();

    }

    public String getNumberaccount() {
        return numberaccount;
    }

    public void setNumberaccount(String numberaccount) {
        this.numberaccount = numberaccount;
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
}
