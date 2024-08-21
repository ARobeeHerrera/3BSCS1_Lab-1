package FactoryPattern;
import java.util.Scanner;

public class Clinic {
    public static void main(String[] args) {
       
        Scanner scan = new Scanner(System.in);
       
        PetRecord petRecords = new PetRecord();
        Pet pet;
        boolean toRun = true;

        while (toRun) {
        System.out.println("[1] Dog");
        System.out.println("[2] Cat");
        System.out.println("[3] Exit");
        System.out.print("\nChoose your pet number: ");
        Integer choice = scan.nextInt();


        switch (choice) {
            case 1: pet = new Dog();
            petRecords.setPetName("Bantay");
            petRecords.setPetId("D01");
            petRecords.setPet(pet);
            ((Dog) pet).setBreed("Labrador");
            break;
            case 2: pet = new Cat();
            petRecords.setPetName("Muning");
            petRecords.setPetId("C01");
            petRecords.setPet(pet);
            ((Cat) pet).setNoOfLives(9);
            break;
            case 3: 
            default:
            System.out.println("Herrera, Angelo Robee");
            System.out.println("3BSCS-1");
            toRun = false;
            }
            
            if(toRun && petRecords.getPet() != null) {
                System.out.println("Type: " + petRecords.getPet().getClass().getSimpleName());
                System.out.println("Name: " + petRecords.getPetName());
                System.out.println("Pet ID: " + petRecords.getPetId());
                System.out.println("Sound of the " + petRecords.getPet().getClass().getSimpleName() + " is " + petRecords.getPet().makesound());
                System.out.println("Play mode: " + petRecords.getPet().play());
                System.out.println(petRecords.getPet().toString()+ "\n");
            }
        }
        scan.close();
    }
}   