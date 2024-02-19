package patterns.generating.builder.task.item;

public class Characteristic {
    private String brand;
    private String color;
    private String ram;
    private String cpu;
    private String os;
    private String weight;
    private String memory;
    private String memoryType;
    private String battery;
    private String body;
    private String wheel;

    public Characteristic(String brand, String color, String ram, String cpu, String os, String weight, String memory,
                          String memoryType, String battery, String body, String wheel) {
        this.brand = brand;
        this.color = color;
        this.ram = ram;
        this.cpu = cpu;
        this.os = os;
        this.weight = weight;
        this.memory = memory;
        this.memoryType = memoryType;
        this.battery = battery;
        this.body = body;
        this.wheel = wheel;
    }

    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }

    public String getRam() {
        return ram;
    }

    public String getCpu() {
        return cpu;
    }

    public String getOs() {
        return os;
    }

    public String getWeight() {
        return weight;
    }

    public String getMemory() {
        return memory;
    }

    public String getMemoryType() {
        return memoryType;
    }

    public String getBattery() {
        return battery;
    }

    public String getBody() {
        return body;
    }

    public String getWheel() {
        return wheel;
    }

    @Override
    public String toString() {
        return "[" +
                "brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", ram='" + ram + '\'' +
                ", cpu='" + cpu + '\'' +
                ", os='" + os + '\'' +
                ", weight='" + weight + '\'' +
                ", memory='" + memory + '\'' +
                ", memoryType='" + memoryType + '\'' +
                ", battery='" + battery + '\'' +
                ", body='" + body + '\'' +
                ", wheel='" + wheel + '\'' +
                ']';
    }
}
