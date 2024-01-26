import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Animal cat = new Animal("Барсик", LocalDate.of(2020, 03, 20), new Illness("Лишай"));
        // System.out.println(cat.getName());
        // Animal animal = new Animal();
        // cat.setIllness(new Illness(null));
        // System.out.println(cat.getIllness());
        Animal dog = new Dog("Шарик", LocalDate.of(2020, 02, 10), new Illness("Лишай"));
        // System.out.println(dog.illness);
        // List<Animal> list = new ArrayList<>();
        // list.add(dog);
        // list.add(cat);
        // list.add(new Duck("Гусыня", LocalDate.of(2020, 03, 20), new Illness("Лишай"), 2));
        // list.add(cat);
        // System.out.println(list);
        Animal duck = new Duck("Марфа", LocalDate.of(2023, 02, 12), new Illness("Хворь"), 5);
        Animal dolphin = new Dolphin("Эмо", LocalDate.of(2001, 03, 15), new Illness("Не летает"), 305);
        // duck.lifeCycle();
        dog.skill();
        duck.skill();
        dolphin.skill();


              

    }

}