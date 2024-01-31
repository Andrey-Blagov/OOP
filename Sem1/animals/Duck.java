import java.time.LocalDate;

public class Duck extends Animal {
    private final int wingCount;

    static {
        Duck.animalIdx = 1;
    }

    public Duck(String name, Illness illness, LocalDate birtDay, int wingCount) {
        super(name, illness, birtDay);
        this.wingCount = wingCount;
    }

    public Duck(String name) {
        this(name, new Illness("Lame"), LocalDate.of(2020, 1, 1), 2);
    }

    public Duck() {
        this(String.format("Duck_#%d", animalIdx++));
    }

    @Override
    public void toEat() {
        System.out.println("eating..");
    }

    private int getWingCount() {
        return wingCount;
    }

    @Override
    public String toString() {
        return String.format("Animal: %s, %s, %s, %s, %d", this.getType(), getName(), getIllness(), getBirthDay(), this.getWingCount());
    }
}