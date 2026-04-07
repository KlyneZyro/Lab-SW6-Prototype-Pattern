public class Horse implements Animal {
    private Integer legs = 4;
    private String sound = "Neigh";
    private String food = "Hay";
    private String color = "Brown";

    @Override
    public Animal clone() {
        try {
            return (Animal) super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("Cloning failed for Horse");
            return null;
        }
    }

    @Override
    public void makeSound() {
        System.out.println(sound);
    }

    @Override
    public String getType() {
        return "Horse";
    }

    @Override
    public String toString() {
        return "Horse [color=" + color + ", legs=" + legs + ", sound=" + sound + ", food=" + food + "]";
    }
}