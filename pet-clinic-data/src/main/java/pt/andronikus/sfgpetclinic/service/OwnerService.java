package pt.andronikus.sfgpetclinic.service;

import pt.andronikus.sfgpetclinic.model.Owner;


public interface OwnerService extends CrudService<Owner,Long>{

    Owner findByLastName(String lastName);
}
