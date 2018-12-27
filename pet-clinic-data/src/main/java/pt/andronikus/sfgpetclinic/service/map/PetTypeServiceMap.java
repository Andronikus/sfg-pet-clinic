package pt.andronikus.sfgpetclinic.service.map;

import org.springframework.stereotype.Service;
import pt.andronikus.sfgpetclinic.model.PetType;
import pt.andronikus.sfgpetclinic.service.PetTypeService;

import java.util.Set;

@Service
public class PetTypeServiceMap extends AbstractMapService<PetType,Long> implements PetTypeService {
    @Override
    public PetType findById(Long aLong) {
        return super.findByID(aLong);
    }

    @Override
    public Set<PetType> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);

    }

    @Override
    public void delete(PetType object) {
        super.delete(object);
    }

    @Override
    public PetType save(PetType object) {
        return super.save(object);
    }
}
