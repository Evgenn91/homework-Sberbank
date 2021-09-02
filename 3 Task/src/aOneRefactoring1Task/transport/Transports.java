package aOneRefactoring1Task.transport;

public abstract class Transports {
    //стоимость литра топлива
    private double costLiter;
    //расход топлива на 100 км
    private double consumption;
    //пробег
    private int mileage;


    public Transports(double costLiter, double consumption, int mileage) {
        this.costLiter = costLiter;
        this.consumption=consumption;
        this.mileage = mileage;

    }


    //общий расход 1го автомобиля
    public double getExp() {
        //колличество потраченного топлива
        double consumpAll = ((double) this.mileage)*(this.consumption/100);
        double result = consumpAll*this.costLiter;
        return result;
    }

    //дополнительный расход 1го автомобиля
    public double getExp(int mileageIn) {
        //колличество потраченного топлива
        double consumpAll = ((double) mileageIn)*(this.consumption/100);
        double result = consumpAll*this.costLiter;
        return result;
    }


}
