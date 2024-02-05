package Medicaments.Pharmacy;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import Medicaments.Components.Component;
import Medicaments.Components.MyIterator;

public class PharmacyIterable implements Iterable<Component>, Comparable<PharmacyIterable> {
    private List<Component> components;
    private int idx;
    private int size = 0;

    public PharmacyIterable() {
        this.components = new ArrayList<>();
        this.idx = 0;
    }

    public PharmacyIterable addComponent(Component item) {
        size++;
        components.add(item);
        return this;
    }

    public void setIdx(int idx) {
        this.idx = idx;
    }

    public int getSize() {
        return size;
    }

    public List<Component> getComponents() {
        return components;
    }

    public Component getComponent(int idx) {
        return components.get(idx);
    }

    @Override
    public Iterator<Component> iterator() {
        return new MyIterator(this);
    }

    public int getIdx() {
        return idx;
    }

    @Override
    public int compareTo(PharmacyIterable o) {
        return 0;
    }
}
