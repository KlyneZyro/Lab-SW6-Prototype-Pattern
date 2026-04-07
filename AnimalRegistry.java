public class AnimalRegistry {
    private Sheep sheepPrototype;
    private Cow cowPrototype;
    private Horse horsePrototype;

    public AnimalRegistry() {
        // Initialize the master prototypes once
        sheepPrototype = new Sheep();
        cowPrototype = new Cow();
        horsePrototype = new Horse();
    }

    public Animal createSheep(String name) {
        // Clone the prototype and modify its state
        Sheep clonedSheep = (Sheep) sheepPrototype.clone();
        clonedSheep.setName(name);
        return clonedSheep;
    }

    public Animal createCow() {
        return cowPrototype.clone();
    }

    public Animal createHorse() {
        return horsePrototype.clone();
    }
}