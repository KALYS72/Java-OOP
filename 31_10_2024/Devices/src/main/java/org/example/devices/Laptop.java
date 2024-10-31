package org.example.devices;

public class Laptop extends Device {
    protected int ramSize;
    protected String processorType;

    public Laptop(Type type, String name, Double price, Double weight, int ramSize, String processorType) {
        super(type, name, price, weight);
        this.ramSize = ramSize;
        this.processorType = processorType;
    }

    public void setRamSize(int ramSize) {
        this.ramSize = ramSize;
    }

    public void setProcessorType(String processorType) {
        this.processorType = processorType;
    }

    @Override
    public String toString() {
        return "Laptop {" +
                "type=" + getType() +
                ", name='" + getName() + '\'' +
                ", price=" + getPrice() +
                ", weight=" + getWeight() +
                ", ram size=" + ramSize +
                ", processor type='" + processorType + '\'' +
                '}';
    }
}