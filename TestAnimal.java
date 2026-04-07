public class TestAnimal {
    public static void main(String[] args) {
        // Create the registry (this instantiates the 3 prototypes)
        AnimalRegistry registry = new AnimalRegistry();

        System.out.println("--- Cloning Animals from Registry ---");
        
        // Request clones
        Animal mySheep1 = registry.createSheep("Dolly");
        Animal mySheep2 = registry.createSheep("Shaun");
        Animal myCow = registry.createCow();
        Animal myHorse = registry.createHorse();

        // Output results
        System.out.println(mySheep1);
        System.out.println(mySheep2);
        System.out.println(myCow);
        System.out.println(myHorse);

        System.out.println("\n--- Testing Behaviors ---");
        System.out.print(mySheep1.getType() + " says: ");
        mySheep1.makeSound();
        
        System.out.print(myCow.getType() + " says: ");
        myCow.makeSound();
    }
}