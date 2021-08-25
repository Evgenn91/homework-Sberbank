package Transports;

public interface Transports<toStrin> {
    int getNumber();
    int getCode();
    int getMileage();
    int getDopParamet();
    void setDopParamet(int dopParamet);
    public void setMileage(int mileage);
    double getExp();

}
