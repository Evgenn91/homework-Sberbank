package aOneRefactoring1Task.transport;

import java.util.Objects;

public class Car extends Transports {
    private static String name = "легковой автомобиль";
    //код транспорта
    private static int code = 100 ;
    //название доп параметра
    private static String nameDopParam ="отсутствует";
    //общий расход всех Car
    private static double costExpend;

    //гос номер транспорта
    private int gosNumber;
    //колличество пройденных миль
    private int mileage;


    public Car(Integer gosNumber, Integer mileage) {
        super(46.10,12.5, mileage);
        this.gosNumber = gosNumber;
        this.mileage = mileage;
        this.costExpend += this.getExp();
    }

    public void addMileage(int mileage){
        double newMileage = super.getExp(mileage);
        this.mileage +=mileage;
        Car.costExpend +=newMileage;
    }

    public static String getName() {return name;}

    public static void setName(String name) {Car.name = name;}

    public static int getCode() {
        return code;
    }

    public static void setCode(int code) {
        Car.code = code;
    }

    public static String getNameDopParam() {
        return nameDopParam;
    }

    public static void setNameDopParam(String nameDopParam) {
        Car.nameDopParam = nameDopParam;
    }

    public static double getCostExpend() {return costExpend;}

    public static void setCostExpend(double costExpend) {
        Car.costExpend = costExpend;
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

    @Override
    public String toString() {
        return "Легковой автомобиль{" +
                "Номер=" + gosNumber +
                ", Пробег=" + mileage +
                ", Дополнительный параметр отсутствует" +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass( ) != o.getClass( )) return false;
        Car car = (Car) o;
        return gosNumber == car.gosNumber;
    }

    @Override
    public int hashCode() {
        return Objects.hash(gosNumber);
    }
}

