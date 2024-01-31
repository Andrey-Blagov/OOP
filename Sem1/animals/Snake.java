import java.time.LocalDate;

public class Snake extends Animal {

    static {
        Snake.animalIdx = 1;
    }

    public Snake(String name, Illness illness, LocalDate birtDay) {
        super(name, illness, birtDay);
    }

    public Snake(String name) {
        this(name, new Illness("Osteochondrosis"), LocalDate.of(2000, 6, 13));
    }

    public Snake() {
        this(String.format("Snake_#%d", animalIdx++));
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

}