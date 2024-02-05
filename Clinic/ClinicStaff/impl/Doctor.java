package Clinic.ClinicStaff.impl;

import Clinic.Animals.Animal;
import Clinic.Animals.Illness;
import Clinic.ClinicStaff.Employee;
import Clinic.ClinicStaff.Gender;

public class Doctor extends Employee {
    private Nurse assistant;

    public Doctor(String name, int age, Gender gender, Nurse assistant) {
        super(name, age, gender);
        this.assistant = assistant;
    }

    public Doctor(String name, int age, Gender gender) {
        this(name, age, gender, null);
    }

    public Doctor(String name, int age) {
        this(name, age, Gender.Undefined, null);
    }

    public void setAssistant(Nurse assistant) {
        this.assistant = assistant;
    }

    @Override
    public String getInfo() {
        if (assistant == null)
            return super.getInfo();
        else
            return String.format(super.getInfo() + ", assistant: " + assistant.getName());
    }

    public void makeDiagnosis(Animal patient, String name) {
        if (patient != null)
            patient.setIllness(new Illness(name));
        else System.out.println("Patient not found");
    }
}
