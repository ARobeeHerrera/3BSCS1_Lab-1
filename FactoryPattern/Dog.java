package FactoryPattern;

public class Dog implements Pet {
    private String breed;

    public String getBreed(){
        return breed;
    }
    
    public void setBreed(String breed) {
        this.breed = breed;
    }
    
    @Override
    public String play() {
        return "Playing ball!";
    }

    @Override
    public String makesound() {
        return "Arf Arf!";
    }

}