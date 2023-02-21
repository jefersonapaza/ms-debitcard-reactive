package nttdata.bootcamp.quarkus.debitcard.service;

import io.smallrye.mutiny.Multi;
import io.smallrye.mutiny.Uni;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import nttdata.bootcamp.quarkus.debitcard.dto.DebitCardSaveDTO;
import nttdata.bootcamp.quarkus.debitcard.entity.Debitcard;
import nttdata.bootcamp.quarkus.debitcard.repository.DebitcardRepository;



@ApplicationScoped
public class DebitCardServiceImpl implements DebitCardService{


    @Inject
    DebitcardRepository debitcardRepository;

    @Override
    public Uni<Debitcard> getByNumberCard(String numberAccount) {
        return debitcardRepository.getByNumberCard(numberAccount);
    }

    @Override
    public Uni<Debitcard> saveDebitCard(DebitCardSaveDTO debitCardSaveDTO) {
        Debitcard debitcard = new Debitcard();
        debitcard.setCardnumber(debitCardSaveDTO.getCardnumber());
       // debitcard.setExpirationdate(debitCardSaveDTO.get);
        debitcard.setValidationcode(debitCardSaveDTO.getValidationcode());
        debitcard.setPin(debitCardSaveDTO.getPin());
        debitcard.setEstadotarjeta("A");
        debitcard.setDniClient(debitCardSaveDTO.getDniClient());

        return debitcardRepository.saveDebitCard(debitcard);
    }

    @Override
    public Uni<Debitcard> updateDebitCardById(String id, Debitcard debitcard) {
        return debitcardRepository.updateDebitCardById(id,debitcard);
    }

    @Override
    public Multi<Debitcard> listAll() {
        return debitcardRepository.listAllDebitCards();
    }

    @Override
    public Uni<Boolean> deleteDebitCardById(String id) {
        return debitcardRepository.deleteDebitCardById(id);
    }
}
