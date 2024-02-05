package Clinic.Animals.impl;

import java.time.LocalDate;

import Clinic.Animals.Animal;
import Clinic.Animals.Flyable;
import Clinic.Animals.Goable;
import Clinic.Animals.Illness;
import Clinic.Animals.Swimable;

public class Duck extends Animal implements Goable, Flyable, Swimable {
    private final int wingCount;

    static {
        animalIdx = 1;
    }

    public Duck(String name, Illness illness, LocalDate birthday, int wingCount) {
        super(name, illness, birthday);
        this.wingCount = wingCount;
    }

    public Duck(String name) {
        this(name, new Illness("Гусыня"), LocalDate.of(2023, 1, 1), 3);
    }

    public Duck() {
        this(String.format("Duck_#%d", animalIdx++));
    }

    private int getWingCount() {
        return wingCount;
    }

    @Override
    public double run() {
        return 1D;
    }

    @Override
    public double fly() {
        return 13D;
    }

    @Override
    public double swim() {
        return 4D;
    }
}