package Clinic.Data;

import java.util.ArrayList;
import java.util.List;

import Clinic.Animals.Animal;
import Clinic.ClinicStaff.Employee;

public class DataBaseImpl implements DataBase {
    private List<Animal> animals;
    private List<Employee> employees;

    private static DataBase instance;

    private DataBaseImpl() {
        this.animals = new ArrayList<>();
        this.employees = new ArrayList<>();
    }

    public static DataBase getInstance() {
        if (instance == null) {
            instance = new DataBaseImpl();
        }
        return instance;
    }

    @Override
    public List<Animal> getAnimals() {
        return animals;
    }

    @Override
    public List<Employee> getEmployees() {
        return employees;
    }

    @Override
    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    @Override
    public void removeAnimal(Animal animal) {
        animals.remove(animal);
    }

    @Override
    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    @Override
    public void removeEmployee(Employee employee) {
        employees.remove(employee);
    }

    @Override
    public Employee findEmployeeByName(String name) {
        for (Employee e : employees) {
            if (name.equals(e.getName())) return e;
        }
        return null;
    }

    @Override
    public Animal findAnimalByName(String name) {
        try {
            for (Animal a : animals) {
                if (name.equals(a.getName())) return a;
            }
        } catch (NullPointerException e) {
            throw new RuntimeException("Patient not found");
        }
        return null;
    }
}