package folder.middle.repository;

import folder.middle.blockr.Baza;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BazaRep extends CrudRepository<Baza, Long> {

}