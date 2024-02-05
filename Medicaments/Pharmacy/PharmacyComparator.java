package Medicaments.Pharmacy;

import java.util.Comparator;

public class PharmacyComparator implements Comparator<Pharmacy> {

    @Override
    public int compare(Pharmacy ph1, Pharmacy ph2) {
        return Integer.compare(ph1.getTotalWeight(), ph2.getTotalWeight());
    }
}
