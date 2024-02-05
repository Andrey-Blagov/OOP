package Clinic.Animals.impl;

import java.time.LocalDate;

import Clinic.Animals.Animal;
import Clinic.Animals.Goable;
import Clinic.Animals.Illness;
import Clinic.Animals.Swimable;


public class Snake extends Animal implements Goable, Swimable {

    static {
        animalIdx = 1;
    }

    public Snake(String name, Illness illness, LocalDate birthday) {
        super(name, illness, birthday);
    }

    public Snake(String name) {
        this(name, new Illness("Гадина"), LocalDate.of(2006, 6, 6));
    }

    public Snake() {
        this(String.format("Snake_#%d", animalIdx++));
    }

    @Override
    public double swim() {
        return 3D;
    }

    @Override
    public double run() {
        return 3D;
    }
}