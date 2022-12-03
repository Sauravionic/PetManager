package ionic.petmanager.bootstrap;

import ionic.petmanager.model.Owner;
import ionic.petmanager.model.Pet;
import ionic.petmanager.model.Vet;
import ionic.petmanager.services.OwnerService;
import ionic.petmanager.services.VetService;
import ionic.petmanager.services.map.OwnerServiceMap;
import ionic.petmanager.services.map.VetServiceMap;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {

        Owner owner1 = new Owner();
        owner1.setFirstName("Saurav");
        owner1.setLastName("Srivastava");
        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Ramsha");
        owner2.setLastName("Husain");
        ownerService.save(owner2);

        System.out.println("Owners Loaded");
        Vet vet1 = new Vet();
        vet1.setFirstName("Sam");
        vet1.setLastName("Curren");
        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Peter");
        vet2.setLastName("Parker");
        vetService.save(vet2);

        System.out.println("Vets Loaded");
    }
}
