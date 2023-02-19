package nttdata.bootcamp.quarkus.bankaccount.service;

import io.smallrye.mutiny.Multi;
import io.smallrye.mutiny.Uni;
import nttdata.bootcamp.quarkus.bankaccount.dto.BankaccountSaveDTO;
import nttdata.bootcamp.quarkus.bankaccount.entity.Bankaccount;

public interface BankAccountService {



    public Uni<Bankaccount> getByNumberAccount(String numberAccount);

    public Uni<Bankaccount> saveBankAccount(BankaccountSaveDTO bankAccount);

    public Uni<Bankaccount> updateBankAccountById(String id , Bankaccount bankaccount);

    public Multi<Bankaccount> listAll();

    public Uni<Boolean> deleteBankAccountById(String id);

}
