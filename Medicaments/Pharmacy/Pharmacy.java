package Medicaments.Pharmacy;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import Medicaments.Components.Component;

public class Pharmacy implements Iterator<Component>, Comparable<Pharmacy> {

    private String name;
    private List<Component> components;
    private int idx;

    public Pharmacy(String name) {
        this.name = name;
        this.components = new ArrayList<>();
        this.idx = 0;
    }

    public String getName() {
        return name;
    }

    public Pharmacy addComponent(Component item) {
        components.add(item);
        return this;
    }

    public int getInterPower() {
        int interPower = 0;
        for (Component c : components) {
            interPower += (int) (c.getPower() * c.getWeight());
        }
        return interPower;

    }

    public int getTotalPower() {
        int totalPower = 0;
        for (Component c : components) {
            totalPower += c.getPower();
        }
        return totalPower;
    }

    public int getTotalWeight() {
        int totalWeight = 0;
        for (Component c : components) {
            totalWeight += (int) (c.getWeight());
        }
        return totalWeight;
    }

    @Override
    public boolean hasNext() {
        return idx < components.size();
    }

    @Override
    public Component next() {
        return components.get(idx++);
    }

    @Override
    public int compareTo(Pharmacy o) {
//        if (this.getInterPower() > o.getInterPower()) return 1;
//        else if (this.getInterPower() < o.getInterPower()) return -1;
//        else return 0;
        return Integer.compare(this.getInterPower(), o.getInterPower());
    }

    @Override
    public String toString() {
        return String.format("\nPharmacy: %s, interPower: %s, total power: %d, total weight: %d", this.getName(), this.getInterPower(), this.getTotalPower(), this.getTotalWeight());
    }
}
