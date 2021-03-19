package be.thomasmore.party.repositories;


import be.thomasmore.party.model.Party;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PartyRepository extends CrudRepository<Party, Integer> {
    List<Party> findAllBy();
}
