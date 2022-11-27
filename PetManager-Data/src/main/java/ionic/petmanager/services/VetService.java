package ionic.petmanager.services;

import ionic.petmanager.model.Vet;

import java.util.Set;

public interface VetService extends CrudService<Vet, Long> {
    Vet findByLastName(String lastName);
}
