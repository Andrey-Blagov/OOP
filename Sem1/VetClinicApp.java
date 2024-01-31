import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import interfaces.Mathable;
import interfaces.Walkable;

public class VetClinicApp {
    public static void main(String[] args) {
    final ArrayList<Animal> animals = new ArrayList<>(Arrays.asList(new Duck("Donald", new Illness("Grey"), LocalDate.now(), 2), new Duck(), new Dog(), new Cat(), new Fish(), new Fish(), new Snake("Elena Anatolevna")));

        for (Animal a : animals) {
            System.out.println(a);
            a.toWalk();
            a.toSwim();
            a.toFly();
            System.out.println("-------------");

            final ArrayList<Walkable> walkers = new ArrayList<>(Arrays.asList(new Cat(), new Dog()));
            System.out.println(walkers + "\n---------------");

            Animal cat = new Cat();
            Animal dog = new Dog();

            for (Walkable w : walkers) {
                System.out.println(w.walk());
                w.defaultWalk(10);
            }

            final Walkable walkable = new Walkable() {
                @Override
                public double walk() {
                    return 0;
                }
            };

            final Walkable walkable1 = () -> 12;

            Mathable mathable = new Mathable() {
                @Override
                public double addition(double a, double b) {
                    return a + b;
                }
            };

            Mathable mathable1 = (x, y) -> x + y;
            Mathable mathable2 = Double::sum;
        }


              

    }

}