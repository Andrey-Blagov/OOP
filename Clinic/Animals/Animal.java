package Clinic.Animals;

import java.time.LocalDate;

public abstract class Animal {
    protected static int animalIdx;
    protected String name;
    protected LocalDate birthday;
    protected Illness illness;
    protected boolean isVaccinated;

    public Animal(String name, Illness illness, LocalDate birthday) {
        this.name = name;
        this.illness = illness;
        this.birthday = birthday;
        this.isVaccinated = false;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return this.getClass().getSimpleName();
    }

    public String getIllness() {
        return illness.getTitle();
    }

    public void setIllness(Illness illness) {
        this.illness = illness;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setIsVaccinated(boolean b) {
        this.isVaccinated = b;
    }

    public boolean getIsVaccinated() {
        return isVaccinated;
    }

    public void toEat() {
        System.out.println(this.getType() + " " + this.getName() + " eating..");
    }

    @Override
    public String toString() {
        return String.format("Animal: %s, %s, %s, vaccinated: %s, %s", this.getType(), this.getName(), this.getIllness(), this.getIsVaccinated(), this.getBirthday());
    }
}