package aOneRefactoring1Task;

import aOneRefactoring1Task.transport.*;
import java.util.*;

public class CalculExpensFuel {
    //список легковых автомобилей, где key это его гос номер
    private Map<Integer, Car> mapCar;
    //список грузовиков, где key это его гос номер
    private Map<Integer, Truck> mapTruck;
    //список автобусов, где key это его гос номер
    private Map<Integer, Bus> mapBus;
    //список кранов, где key это его гос номер
    private Map<Integer, Crane> mapCrane;

    //общий расход каждого класса транспорта, округленный до int
    private int expCars;
    private int expTruck;
    private int expBus;
    private int expCrane;

    public CalculExpensFuel() {
        this.mapCar = new HashMap<Integer,Car>( );
        this.mapTruck = new HashMap<Integer,Truck>( );
        this.mapBus = new HashMap<Integer,Bus>( );
        this.mapCrane = new HashMap<Integer,Crane>( );
    }

    //вывод на экран общей стоимости расходов ГСМ
    public void getTotExpTransp(){
        double totExpTransp = Car.getCostExpend()+Truck.getCostExpend()+Bus.getCostExpend()+Crane.getCostExpend();
        System.out.println("Общая стоимость расходов на ГСМ: "+(double) Math.round((totExpTransp) * 100) / 100);
    }

    //вывод на экран общей стоимости расходов ГСМ каждого класса
    public void getTotExpClassTransp(){
        System.out.println("Общая стоимость расходов на ГСМ легковых автомобилей: " + (double) Math.round((Car.getCostExpend()) * 100) / 100);
        System.out.println("Общая стоимость расходов на ГСМ грузовых автомобилей: " + (double) Math.round((Truck.getCostExpend()) * 100) / 100);
        System.out.println("Общая стоимость расходов на ГСМ пассажирского транспорта: " + (double) Math.round((Bus.getCostExpend()) * 100) / 100);
        System.out.println("Общая стоимость расходов на ГСМ тяжелой техники(кранов): "+ (double) Math.round((Crane.getCostExpend()) * 100) / 100);
    }

    //вывод на экран класса с наибольшей стоимостью расходов
    public void getMaxExpClass(){
        roundExp();
        int max1 = expCars > expTruck ? expCars : expTruck;
        int max2 = expBus > expCrane ? expBus : expCrane;
        int max = max1 > max2 ? max1 : max2;

        if(max==expCars){System.out.println("Наибольшая стоимость расходов у типа: Легковой авто - "+expCars );}
        if(max==expTruck){System.out.println("Наибольшая стоимость расходов у типа: Грузовой автомо - "+expTruck );}
        if(max==expBus){System.out.println("Наибольшая стоимость расходов у типа: Пассажирский транспорт - "+ expBus );}
        if(max==expCrane){System.out.println("Наибольшая стоимость расходов у типа: Тяжелая техника - " +expCrane );}
    }

    //вывод на экран класса с наименьшей стоимостью расходов
    public void getMinExpClass(){
        roundExp();
        int min1 = expCars > expTruck ? expTruck : expCars;
        int min2 = expBus > expCrane ? expCrane : expBus;
        int min = min1 > min2 ? min2 : min1;

        if(min==expCars){System.out.println("Наименьшая стоимость расходов у типа: Легковой авто - "+expCars );}
        if(min==expTruck){System.out.println("Наименьшая стоимость расходов у типа: Грузовой автомо - "+expTruck );}
        if(min==expBus){System.out.println("Наименьшая стоимость расходов у типа: Пассажирский транспорт - "+ expBus );}
        if(min==expCrane){System.out.println("Наименьшая стоимость расходов у типа: Тяжелая техника - " +expCrane );}

    }

    //метод округления до int общего расхода каждого класса транспорта
    private void roundExp(){
        this.expCars = (int) Math.round(Car.getCostExpend());
        this.expTruck = (int) Math.round(Truck.getCostExpend());
        this.expBus = (int) Math.round(Bus.getCostExpend());
        this.expCrane = (int) Math.round(Crane.getCostExpend());
    }

    //вывод на экран отсортированного списка автомобилей
    public void printAllSortCars(){
        SortedSet<Car> sortListCars = new TreeSet<>(new Comparator<Car>( ) {
            @Override
            public int compare(Car o1, Car o2) {
                Integer x1 = (o1).getMileage();
                Integer x2 = (o2).getMileage();
                int sComp = x1.compareTo(x2);

                return sComp;
            }
        });
        for(Car oneCar: mapCar.values()){
            sortListCars.add(oneCar);
        }
        for(Car oneSortCar: sortListCars){
            System.out.println(oneSortCar);
        }

    }

