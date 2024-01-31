import java.time.LocalDate;

public class Cat extends Animal implements Huntable, Walkable {

    static {
        Cat.animalIdx = 1;
    }

    public Cat(String name, Illness illness, LocalDate birtDay) {
        super(name, illness, birtDay);
    }

    public Cat(String name) {
        this(name, new Illness("Fleas"), LocalDate.of(2021, 12, 1));
    }

    public Cat() {
        this(String.format("Cat_#%d", animalIdx++));
    }

    @Override
    public void toFly() {
        System.out.println(this.getType() + " can't fly");
    }

    @Override
    public void toSwim() {
        System.out.println(this.getType() + " can't swim");
    }

    @Override
    public void toEat() {
        System.out.println("eating..");
    }

    @Override
    public String toString() {
        return String.format("Animal: %s, %s, %s, %s", this.getType(), getName(), getIllness(), getBirthDay());
    }

    @Override
    public double walk() {
        return 7;
    }
}