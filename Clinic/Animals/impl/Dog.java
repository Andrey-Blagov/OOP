package Clinic.Animals.impl;

import java.time.LocalDate;

import Clinic.Animals.Animal;
import Clinic.Animals.Goable;
import Clinic.Animals.Illness;
import Clinic.Animals.Swimable;


public class Dog extends Animal implements Goable, Swimable {

    static {
        animalIdx = 1;
    }

    public Dog(String name, Illness illness, LocalDate birthday) {
        super(name, illness, birthday);
    }

    public Dog(String name) {
        this(name, new Illness("Жучка"), LocalDate.of(2001, 10, 5));
    }

    public Dog() {
        this(String.format("Dog_#%d", animalIdx++));
    }

    @Override
    public double run() {
        return 8D;
    }

    @Override
    public double swim() {
        return 6D;
    }
}