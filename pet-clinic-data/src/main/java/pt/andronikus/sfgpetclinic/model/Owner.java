package pt.andronikus.sfgpetclinic.model;

import org.springframework.core.style.ToStringCreator;

import java.util.Set;

public class Owner extends Person {

    private String address;
    private String city;
    private String telephone;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    private Set<Pet> pets;

    public Set<Pet> getPets() {
        return pets;
    }

    public void setPets(Set<Pet> pets) {
        this.pets = pets;
    }

    public String toString(){
        return new ToStringCreator(this).append("id",this.getId())
                                             .append("firstName", this.getFirstName())
                                             .append("lastname", this.getLastName())
                                             .append("address", this.getAddress())
                                             .append("city",this.getAddress())
                                             .append("telephone", this.getTelephone()).toString();
    }
}
