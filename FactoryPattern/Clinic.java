package FactoryPattern;
import java.util.Scanner;

public class Clinic {
    public static void main(String[] args) {
       
        Scanner scan = new Scanner(System.in);

        System.out.println("[1] Dog");
        System.out.println("[2] Cat");
        System.out.print("\nChoose your pet number: ");
        Integer choice = scan.nextInt();

        PetRecord petRecords = new PetRecord();
        Pet pet;

        switch (choice) {
            case 1: pet = new Cat();
            petRecords.setPetId("d1");
            petRecords.setPetName("Muning");
            petRecords.setPet(pet);
            ((Cat) pet).setNoOfLives(2);
        }
        

    }
}