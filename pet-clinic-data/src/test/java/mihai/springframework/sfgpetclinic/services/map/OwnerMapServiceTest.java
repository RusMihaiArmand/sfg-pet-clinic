package mihai.springframework.sfgpetclinic.services.map;

import mihai.springframework.sfgpetclinic.model.Owner;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class OwnerMapServiceTest {

    OwnerMapService ownerMapService;
    final Long ownerId = 1L;
    final String ownerName = "Smith";

    @BeforeEach
    void setUp()
    {
        ownerMapService = new OwnerMapService(new PetTypeMapService(), new PetMapService());

        Owner ow = new Owner();
        ow.setId(ownerId);
        ow.setLastName(ownerName);

        //ownerMapService.save(Owner.builder().id(1L).build());
        ownerMapService.save(ow);
    }

    @Test
    void findAll() {
        Set<Owner> ownerSet = ownerMapService.findAll();
        assertEquals(1,ownerSet.size());
    }

    @Test
    void findById() {
        Owner owner = ownerMapService.findById(ownerId);
        assertEquals(ownerId,owner.getId());

    }

    @Test
    void saveExistingId() {
        //Owner owner2 = Owner.builder().id(2L).build();
        Long id2 = 2L;
        Owner ow2 = new Owner();
        ow2.setId(id2);
        Owner savedOwner = ownerMapService.save(ow2);

        assertEquals(id2, savedOwner.getId());
    }

    @Test
    void saveNoId() {
        //Owner owner2 = Owner.builder().id(2L).build();
        Owner ow = new Owner();
        Owner savedOwner = ownerMapService.save(ow);

        assertNotNull(savedOwner);
        assertNotNull(savedOwner.getId());
    }


    @Test
    void delete() {
        ownerMapService.delete(ownerMapService.findById(ownerId));

        assertEquals(0,ownerMapService.findAll().size());
    }

    @Test
    void deleteById() {
        ownerMapService.deleteById(ownerId);

        assertEquals(0,ownerMapService.findAll().size());
    }

    @Test
    void findByLastName() {
        Owner ow = ownerMapService.findByLastName(ownerName);

        assertNotNull(ow);
        assertEquals(ownerId, ow.getId());

    }

    @Test
    void findByLastNameNotFound() {
        Owner ow = ownerMapService.findByLastName("fawawf");

        assertNull(ow);

    }
}