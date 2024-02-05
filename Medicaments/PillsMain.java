package Medicaments;

import java.util.*;

import Medicaments.Components.Penicillin;
import Medicaments.Components.Salt;
import Medicaments.Components.Water;
import Medicaments.Pharmacy.Pharmacy;
import Medicaments.Pharmacy.PharmacyComparator;
import Medicaments.Pharmacy.Sorter;

public class PillsMain {
    public static void main(String[] args) {
        Pharmacy mixture1 = new Pharmacy("mixture1");
        Pharmacy mixture2 = new Pharmacy("mixture2");
        Pharmacy mixture3 = new Pharmacy("mixture3");

        mixture1
                .addComponent(new Penicillin("PenicillinH", 10, 100))
                .addComponent(new Water("WaterH", 20, 15))
                .addComponent(new Salt("SaltH", 50, 50));

        mixture2
                .addComponent(new Penicillin("PenicillinS", 5, 80))
                .addComponent(new Water("WaterS", 10, 10))
                .addComponent(new Salt("SaltS", 3, 300));
        mixture3
                .addComponent(new Penicillin("PenicillinS", 25, 120))
                .addComponent(new Water("WaterS", 30, 25))
                .addComponent(new Salt("SaltS", 7, 70));

        List<Pharmacy> pharmacies = new ArrayList<>();
        pharmacies.add(mixture1);
        pharmacies.add(mixture2);
        pharmacies.add(mixture3);

        getPharmaciesSortedByInterPower(pharmacies);

        getPharmaciesSortedByTotalPower(pharmacies);

        getPharmaciesSortedByTotalWeight(pharmacies, new PharmacyComparator());

    }

    private static void getPharmaciesSortedByInterPower(List<Pharmacy> pharmacies) {
        Collections.sort(pharmacies);
        System.out.println(pharmacies);
    }

    private static void getPharmaciesSortedByTotalPower(List<Pharmacy> pharmacies) {
        pharmacies.sort(Comparator.comparingInt(Pharmacy::getTotalPower));
        System.out.println(pharmacies);
    }

    private static void getPharmaciesSortedByTotalWeight(List<Pharmacy> pharmacies, Comparator<Pharmacy> comparator) {
        pharmacies.sort(comparator);
        System.out.println(pharmacies);
    }
    
}
