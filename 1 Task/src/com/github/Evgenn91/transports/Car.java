package com.github.Evgenn91.transports;

public class Car implements Transports {
    public static String name = "легковой автомобиль";
    //код транспорта
    private int code = 100;
    //стоимость литра топлива
    public static double costLiter = 46.10;
    //расход топлива на 100 км
    public static double consumption = 12.5;
    //гос номер транспорта
    private int number;
    //пробег
    private int mileage;

    public Car(int number, int mileage) {
        this.number = number;
        this.mileage = mileage;
    }

    //общий расход 1го автомобиля
    @Override
    public double getExp() {
        //колличество потраченного топлива
        double consumpAll = (double) Math.round((((double) mileage)*(consumption/100)) * 100) / 100;
        double result = (double) Math.round((consumpAll*costLiter) * 100) / 100;
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
        return 0;
    }

    @Override
    public void setDopParamet(int dopParamet) {}

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    @Override
    public String toString() {
        return "Легковой автомобиль{" +
                "Номер=" + number +
                ", Пробег=" + mileage +
                ", Дополнительный параметр отсутствует" +
                '}';
    }
}
