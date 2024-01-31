import java.time.LocalDate;

public class Fish extends Animal {

    static {
        Fish.animalIdx = 1;
    }

    public Fish(String name, Illness illness, LocalDate birtDay) {
        super(name, illness, birtDay);
    }

    public Fish(String name) {
        this(name, new Illness("Sclerosis"), LocalDate.of(2000, 6, 13));
    }

    public Fish() {
        this(String.format("Fish_#%d", animalIdx++));
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
    public void toWalk() {
        System.out.println(this.getType() + " can't walk");
    }

    @Override
    public String toString() {
        return String.format("Animal: %s, %s, %s, %s", this.getType(), getName(), getIllness(), getBirthDay());
    }

}