package pt.andronikus.sfgpetclinic.service;

import pt.andronikus.sfgpetclinic.model.Vet;

import java.util.Set;

public interface VetService {
    Vet findById(Long id);

    Set<Vet> findAll();

    Vet save(Vet vet);
}
