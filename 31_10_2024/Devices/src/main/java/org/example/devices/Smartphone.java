package org.example.devices;

public class Smartphone extends Device {
    protected int screenSize;
    protected int resolution;

    public Smartphone(Type type, String name, double price, double weight) {
        super(type, name, price, weight);
    }

    public Smartphone(Type type, String name, Double price, Double weight, int screenSize, int resolution) {
        super(type, name, price, weight);
        this.screenSize = screenSize;
        this.resolution = resolution;
    }

    public Smartphone() {
        
    }

    public int getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(int screenSize) {
        this.screenSize = screenSize;
    }

    public int getResolution() {
        return resolution;
    }

    public void setResolution(int resolution) {
        this.resolution = resolution;
    }

    @Override
    public String toString() {
        return "Smartphone{" +
                ", type=" + type +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", weight=" + weight +
                ", resolution=" + resolution +
                ", screenSize" + screenSize +
                '}';
    }
}