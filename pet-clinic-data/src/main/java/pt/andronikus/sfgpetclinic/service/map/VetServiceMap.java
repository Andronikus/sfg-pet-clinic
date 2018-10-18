package pt.andronikus.sfgpetclinic.service.map;

import pt.andronikus.sfgpetclinic.model.Vet;
import pt.andronikus.sfgpetclinic.service.CrudService;
import pt.andronikus.sfgpetclinic.service.VetService;

import java.util.Set;

public class VetServiceMap extends AbstractMapService<Vet,Long> implements VetService {

    @Override
    public Vet findById(Long id) {
        return super.findByID(id);
    }

    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public Vet save(Vet object) {
        return super.save(object.getId(),object);
    }

    @Override
    public void delete(Vet object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
