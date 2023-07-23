package mihai.springframework.sfgpetclinic.model.repositories;

import mihai.springframework.sfgpetclinic.model.Vet;
import org.springframework.data.repository.CrudRepository;

public interface VetRepository extends CrudRepository<Vet,Long> {
}
