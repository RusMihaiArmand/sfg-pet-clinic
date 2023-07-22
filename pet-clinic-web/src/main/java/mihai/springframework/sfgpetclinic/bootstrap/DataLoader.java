package mihai.springframework.sfgpetclinic.bootstrap;

import mihai.springframework.sfgpetclinic.model.Owner;
import mihai.springframework.sfgpetclinic.model.Vet;
import mihai.springframework.sfgpetclinic.services.OwnerService;
import mihai.springframework.sfgpetclinic.services.VetService;
import mihai.springframework.sfgpetclinic.services.map.OwnerServiceMap;
import mihai.springframework.sfgpetclinic.services.map.VetServiceMap;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader(){
        ownerService = new OwnerServiceMap();
        vetService = new VetServiceMap();

    }


    @Override
    public void run(String... args) throws Exception {

        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setFirstName("Mike");
        owner1.setLastName("West");

        ownerService.save(owner1);


        Owner owner2 = new Owner();
        owner2.setId(1L);
        owner2.setFirstName("Tike");
        owner2.setLastName("East");

        ownerService.save(owner2);

        System.out.println("Loaded Owners...");




        Vet vet1 = new Vet();
        vet1.setId(1L);
        vet1.setFirstName("Sam");
        vet1.setLastName("Axe");

        vetService.save(vet1);


        Vet vet2 = new Vet();
        vet2.setId(1L);
        vet2.setFirstName("Sammy");
        vet2.setLastName("Wood");

        vetService.save(vet2);

        System.out.println("Loaded Vets...");


    }
}