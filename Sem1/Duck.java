import java.time.LocalDate;

public class Duck extends Animal {
    public Duck(String name, LocalDate birthDay, Illness illness, int wingQuantity) {
        super(name, birthDay, illness);
    }
}