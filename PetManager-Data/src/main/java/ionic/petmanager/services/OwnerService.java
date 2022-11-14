package ionic.petmanager.services;

import ionic.petmanager.model.Owner;

import java.util.Set;

public interface OwnerService {

    Owner findById(Long Id);

    Owner save(Owner owner);

    Owner findByLastName(String lastName);

    Set<Owner> findAll();

}
