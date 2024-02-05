package Clinic.Data;

import java.util.List;

import Clinic.Animals.Animal;
import Clinic.ClinicStaff.Employee;

public interface DataBase {
    List<Animal> getAnimals();

    List<Employee> getEmployees();

    void addAnimal(Animal animal);

    void removeAnimal(Animal animal);

    void addEmployee(Employee employee);

    void removeEmployee(Employee employee);

    Animal findAnimalByName(String name);

    Employee findEmployeeByName(String name);
}