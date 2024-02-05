package Clinic.ClinicStaff.VetService;

import java.util.List;
import java.util.Set;

import Clinic.Animals.Animal;
import Clinic.Animals.Flyable;
import Clinic.Animals.Goable;
import Clinic.Animals.Swimable;
import Clinic.ClinicStaff.Employee;
import Clinic.ClinicStaff.impl.Doctor;
import Clinic.ClinicStaff.impl.Nurse;

public interface VetService {
    void getPatients();

    Animal getPatientByName(String name);

    void getProfiles();

    Set<String> getTypes();

    void getGoables();

    List<Flyable> getFlyables();

    void getSwimables();

    void getEmployees();

    Employee getEmployeeByName(String name);

    List<Doctor> getDoctors();

    List<Nurse> getNurses();

    void registerNewPatient(Animal patient);

    void dischargePatient(Animal patient);

    void hireEmployee(Employee employee);

    void fireEmployee(Employee employee);
}
