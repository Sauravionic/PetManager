package ionic.petmanager.services;

import ionic.petmanager.model.Owner;

import java.util.Set;

public interface OwnerService extends CrudService<Owner,Long> {
    Owner findByLastName(String lastName);

}
