import java.util.Scanner;

class Pet {
  private String name;
  private int age;
  private String species;

  public Pet(String name, int age, String species) {
    this.name = name;
    this.age = age;
    this.species = species;
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  public String getSpecies() {
    return species;
  }
}

public class PetApp {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the name of your pet: ");
    String name = input.nextLine();
    System.out.print("Enter the age of your pet: ");
    int age = input.nextInt();
    input.nextLine(); // Consume the newline character
    System.out.print("Enter the species of your pet: ");
    String species = input.nextLine();

    Pet pet = new Pet(name, age, species);
    System.out.println("Name: " + pet.getName());
    System.out.println("Age: " + pet.getAge());
    System.out.println("Species: " + pet.getSpecies());
  }
}