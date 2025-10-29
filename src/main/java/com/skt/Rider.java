package com.skt;

public class Rider {

    private int bikeTopspeed;
    private String name;
    private Engine engine;

    public int getBikeTopspeed() {
        return bikeTopspeed;
    }

    public void setBikeTopspeed(int bikeTopspeed) {
        this.bikeTopspeed = bikeTopspeed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Rider{" +
                "bikeTopspeed=" + bikeTopspeed +
                ", name='" + name + '\'' +
                ", engine=" + engine +
                '}';
    }
}
