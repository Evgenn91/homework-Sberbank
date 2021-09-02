package aOneRefactoring1Task.transport;

import java.util.Objects;

public class Crane extends Transports {
    private static String name = "тяжелая техника(кран)";
    //код транспорта
    private static int code = 400 ;
    //название доп параметра
    private static String nameDopParam ="вес поднятых грузов(тонн)" ;
    //общий расход всех Crane
    private static double costExpend;

    //гос номер транспорта
    private int gosNumber;
    //колличество пройденных миль
    private int mileage;
    //вес поднятых грузов(тонн)
    private int dopParamet;

    public Crane(Integer gosNumber, Integer mileage, Integer dopParam) {
        super(48.90,20, mileage);
        this.gosNumber = gosNumber;
        this.mileage = mileage;
        this.dopParamet = dopParam;
        Crane.costExpend += this.getExp();
    }

    public void addMileage(int mileage){
        double newMileage = super.getExp(mileage);
        this.mileage +=mileage;
        Crane.costExpend +=newMileage;
    }

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        Crane.name = name;
    }

    public static int getCode() {
        return code;
    }

    public static void setCode(int code) {
        Crane.code = code;
    }

    public static String getNameDopParam() {
        return nameDopParam;
    }

    public static void setNameDopParam(String nameDopParam) {
        Crane.nameDopParam = nameDopParam;
    }

    public static double getCostExpend() {
        return costExpend;
    }

    public static void setCostExpend(int costExpend) {
        Crane.costExpend = costExpend;
    }

    public int getGosNumber() {
        return gosNumber;
    }

    public void setGosNumber(int gosNumber) {
        this.gosNumber = gosNumber;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public int getDopParamet() {
        return dopParamet;
    }

    public void setDopParamet(int dopParamet) {
        this.dopParamet = dopParamet;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass( ) != o.getClass( )) return false;
        Crane crane = (Crane) o;
        return gosNumber == crane.gosNumber;
    }

    @Override
    public int hashCode() {
        return Objects.hash(gosNumber);
    }

    @Override
    public String toString() {
        return "Тяжелая техника(кран){" +
                "Номер=" + gosNumber +
                ", Пробег=" + mileage +
                ", Вес поднятых грузов(тонн) = " + dopParamet +
                '}';
    }


}
