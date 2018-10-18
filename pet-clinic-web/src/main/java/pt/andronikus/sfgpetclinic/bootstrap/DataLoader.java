package pt.andronikus.sfgpetclinic.bootstrap;

import org.springframework.boot.CommandLineRunner;
import pt.andronikus.sfgpetclinic.model.Owner;
import pt.andronikus.sfgpetclinic.model.Vet;
import pt.andronikus.sfgpetclinic.service.OwnerService;
import pt.andronikus.sfgpetclinic.service.VetService;
import pt.andronikus.sfgpetclinic.service.map.OwnerServiceMap;
import pt.andronikus.sfgpetclinic.service.map.VetServiceMap;

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
        owner1.setFirstName("Tiago");
        owner1.setLastName("Roque");

        Owner owner2 = new Owner();
        owner2.setId(2L);
        owner2.setFirstName("Andronikus");
        owner2.setLastName("Matias");

        ownerService.save(owner1);
        ownerService.save(owner2);

        System.out.println("Load owners done!");

        Vet vet1 = new Vet();
        vet1.setId(1L);;
        vet1.setFirstName("Mia");
        vet1.setLastName("Axe");

        Vet vet2 = new Vet();
        vet2.setId(2L);
        vet2.setFirstName("Lucy");
        vet2.setLastName("Axe");

        vetService.save(vet1);
        vetService.save(vet2);

        System.out.println("Load vets done!");
    }
}
