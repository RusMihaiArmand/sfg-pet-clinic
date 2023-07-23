package mihai.springframework.sfgpetclinic.model.repositories;

import mihai.springframework.sfgpetclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet,Long> {
}
