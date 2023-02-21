package nttdata.bootcamp.quarkus.debitcard.repository;

import io.quarkus.mongodb.panache.reactive.ReactivePanacheMongoRepository;
import io.smallrye.mutiny.Multi;
import io.smallrye.mutiny.Uni;
import jakarta.enterprise.context.ApplicationScoped;
import nttdata.bootcamp.quarkus.debitcard.entity.Debitcard;
import org.bson.types.ObjectId;



@ApplicationScoped
public class DebitcardRepository implements ReactivePanacheMongoRepository<Debitcard> {

    public Uni<Debitcard> getByNumberCard(String cardnumber){
        return stream("cardnumber", cardnumber).toUni();
    }

    public Uni<Debitcard> saveDebitCard(Debitcard debitcard){
        return persist(debitcard);
    }

    public Uni<Debitcard> updateDebitCardById(String id , Debitcard debitcard){
        debitcard.setId(new ObjectId(id));
        return update(debitcard);
    }

    public Multi<Debitcard> listAllDebitCards(){
        return streamAll();
    }

    public Uni<Boolean> deleteDebitCardById(String id){
        Uni<Debitcard> debitcardUni = findById(new ObjectId(id));
        return debitcardUni.map( debitcard -> {
            debitcard.setEstadotarjeta("D");
            update(debitcard);
            Boolean a = true;
            return a;
        });
    }



}
