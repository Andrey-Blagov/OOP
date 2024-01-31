import java.time.LocalDate;

public class Dog extends Animal implements Walkable {

    static {
        Dog.animalIdx = 1;
    }

    public Dog(String name, Illness illness, LocalDate birtDay) {
        super(name, illness, birtDay);
    }

    public Dog(String name) {
        this(name, new Illness("Fleas"), LocalDate.of(2020, 1, 1));
    }

    public Dog() {
        this(String.format("Dog_#%d", animalIdx++));
    }

    @Override
    public void toEat() {
        System.out.println("eating..");
    }

    @Override
    public void toFly() {
        System.out.println(this.getType() + " can't fly");
    }

    @Override
    public String toString() {
        return String.format("Animal: %s, %s, %s, %s", this.getType(), getName(), getIllness(), getBirthDay());
    }

    @Override
    public double walk() {
        return 5;
    }
}
