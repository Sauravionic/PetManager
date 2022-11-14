package ionic.petmanager.services;

import ionic.petmanager.model.Vet;

import java.util.Set;

public interface VetService {

    Vet findById(Long id);

    Vet save(Vet vet);

    Vet findByLastName(String lastName);

    Set<Vet> findAll();
}
