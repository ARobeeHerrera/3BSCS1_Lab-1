package FactoryPattern;

public class Cat implements Pet {
    private Integer noOfLives;

    void setNoOfLives(Integer noOfLives) {
        this.noOfLives = noOfLives;
    }

    private Integer getNoOfLives() {
        return noOfLives;
    }
    
    @Override
    public String play() {
        return "Cathing something!";
    }

    @Override
    public String makesound() {
        return "Meow Meow!";
    }

    public String toString() {
        return "No of Lives: "+ getNoOfLives();
    }
}