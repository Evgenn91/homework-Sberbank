package com.github.Evgenn91.transports;

public class Crane implements Transports{
    public static String name = "тяжелая техника(кран)";
    //код транспорта
    private int code = 400;
    //стоимость литра топлива
    public static double costLiter = 48.90;
    //расход топлива на 100 км
    public static double consumption = 20;
    //гос номер транспорта
    private int number;
    //пробег
    private int mileage;
    //вес поднятых грузов
    private int dopParamet;

    public Crane(int number, int mileage, int dopParamet) {
        this.number = number;
        this.mileage = mileage;
        this.dopParamet = dopParamet;
    }

    //общий расход 1го крана
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
        return "Тяжелая техника(кран){" +
                "Номер=" + number +
                ", Пробег=" + mileage +
                ", Вес поднятых грузов(тонн)=" + dopParamet +
                '}';
    }
}
