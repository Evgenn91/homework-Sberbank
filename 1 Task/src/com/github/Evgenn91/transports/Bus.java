package com.github.Evgenn91.transports;

public class Bus implements Transports{
    public static String name = "пассажирский транспорт";
    //код транспорта
    private int code = 300;
    //стоимость литра топлива
    public static double costLiter = 47.50;
    //расход топлива на 100 км
    public static double consumption = 11.5;
    //гос номер транспорта
    private int number;
    //пробег
    private int mileage;
    //колличество перевезенных пассажиров
    private int dopParamet;

    public Bus(int number, int mileage, int dopParamet) {
        this.number = number;
        this.mileage = mileage;
        this.dopParamet = dopParamet;
    }

    //общий расход 1го автобуса
    @Override
    public double getExp() {
        //колличество пораченного топлива
        double consumpAll = (double) Math.round((((double) mileage)*(consumption/100)) * 100) / 100;
        double result = (double) Math.round((consumpAll*costLiter) * 100) / 100;;
        return result;
    }

    @Override
    public int getNumber() {
        return number;
    }

    @Override
    public int getCode() {
        return code;
    }
    @Override
    public int getMileage() {
        return mileage;
    }
    @Override
    public int getDopParamet() {
        return dopParamet;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    @Override
    public void setDopParamet(int dopParamet) {
        this.dopParamet = dopParamet;
    }

    @Override
    public String toString() {
        return "Пассажирский транспорт{" +
                "Номер=" + number +
                ", Пробег=" + mileage +
                ", Число перевезенных пассажиров=" + dopParamet +
                '}';
    }
}
