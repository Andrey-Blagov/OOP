package Clinic.ClinicStaff;

public abstract class Employee {
    private String name;
    private int age;
    private Gender gender;

    public Employee(String name, int age, Gender gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getInfo() {
        return String.format(this.getClass().getSimpleName() + ": %s, age: %d, gender: %s", this.name, this.age, this.gender);
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return String.format("Employee: %s, %s, %d, %s", this.getClass().getSimpleName(), this.name, this.age, this.gender.toString());
    }
}