package nttdata.bootcamp.quarkus.bankaccount.service;

import io.smallrye.mutiny.Multi;
import io.smallrye.mutiny.Uni;
import nttdata.bootcamp.quarkus.bankaccount.dto.BankaccountSaveDTO;
import nttdata.bootcamp.quarkus.bankaccount.entity.Bankaccount;
import nttdata.bootcamp.quarkus.bankaccount.repository.BankaccountRepository;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.Date;

@ApplicationScoped
public class BankAccountServiceImpl implements BankAccountService{


    @Inject
    BankaccountRepository bankaccountRepository;



    @Override
    public Uni<Bankaccount> getByNumberAccount(String numberAccount) {
        return bankaccountRepository.findByNumberaccount(numberAccount);
    }

    @Override
    public Uni<Bankaccount> saveBankAccount(BankaccountSaveDTO bankaccountSaveDTO) {
        Bankaccount bankaccount = new Bankaccount();
        bankaccount.setEstadotarjeta("A");
        bankaccount.setAmount(bankaccountSaveDTO.getAmount());
        bankaccount.setDescription(bankaccountSaveDTO.getDescription());
        bankaccount.setMainaccount(bankaccountSaveDTO.getMainaccount());
        bankaccount.setNumberaccount(bankaccountSaveDTO.getNumberaccount());
        bankaccount.setOpeningdate(new Date());
        return bankaccountRepository.saveBankAccount(bankaccount);
    }

    @Override
    public Uni<Bankaccount> updateBankAccountById(String id, Bankaccount bankaccount) {
        return bankaccountRepository.updateBankAccount(id,bankaccount);
    }

    @Override
    public Multi<Bankaccount> listAll() {
        return bankaccountRepository.streamAll();
    }

    @Override
    public Uni<Boolean> deleteBankAccountById(String id) {
        return bankaccountRepository.deleteById(id);
    }


}
