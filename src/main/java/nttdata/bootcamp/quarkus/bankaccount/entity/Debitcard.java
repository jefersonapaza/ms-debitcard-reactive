package nttdata.bootcamp.quarkus.bankaccount.entity;

import io.quarkus.mongodb.panache.reactive.ReactivePanacheMongoEntity;



import java.util.Date;

public class Debitcard extends ReactivePanacheMongoEntity {

    public String cardnumber;
    public Integer pin;
    public Date expirationdate;
    public String validationcode;

}
