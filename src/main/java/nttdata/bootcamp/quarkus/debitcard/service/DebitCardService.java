package nttdata.bootcamp.quarkus.debitcard.service;

import io.smallrye.mutiny.Multi;
import io.smallrye.mutiny.Uni;
import nttdata.bootcamp.quarkus.debitcard.dto.DebitCardSaveDTO;
import nttdata.bootcamp.quarkus.debitcard.entity.Debitcard;

public interface DebitCardService {

    public Uni<Debitcard> getByNumberCard(String numberAccount);

    public Uni<Debitcard> saveDebitCard(DebitCardSaveDTO debitCardSaveDTO);

    public Uni<Debitcard> updateDebitCardById(String id , Debitcard bankaccount);

    public Multi<Debitcard> listAll();

    public Uni<Boolean> deleteDebitCardById(String id);
}
