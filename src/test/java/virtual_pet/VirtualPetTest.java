package virtual_pet;
import java.util.Scanner;

public class VirtualPetTest {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      String petName = "";

      System.out.println("What is your pet's name? ");
      petName = scanner.nextLine();

      VirtualPet pet = new VirtualPet(petName, 50, 50, 50, 50, 50);


       while (true) {
            System.out.println(pet.getName());
            System.out.println("Hunger: " + pet.getHunger());
            System.out.println("Thirst: " + pet.getThirst());
            System.out.println("Waste: " + pet.getWaste());
            System.out.println("Boredom: " + pet.getBoredom());
            System.out.println("Sickness: " + pet.getSickness());
            System.out.println("What would you like to do?");
            System.out.println("1. Feed");
            System.out.println("2. Water");
            System.out.println("3. Clean");
            System.out.println("4. Play");
            System.out.println("5. Vet");
            System.out.println("6. Nothing");
            System.out.println("7. Quit");
            int choice = scanner.nextInt();
            System.out.println("--------------------");
            switch (choice) {
              case 1:
                pet.feed();
                System.out.println("You fed " + petName + ".");
                break;
              case 2:
                pet.water();
                System.out.println("You water " + pet.getName() + ".");
                break;
              case 3:
                pet.clean();
                System.out.println("You clean " + pet.getName() + "'s waste.");
                break;
              case 4:
                pet.play();
                System.out.println("You play with " + pet.getName() + ".");
                break;
              case 5:
                pet.vet();
                System.out.println("You take " + pet.getName() + " to the vet.");
                break;
              case 6:
                pet.nothing();
                System.out.println("You do nothing.");
                break;
              case 7:
                System.out.println("Thank you for playing Virtual Pet! Goodbye!");
                System.exit(0);
              default:
                System.out.println("Invalid choice. Please try again.");
                break;
            }
            pet.tick(); 
        }
    }

}
