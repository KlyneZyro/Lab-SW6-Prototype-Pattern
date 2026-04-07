public class Sheep implements Animal {
    private Integer legs = 4;
    private String sound = "Baa";
    private String food = "Grass";
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public Animal clone() {
        try {
            return (Animal) super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("Cloning failed for Sheep");
            return null;
        }
    }

    @Override
    public void makeSound() {
        System.out.println(sound);
    }

    @Override
    public String getType() {
        return "Sheep";
    }

    @Override
    public String toString() {
        return "Sheep [Name=" + name + ", legs=" + legs + ", sound=" + sound + ", food=" + food + "]";
    }
}