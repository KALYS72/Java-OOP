package org.example.devices;

public class Tablet extends Device {
    protected double butteryLife;
    protected boolean hasStylus;

    public Tablet(Type type, String name, Double price, Double weight, Double butteryLife, boolean hasStylus) {
        super(type, name, price, weight);
        this.butteryLife = butteryLife;
        this.hasStylus = hasStylus;
    }
    public void setButteryLife(double butteryLife) {
        this.butteryLife = butteryLife;
    }

    public void setHasStylus(boolean hasStylus) {
        this.hasStylus = hasStylus;
    }

    @Override
    public String toString() {
        return "Tablet{" +
                ", type=" + type +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", weight=" + weight +
                ", butteryLife=" + butteryLife +
                ", hasStylus=" + hasStylus +
                '}';
    }
}