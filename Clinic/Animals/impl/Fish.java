package Clinic.Animals.impl;

import java.time.LocalDate;

import Clinic.Animals.Animal;
import Clinic.Animals.Illness;
import Clinic.Animals.Swimable;;

public class Fish extends Animal implements Swimable {

    static {
        animalIdx = 1;
    }

    public Fish(String name, Illness illness, LocalDate birthday) {
        super(name, illness, birthday);
    }

    public Fish(String name) {
        this(name, new Illness("Nemo"), LocalDate.of(2010, 8, 13));
    }

    public Fish() {
        this(String.format("Fish_#%d", animalIdx++));
    }

    @Override
    public double swim() {
        return 15D;
    }
}