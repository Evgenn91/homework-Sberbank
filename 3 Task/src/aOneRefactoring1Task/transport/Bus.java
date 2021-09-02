package aOneRefactoring1Task.transport;

import java.util.Objects;

public class Bus extends Transports {
    private static String name = "пассажирский транспорт";
    //код транспорта
    private static int code = 300 ;
    //название доп параметра
    private static String nameDopParam ="число перевезенных пассажиров" ;
    //общий расход всех Bus
    private static double costExpend;

    //гос номер транспорта
    private int gosNumber;
    //колличество пройденных миль
    private int mileage;
    //число перевезенных пассажиров
    private int dopParamet;

    public Bus(Integer gosNumber, Integer mileage, Integer dopParam) {
        super(47.50,11.5,mileage);
        this.gosNumber = gosNumber;
        this.mileage = mileage;
        this.dopParamet = dopParam;
        Bus.costExpend += this.getExp();
    }

    public void addMileage(int mileage){
        double newMileage = super.getExp(mileage);
        this.mileage +=mileage;
        Bus.costExpend +=newMileage;
    }


    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        Bus.name = name;
    }

    public static int getCode() {
        return code;
    }

    public static void setCode(int code) {
        Bus.code = code;
    }

    public static String getNameDopParam() {
        return nameDopParam;
    }

    public static void setNameDopParam(String nameDopParam) {
        Bus.nameDopParam = nameDopParam;
    }

    public static double getCostExpend() {
        return costExpend;
    }

    public static void setCostExpend(int costExpend) {
        Bus.costExpend = costExpend;
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
        Bus bus = (Bus) o;
        return gosNumber == bus.gosNumber;
    }

    @Override
    public int hashCode() {
        return Objects.hash(gosNumber);
    }

    @Override
    public String toString() {
        return "Пассажирский транспорт{" +
                "Номер=" + gosNumber +
                ", Пробег=" + mileage +
                ", Число перевезенных пассажиров = " + dopParamet +
                '}';
    }

}
