package FactoryPattern;

public class PetRecord {
    private String petId;
    private String petName;
    private Pet pet;

    public String getPetId() {
        return petId;
    }

    public void setPetId(String petID) {
        this.petId = petID;
    }

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

}