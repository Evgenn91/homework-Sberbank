package aOneRefactoring1Task.transport;

import java.util.Objects;

public class Truck extends Transports {
    private static String name = "грузовой авто";
    //код транспорта
    private static int code = 200 ;
    //название доп параметра
    private static String nameDopParam ="объем перевезенного груза" ;
    //общий расход всех Truck
    private static double costExpend;

    //гос номер транспорта
    private int gosNumber;
    //колличество пройденных миль
    private int mileage;
    //обЪем перевезенного груза
    private int dopParamet;

    public Truck(Integer gosNumber, Integer mileage, Integer dopParam) {
        super(48.90,12,  mileage);
        this.gosNumber = gosNumber;
        this.mileage = mileage;
        this.dopParamet = dopParam;
        Truck.costExpend += this.getExp();
    }

    public void addMileage(int mileage){
        double newMileage = super.getExp(mileage);
        this.mileage +=mileage;
        Truck.costExpend +=newMileage;
    }

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        Truck.name = name;
    }

    public static int getCode() {
        return code;
    }

    public static void setCode(int code) {
        Truck.code = code;
    }

    public static String getNameDopParam() {
        return nameDopParam;
    }

    public static void setNameDopParam(String nameDopParam) {
        Truck.nameDopParam = nameDopParam;
    }

    public static double getCostExpend() {return costExpend;}

    public static void setCostExpend(double costExpend) {
        Truck.costExpend = costExpend;
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
        Truck truck = (Truck) o;
        return gosNumber == truck.gosNumber ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(gosNumber);
    }

    @Override
    public String toString() {
        return "Грузовой автомобиль{" +
                "Номер=" + gosNumber +
                ", Пробег=" + mileage +
                ", Объем перевезенного груза(см. куб) = " + dopParamet +
                '}';
    }


}
