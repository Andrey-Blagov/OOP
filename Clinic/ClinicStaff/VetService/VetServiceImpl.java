package Clinic.ClinicStaff.VetService;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import Clinic.Animals.Animal;
import Clinic.Animals.Flyable;
import Clinic.Animals.Goable;
import Clinic.Animals.Swimable;
import Clinic.ClinicStaff.Employee;
import Clinic.ClinicStaff.VetService.Registration;
import Clinic.ClinicStaff.VetService.VetService;
import Clinic.ClinicStaff.impl.Doctor;
import Clinic.ClinicStaff.impl.Nurse;
import Clinic.Data.DataBase;

public class VetServiceImpl implements VetService {
    private final DataBase dataBase;

    private static VetServiceImpl instance;

    private VetServiceImpl() {
        this.dataBase = Registration.getDataBase();
    }

    public static VetServiceImpl getInstance() {
        if (instance == null) {
            instance = new VetServiceImpl();
        }
        return instance;
    }

    @Override
    public void getPatients() {
        for (Animal a : dataBase.getAnimals()) {
            System.out.println(a);
        }
    }

    @Override
    public void registerNewPatient(Animal patient) {
        dataBase.addAnimal(patient);
    }

    @Override
    public void dischargePatient(Animal patient) {
        dataBase.removeAnimal(patient);
    }

    @Override
    public Animal getPatientByName(String name) {
        return dataBase.findAnimalByName(name);
    }

    @Override
    public void getProfiles() {
        System.out.println("\nSee patients profiles below: ");
        for (Animal a : dataBase.getAnimals()) {
            System.out.println(a);
            if (a instanceof Goable) {
                System.out.println(a.getType() + " runs at a speed " + ((Goable) a).run());
            }
            if (a instanceof Flyable) {
                System.out.println(a.getType() + " flies at a speed " + ((Flyable) a).fly());
            }
            if (a instanceof Swimable) {
                System.out.println(a.getType() + " swims at a speed " + ((Swimable) a).swim());
            }
            System.out.println("-------------");
        }
    }

    @Override
    public Set<String> getTypes() {
        return dataBase.getAnimals().stream().map(Animal::getType).collect(Collectors.toSet());
    }

    @Override
    public void getGoables() {
        System.out.println("\nGoables are: ");
        List<Animal> animals = dataBase.getAnimals();
        List<Goable> goables = new ArrayList<>();
        for (int i = 0, j = 0; i < animals.size(); i++) {
            try {
                goables.add((Goable) animals.get(i));
                System.out.println(goables.get(j));
                j++;
            } catch (ClassCastException e) {
                i++;
            }
        }
    }

    @Override
    public List<Flyable> getFlyables() {
        List<Flyable> flyables = new ArrayList<>();
        for (Animal a : dataBase.getAnimals()) {
            if (a instanceof Flyable) {
                flyables.add((Flyable) a);
            }
        }
        return flyables;
    }

    @Override
    public void getSwimables() {
        System.out.println("\nSwimables are: ");
        for (Animal a : dataBase.getAnimals()) {
            if (a instanceof Swimable) {
                System.out.println(a.getName());
            }
        }
    }


    @Override
    public void getEmployees() {
        for (Employee e : dataBase.getEmployees()) {
            System.out.println(e.getInfo());
        }
    }

    public Employee getEmployeeByName(String name) {
        return dataBase.findEmployeeByName(name);
    }

    @Override
    public void hireEmployee(Employee employee) {
        dataBase.addEmployee(employee);
    }

    @Override
    public void fireEmployee(Employee employee) {
        dataBase.removeEmployee(employee);
    }

    @Override
    public List<Doctor> getDoctors() {
        List<Doctor> doctors = new ArrayList<>();
        for (Employee e : dataBase.getEmployees()) {
            if (e instanceof Doctor) {
                doctors.add((Doctor) e);
            }
        }
        return doctors;
    }

    @Override
    public List<Nurse> getNurses() {
        List<Nurse> nurses = new ArrayList<>();
        for (Employee e : dataBase.getEmployees()) {
            if (e instanceof Nurse) {
                nurses.add((Nurse) e);
            }
        }
        return nurses;
    }

}
