package nttdata.bootcamp.quarkus.debitcard.entity;

import io.quarkus.mongodb.panache.common.MongoEntity;
import io.quarkus.mongodb.panache.reactive.ReactivePanacheMongoEntity;
import org.bson.types.ObjectId;


import java.util.Date;

@MongoEntity(collection="debitcard")
public class Debitcard extends ReactivePanacheMongoEntity {

    private ObjectId id;
    public String cardnumber;
    public Integer pin;
    public Date expirationdate;
    public String validationcode;

    public String estadotarjeta;

    public String dniClient;


    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getCardnumber() {
        return cardnumber;
    }

    public void setCardnumber(String cardnumber) {
        this.cardnumber = cardnumber;
    }

    public Integer getPin() {
        return pin;
    }

    public void setPin(Integer pin) {
        this.pin = pin;
    }

    public Date getExpirationdate() {
        return expirationdate;
    }

    public void setExpirationdate(Date expirationdate) {
        this.expirationdate = expirationdate;
    }

    public String getValidationcode() {
        return validationcode;
    }

    public void setValidationcode(String validationcode) {
        this.validationcode = validationcode;
    }

    public String getEstadotarjeta() {
        return estadotarjeta;
    }

    public void setEstadotarjeta(String estadotarjeta) {
        this.estadotarjeta = estadotarjeta;
    }

    public String getDniClient() {
        return dniClient;
    }

    public void setDniClient(String dniClient) {
        this.dniClient = dniClient;
    }
}