package com.company;

import java.util.Objects;

public class Appliances {
    private String nameGadget;
    private String brand;
    private int power;
    private int weight;
    private String color;

    public String getNameGadget() {
        return nameGadget;
    }

    public void setNameGadget(String nameGadget) {
        this.nameGadget = nameGadget;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    private boolean isOn;

    public void on() {
        this.isOn = true;
    }

    public void off() {
        this.isOn = false;
    }

    public boolean getState() {
        return isOn;
    }

    public Appliances(String nameGadget, String brand, int power, int weight, String color, boolean isOn) {
        this.nameGadget = nameGadget;
        this.brand = brand;
        this.power = power;
        this.weight = weight;
        this.color = color;
        this.isOn = isOn;
    }

    @Override
    public String toString() {
        return "Appliances{" +
                "nameGadget='" + nameGadget + '\'' +
                ", brand='" + brand + '\'' +
                ", power=" + power +
                ", weight=" + weight +
                ", color='" + color + '\'' +
                ", isOn=" + isOn +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Appliances that = (Appliances) o;
        return power == that.power &&
                weight == that.weight &&
                isOn == that.isOn &&
                Objects.equals(nameGadget, that.nameGadget) &&
                Objects.equals(brand, that.brand) &&
                Objects.equals(color, that.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameGadget, brand, power, weight, color, isOn);
    }
}

class VacuumCleaner extends Appliances {
    private int powerVacuum;
    private String filterType;

    public int getPowerVacuum() {
        return powerVacuum;
    }

    public void setPowerVacuum(int powerVacuum) {
        this.powerVacuum = powerVacuum;
    }

    public String getFilterType() {
        return filterType;
    }

    public void setFilterType(String filterType) {
        this.filterType = filterType;
    }

    private boolean isOn;

    public void on() {
        this.isOn = true;
    }

    public void off() {
        this.isOn = false;
    }

    public boolean getState() {
        return isOn;
    }

    public VacuumCleaner(String nameGadget, String brand, int power, int weight, String color, boolean isOn, int powerVacuum, String filterType) {
        super(nameGadget, brand, power, weight, color, isOn);
        this.powerVacuum = powerVacuum;
        this.filterType = filterType;
        this.isOn = isOn;
    }

    @Override
    public String toString() {
        return "VacuumCleaner{" +

                "nameGadget='" + getNameGadget() + '\'' +
                ", brand='" + getBrand() + '\'' +
                ", power=" + getPower() +
                ", weight=" + getWeight() +
                ", color='" + getColor() + '\'' +
                ", isOn=" + isOn +

                ", powerVacuum=" + powerVacuum +
                ", filterType='" + filterType + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        VacuumCleaner that = (VacuumCleaner) o;
        return powerVacuum == that.powerVacuum &&
                Objects.equals(filterType, that.filterType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), powerVacuum, filterType);
    }
}

class RobotVacuumCleaner extends VacuumCleaner {
    private boolean isTurboBrush;
    private String navigationType;
    private int batteryCapacity;
    private boolean wifi;

    public boolean isTurboBrush() {
        return isTurboBrush;
    }

    public void setTurboBrush(boolean turboBrush) {
        isTurboBrush = turboBrush;
    }

    public String getNavigationType() {
        return navigationType;
    }

    public void setNavigationType(String navigationType) {
        this.navigationType = navigationType;
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public boolean isWifi() {
        return wifi;
    }

    public void setWifi(boolean wifi) {
        this.wifi = wifi;
    }

    private boolean isOn;

    public void on() {
        this.isOn = true;
    }

    public void off() {
        this.isOn = false;
    }

    public boolean getState() {
        return isOn;
    }

    public RobotVacuumCleaner(String nameGadget, String brand, int power, int weight, String color, boolean isOn, int powerVacuum, String filterType, boolean isTurboBrush, String navigationType, int batteryCapacity, boolean wifi) {
        super(nameGadget, brand, power, weight, color, isOn, powerVacuum, filterType);
        this.isTurboBrush = isTurboBrush;
        this.navigationType = navigationType;
        this.batteryCapacity = batteryCapacity;
        this.wifi = wifi;
        this.isOn = isOn;
    }

    @Override
    public String toString() {
        return "RobotVacuumCleaner{" +

                "nameGadget='" + getNameGadget() + '\'' +
                ", brand='" + getBrand() + '\'' +
                ", power=" + getPower() +
                ", weight=" + getWeight() +
                ", color='" + getColor() + '\'' +
                ", isOn=" + isOn +

                ", isTurboBrush=" + isTurboBrush +
                ", navigationType='" + navigationType + '\'' +
                ", batteryCapacity=" + batteryCapacity +
                ", wifi=" + wifi +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        RobotVacuumCleaner that = (RobotVacuumCleaner) o;
        return isTurboBrush == that.isTurboBrush &&
                batteryCapacity == that.batteryCapacity &&
                wifi == that.wifi &&
                Objects.equals(navigationType, that.navigationType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), isTurboBrush, navigationType, batteryCapacity, wifi);
    }
}