    //вывод на экран отсортированного списка грузовиков
    public void printAllSortTruck(){
        SortedSet<Truck> sortListTruck = new TreeSet<>(new Comparator<Truck>( ) {
            @Override
            public int compare(Truck o1, Truck o2) {
                Integer x1 = (o1).getMileage();
                Integer x2 = (o2).getMileage();
                int sComp = x1.compareTo(x2);

                if (sComp != 0) {
                    return sComp;
                }

                Integer y1 = (o1).getDopParamet();
                Integer y2 = (o2).getDopParamet();
                return y1.compareTo(y2);
            }
        });
        for(Truck oneTruck: mapTruck.values()){
            sortListTruck.add(oneTruck);
        }
        for(Truck oneSortTruck: sortListTruck){
            System.out.println(oneSortTruck);
        }
    }

    //вывод на экран отсортированного списка автобусов
    public void printAllSortBus(){
        SortedSet<Bus> sortListBus = new TreeSet<>(new Comparator<Bus>( ) {
            @Override
            public int compare(Bus o1, Bus o2) {
                Integer x1 = (o1).getMileage();
                Integer x2 = (o2).getMileage();
                int sComp = x1.compareTo(x2);

                if (sComp != 0) {
                    return sComp;
                }

                Integer y1 = (o1).getDopParamet();
                Integer y2 = (o2).getDopParamet();
                return y1.compareTo(y2);
            }
        });
        for(Bus oneBus: mapBus.values()){
            sortListBus.add(oneBus);
        }
        for(Bus oneSortBus: sortListBus){
            System.out.println(oneSortBus);
        }
    }

    //вывод на экран отсортированного списка кранов
    public void printAllSortCrane(){
        SortedSet<Crane> sortListCrane = new TreeSet<>(new Comparator<Crane>( ) {
            @Override
            public int compare(Crane o1, Crane o2) {
                Integer x1 = (o1).getMileage();
                Integer x2 = (o2).getMileage();
                int sComp = x1.compareTo(x2);

                if (sComp != 0) {
                    return sComp;
                }

                Integer y1 = (o1).getDopParamet();
                Integer y2 = (o2).getDopParamet();
                return y1.compareTo(y2);
            }
        });
        for(Crane oneCrane: mapCrane.values()){
            sortListCrane.add(oneCrane);
        }
        for(Crane oneSortCrane: sortListCrane){
            System.out.println(oneSortCrane);
        }
    }

    //добавление объектов в мапы
    public void addTransportsList(String[] listTran){
        if (listTran.length==0){
            System.out.println("Данные небыли введены" );
            throw new Error();
        }

        for(String list: listTran){
            try {
                int code = Integer.parseInt(list.substring(1,4));
                String parameters = list.split("_")[1];
                int gosNumber = Integer.parseInt(parameters.split("-")[0]);
                int mileage =0;
                int dopParam =0;
                if(code==100){
                    mileage = Integer.parseInt(parameters.split("-")[1]);
                } else {
                    mileage = Integer.parseInt(parameters.split("-")[1]);
                    dopParam = Integer.parseInt(parameters.split("-")[2]);
                }

                switch (code){
                    case 100:
                        if(mapCar.containsKey(gosNumber)) {
                            //если уже есть в списке такой транспорт, то суммируем старый расход с новым
                            mapCar.get(gosNumber).addMileage(mileage);
                            } else {
                            //если транспорта с таким гос номер еще нету в мапе то добавляем в мап
                            mapCar.put(gosNumber,new Car(gosNumber,mileage));
                        }
                        break;
                    case 200:
                        if(mapTruck.containsKey(gosNumber)) {
                            //если уже есть в списке такой транспорт, то суммируем старый расход и доп параметр с новыми
                            int newDopParam = mapTruck.get(gosNumber).getDopParamet() + dopParam;
                            mapTruck.get(gosNumber).setDopParamet(newDopParam);
                            mapTruck.get(gosNumber).addMileage(mileage);
                        } else {
                            mapTruck.put(gosNumber,new Truck(gosNumber,mileage,dopParam));
                        }
                        break;
                    case 300:
                        if(mapBus.containsKey(gosNumber)) {
                            int newDopParam = mapBus.get(gosNumber).getDopParamet() + dopParam;
                            mapBus.get(gosNumber).setDopParamet(newDopParam);
                            mapBus.get(gosNumber).addMileage(mileage);}
                        else {
                            mapBus.put(gosNumber,new Bus(gosNumber,mileage,dopParam));
                        }
                        break;
                    case 400:
                        if(mapCrane.containsKey(gosNumber)) {
                            int newDopParam = mapCrane.get(gosNumber).getDopParamet() + dopParam;
                            mapCrane.get(gosNumber).setDopParamet(newDopParam);
                            mapCrane.get(gosNumber).addMileage(mileage);
                        }
                        else {
                            mapCrane.put(gosNumber,new Crane(gosNumber,mileage,dopParam));
                        }
                        break;
                    default:
                        break;
                }
            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println("Введенные данные не коректны, проверьте ваши данные" );
                throw e;
            }
        }

    }

}
