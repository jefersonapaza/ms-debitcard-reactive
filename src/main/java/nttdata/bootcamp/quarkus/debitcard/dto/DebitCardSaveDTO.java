package nttdata.bootcamp.quarkus.debitcard.dto;

public class DebitCardSaveDTO {

    public String cardnumber;
    public Integer pin;
    private String validationcode;

    private  String dniClient;

    public String getDniClient() {
        return dniClient;
    }

    public void setDniClient(String dniClient) {
        this.dniClient = dniClient;
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

    public String getValidationcode() {
        return validationcode;
    }

    public void setValidationcode(String validationcode) {
        this.validationcode = validationcode;
    }
}
