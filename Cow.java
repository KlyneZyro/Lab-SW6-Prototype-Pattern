public class Cow implements Animal {
    private Integer legs = 4;
    private String sound = "Moo";
    private String food = "Grass";

    @Override
    public Animal clone() {
        try {
            return (Animal) super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("Cloning failed for Cow");
            return null;
        }
    }

    @Override
    public void makeSound() {
        System.out.println(sound);
    }

    @Override
    public String getType() {
        return "Cow";
    }

    @Override
    public String toString() {
        return "Cow [legs=" + legs + ", sound=" + sound + ", food=" + food + "]";
    }
}