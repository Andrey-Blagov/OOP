package Medicaments.Pharmacy;

import java.util.Comparator;
import java.util.List;

public interface Sorter {

    void getPharmaciesSortedByInterPower(List<Pharmacy> pharmacies);

    default void getPharmaciesSortedByTotalPower(List<Pharmacy> pharmacies) {
        pharmacies.sort(Comparator.comparingInt(Pharmacy::getTotalPower));
        System.out.println(pharmacies);
    }

    default void getPharmaciesSortedByTotalWeight(List<Pharmacy> pharmacies) {
        pharmacies.sort(new PharmacyComparator());
        System.out.println(pharmacies);
    }
}
