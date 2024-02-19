package patterns.generating.builder.task.item;

public abstract class Item {
    protected Characteristic characteristic;

    public Item(Characteristic characteristic) {
        this.characteristic = characteristic;
    }

    public abstract Characteristic getCharacteristic();

    @Override
    public String toString() {
        return String.format("%s : { characteristics: %s}", getClass().getSimpleName(), characteristic);
    }
}
