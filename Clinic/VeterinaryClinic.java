package Clinic;

import java.time.LocalDate;

import Clinic.Animals.Huntable;
import Clinic.Animals.Illness;
import Clinic.Animals.impl.*;
import Clinic.ClinicStaff.Employee;
import Clinic.ClinicStaff.Gender;
import Clinic.ClinicStaff.VetService.Registration;
import Clinic.ClinicStaff.VetService.VetService;
import Clinic.ClinicStaff.impl.Doctor;
import Clinic.ClinicStaff.impl.Nurse;

public class VeterinaryClinic {
    public static void main(String[] args) {
        final VetService clinic = Registration.getVetService();

        clinic.registerNewPatient(new Duck("Дак", new Illness("Боль"), LocalDate.now(), 3));
        clinic.registerNewPatient(new Duck());
        clinic.registerNewPatient(new Dog());
        clinic.registerNewPatient(new Cat());
        clinic.registerNewPatient(new Fish());
        clinic.registerNewPatient(new Fish());
        clinic.registerNewPatient(new Snake("Змеюга"));

        clinic.getPatients();

        System.out.println("\nHere types of patients: " + clinic.getTypes());

        clinic.getProfiles();

        clinic.getGoables();

        clinic.getSwimables();

        System.out.println("\nFlyables are: " + clinic.getFlyables());

        clinic.dischargePatient(clinic.getPatientByName("Уточка_#1"));
        clinic.dischargePatient(clinic.getPatientByName("Рыбка_#1"));

        System.out.println();

        clinic.getPatients();
        final Nurse lora = new Nurse("Лора", 28, Gender.Female);
        final Nurse nura = new Nurse("Нюра", 66, Gender.Female);
        final Doctor goga = new Doctor("Гога", 43, Gender.Male);
        clinic.hireEmployee(lora);
        clinic.hireEmployee(nura);
        clinic.hireEmployee(goga);
        clinic.hireEmployee(new Nurse("Света", 20, Gender.Female));
        clinic.hireEmployee(new Doctor("Егор", 34, Gender.Male, lora));
        clinic.hireEmployee(new Doctor("Слава", 63));

        Employee slava = clinic.getEmployeeByName("Слава");
        ((Doctor) slava).setAssistant((Nurse) clinic.getEmployeeByName("Света"));

        clinic.getEmployees();

        clinic.fireEmployee(slava);
        goga.setAssistant(nura);
        System.out.println("\nnew staff: ");
        clinic.getEmployees();

        System.out.println("Doctors: ");
        System.out.println(clinic.getDoctors());

        System.out.println("Nurses: ");
        System.out.println(clinic.getNurses());

        System.out.println(clinic.getPatientByName("Дак"));

        goga.makeDiagnosis(clinic.getPatientByName("Дак"), "Хворь");
        nura.makeVaccination(clinic.getPatientByName("Дак"));

        System.out.println(clinic.getPatientByName("Дак"));

        nura.makeVaccination(clinic.getPatientByName("Дак"));

        System.out.println(clinic.getPatientByName("Дак"));

        goga.makeDiagnosis(clinic.getPatientByName("Сергей"), "Pervert");
        nura.makeVaccination(clinic.getPatientByName("Сергей"));

        final Cat barsik = new Cat("Барсик");
        final Duck pigeon = new Duck("Васька");

        Huntable harvest = (predator, victim) -> System.out.printf("%s the %s overtook and devoured the %s %s\n",
                predator.getName(), predator.getType(), victim.getType(), victim.getName());

        harvest.hunt(barsik, pigeon);
    }
}
