package Clinic.ClinicStaff.impl;

import Clinic.Animals.Animal;
import Clinic.ClinicStaff.Employee;
import Clinic.ClinicStaff.Gender;

public class Nurse extends Employee {

    public Nurse(String name, int age, Gender gender) {
        super(name, age, gender);
    }

    public void makeVaccination(Animal patient) {
        if (patient != null && !patient.getIsVaccinated())
            patient.setIsVaccinated(true);
        else System.out.println("Vaccination is not possible");
    }
}
