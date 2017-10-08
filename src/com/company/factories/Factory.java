package com.company.factories;

public class Factory {
    private String name;
    private int numID;
    private double profit;

    public Factory() {
    }

    public Factory(String name, int numID, double profit) {
        this.name = name;
        this.numID = numID;
        this.profit = profit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumID() {
        return numID;
    }

    public void setNumID(int numID) {
        this.numID = numID;
    }

    public double getProfit() {
        return profit;
    }

    public void setProfit(double profit) {
        this.profit = profit;
    }
}
