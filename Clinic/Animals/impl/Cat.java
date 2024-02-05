package Clinic.Animals.impl;

import java.time.LocalDate;

import Clinic.Animals.Animal;
import Clinic.Animals.Goable;
import Clinic.Animals.Illness;

public class Cat extends Animal implements Goable {

    static {
        animalIdx = 1;
    }

    public Cat(String name, Illness illness, LocalDate birthday) {
        super(name, illness, birthday);
    }

    public Cat(String name) {
        this(name, new Illness("Мурка"), LocalDate.of(2010, 11, 13));
    }

    public Cat() {
        this(String.format("Cat_#%d", animalIdx++));
    }

    @Override
    public double run() {
        return 9;
    }
}