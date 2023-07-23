package mihai.springframework.sfgpetclinic.model.repositories;

import mihai.springframework.sfgpetclinic.model.Visit;
import org.springframework.data.repository.CrudRepository;

public interface VisitRepository extends CrudRepository<Visit,Long> {
}
