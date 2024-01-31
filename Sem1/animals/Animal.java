import java.time.LocalDate;

public abstract class Animal {
    protected String name;
    protected LocalDate birthDay;
    protected Illness illness;

    public Animal(String name, Illness illness, LocalDate birthDay){
        this.name = name; 
        this.birthDay = birthDay;
        this.illness = illness; 
    }

    public Animal() {
        this("Mursik", new Illness("Blokhi"), LocalDate.now());
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

    public LocalDate getBirthDay() {
        return birthDay;
    }

    private void wakeUp(String time) {
        System.out.println(this.getType() + " is wake up in " + time);
    }

    private void hunt() {
        System.out.println(this.getType() + " is hunting!");
    }

    private void eat() {
        System.out.println(this.getType() + " is eating!");
    }

    private void sleep() {
        System.out.println(this.getType() + " is sleeping!");
    }

    public void lifeCycle() {
        this.wakeUp("12:34");
        this.hunt();
        this.eat();
        this.sleep();
    }

    public abstract void toEat();

    public void toWalk() {
        System.out.println(this.getType() + " walks");
    }

    public void toFly() {
        System.out.println(this.getType() + " flies");
    }

    public void toSwim() {
        System.out.println(this.getType() + " swims");
    }

    @Override
    public String toString() {
        return String.format("Animal: %s, %s, %s, %s", this.getType(), name, illness.getTitle(), birthDay);
    }



}