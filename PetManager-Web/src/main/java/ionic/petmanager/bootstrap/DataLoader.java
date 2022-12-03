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

    public DataLoader() {
        this.ownerService = new OwnerServiceMap();
        this.vetService = new VetServiceMap();
    }
    @Override
    public void run(String... args) throws Exception {

        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setFirstName("Saurav");
        owner1.setLastName("Srivastava");
        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner1.setId(2L);
        owner1.setFirstName("Ramsha");
        owner1.setLastName("Husain");
        ownerService.save(owner2);

        System.out.println("Owners Loaded");
        Vet vet1 = new Vet();
        vet1.setId(1L);
        vet1.setFirstName("Sam");
        vet1.setLastName("Curren");
        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet1.setId(2L);
        vet1.setFirstName("Peter");
        vet1.setLastName("Parker");
        vetService.save(vet1);

        System.out.println("Vets Loaded");
    }
}
