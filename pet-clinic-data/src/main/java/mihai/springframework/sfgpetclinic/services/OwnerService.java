package mihai.springframework.sfgpetclinic.services;
import mihai.springframework.sfgpetclinic.model.Owner;
import java.util.Set;


public interface OwnerService extends CrudService<Owner,Long> {


    Owner findByLastName(String lastName);



}
