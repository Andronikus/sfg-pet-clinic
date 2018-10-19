package pt.andronikus.sfgpetclinic.service.map;

import org.springframework.stereotype.Service;
import pt.andronikus.sfgpetclinic.model.Pet;
import pt.andronikus.sfgpetclinic.service.CrudService;

import java.util.Set;

@Service
public class PetServiceMap extends AbstractMapService<Pet,Long> implements CrudService<Pet,Long> {

    @Override
    public Pet findById(Long id) {
        return super.findByID(id);
    }

    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public Pet save(Pet object) {
        return super.save(object.getId(),object);
    }

    @Override
    public void delete(Pet object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
