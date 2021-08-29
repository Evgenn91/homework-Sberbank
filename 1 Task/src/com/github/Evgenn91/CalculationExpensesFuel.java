package com.github.Evgenn91;

import com.github.Evgenn91.transports.Transports;
import com.github.Evgenn91.transports.Car;
import com.github.Evgenn91.transports.Truck;
import com.github.Evgenn91.transports.Bus;
import com.github.Evgenn91.transports.Crane;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CalculationExpensesFuel {
    private List<Transports> listTransports;
    private List<Car> listCars;
    private List<Truck> listTruck;
    private List<Bus> listBus;
    private List<Crane> listCrane;

    private int expCars;
    private int expTruck;
    private int expBus;
    private int expCrane;


    public CalculationExpensesFuel() {
        this.listTransports = new ArrayList<>(  );
        this.listCars = new ArrayList<>(  );
        this.listTruck=new ArrayList<>(  );
        this.listBus = new ArrayList<>(  );
        this.listCrane = new ArrayList<>(  );
    }

    //вывод на экран общей стоимости расходов ГСМ
    public void getTotExpTransp(){
        double totExpTransp = 0.00;
        for(Transports oneTransp1: listTransports){
            totExpTransp +=oneTransp1.getExp();
        }
        System.out.println("Общая стоимость расходов на ГСМ: "+(double) Math.round((totExpTransp) * 100) / 100);
    }


    //вывод на экран общей стоимости расходов ГСМ каждого класса
    public void getTotExpClassTransp(){
        System.out.println("Общая стоимость расходов на ГСМ легковых автомобилей: "+expCars);
        System.out.println("Общая стоимость расходов на ГСМ грузовых автомобилей: "+expTruck);
        System.out.println("Общая стоимость расходов на ГСМ пассажирского транспорта: "+expBus);
        System.out.println("Общая стоимость расходов на ГСМ тяжелой техники(кранов): "+expCrane);
    }

    //вывод на экран класса с наибольшей стоимостью расходов
    public void getMaxExpClass(){
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
        int min1 = expCars > expTruck ? expTruck : expCars;
        int min2 = expBus > expCrane ? expCrane : expBus;
        int min = min1 > min2 ? min2 : min1;

        if(min==expCars){System.out.println("Наименьшая стоимость расходов у типа: Легковой авто - "+expCars );}
        if(min==expTruck){System.out.println("Наименьшая стоимость расходов у типа: Грузовой автомо - "+expTruck );}
        if(min==expBus){System.out.println("Наименьшая стоимость расходов у типа: Пассажирский транспорт - "+ expBus );}
        if(min==expCrane){System.out.println("Наименьшая стоимость расходов у типа: Тяжелая техника - " +expCrane );}

    }

    //вывод на экран отсортированного списка автомобилей
    public void printAllSortCars(){
        sortListCar(listCars);
        for(Car oneCar: listCars){
            System.out.println(oneCar);
        }
    }

    //вывод на экран отсортированного списка грузовиков
    public void printAllSortTruck(){
        sortListTruck(listTruck);
        for(Truck oneTruck: listTruck){
            System.out.println(oneTruck);
        }
    }

    //вывод на экран отсортированного списка автобусов
    public void printAllSortBus(){
        sortListBus(listBus);
        for(Bus oneBus: listBus){
            System.out.println(oneBus);
        }
    }

    //вывод на экран отсортированного списка кранов
    public void printAllSortCrane(){
        sortListCrane(listCrane);
        for(Crane oneCrane: listCrane){
            System.out.println(oneCrane);
        }
    }



    //добавление объектов в массивы
    public void addTransportsList(String[] listTran){
        if (listTran.length==0){
            System.out.println("Данные небыли введены" );
            throw new Error();
        }

        for(String list: listTran){
            try {
                int code = Integer.parseInt(list.substring(1,4));
                String parameters = list.split("_")[1];
                int number = Integer.parseInt(parameters.split("-")[0]);
                int mileage = Integer.parseInt(parameters.split("-")[1]);

                switch (code){
                    case 100:
                        if(checkAvailObj(100,number)) {addParametersToTranspObj(100,number,mileage,0);}  //если уже есть в списке такой транспорт, то добавляем расход к его расходу
                        else {
                            Car car = new Car(number,mileage);
                            listTransports.add(car);
                            listCars.add(car);
                        }
                        break;
                    case 200:
                        int dopParam1 = Integer.parseInt(parameters.split("-")[2]);
                        if(checkAvailObj(200,number)) {addParametersToTranspObj(200,number,mileage,dopParam1);}
                        else {
                            Truck truck = new Truck(number,mileage,dopParam1);
                            listTransports.add(truck);
                            listTruck.add(truck);
                        }
                        break;
                    case 300:
                        int dopParam2 = Integer.parseInt(parameters.split("-")[2]);
                        if(checkAvailObj(300,number)) {addParametersToTranspObj(300,number,mileage,dopParam2);}
                        else {
                            Bus bus = new Bus(number,mileage,dopParam2);
                            listTransports.add(bus);
                            listBus.add(bus);
                        }
                        break;
                    case 400:
                        int dopParam3 = Integer.parseInt(parameters.split("-")[2]);
                        if(checkAvailObj(400,number)) {addParametersToTranspObj(400,number,mileage,dopParam3);}
                        else {
                            Crane crane = new Crane(number,mileage,dopParam3);
                            listTransports.add(crane);
                            listCrane.add(crane);
                        }
                        break;
                    default:
                        break;
                }
            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println("Введенные данные не коректны, проверьте ваш список" );
                throw e;
            }





        }
        //расчет расходов каждого класса
        calcMaxExpAll();

    }


    //проверка по гос номеру, что такой объект уже есть в списке(метод нужен для метода addTransportsList)
    private boolean checkAvailObj(int code, int number){
        boolean result = false;
        for(Transports oneTransp: listTransports){
            if(oneTransp.getNumber()==number && oneTransp.getCode()==code) result=true;
        }
        return result;
    }


    //добавление расхода и доп параметра если объект уже есть в своих списках(метод нужен для метода addTransportsList)
    private void addParametersToTranspObj(int code,int number, int mileage, int parametr){
        for(Transports oneTransp: listTransports){
            if(oneTransp.getCode()==code && oneTransp.getNumber()==number) {
                if(code==100){
                    int mileNew = oneTransp.getMileage()+mileage;
                    oneTransp.setMileage(mileNew);
                }
                else {
                    int mileNew = oneTransp.getMileage()+mileage;
                    int paramNew = oneTransp.getDopParamet()+parametr;
                    oneTransp.setMileage(mileNew);
                    oneTransp.setDopParamet(paramNew);
                }

            }

        }

    }

    private void calcMaxExpAll(){
        double totExpCar = 0.00;
        for(Car oneCar: listCars){
            totExpCar +=oneCar.getExp();
        }
        expCars = (int) Math.round(totExpCar);

        double totExpTruck = 0.00;
        for(Truck oneTruck: listTruck){
            totExpTruck +=oneTruck.getExp();
        }
        expTruck = (int) Math.round(totExpTruck);

        double totExpBus = 0.00;
        for(Bus oneBus: listBus){
            totExpBus +=oneBus.getExp();
        }
        expBus = (int) Math.round(totExpBus);

        double totExpCrane = 0.00;
        for(Crane oneCrane: listCrane){
            totExpCrane +=oneCrane.getExp();
        }
        expCrane = (int) Math.round(totExpCrane);
    }

    //сортировка списка автомобилей(метод нужен для метода printAllSortCars())
    private void sortListCar(List<Car> lists){
        Collections.sort(lists, new Comparator() {

            public int compare(Object o1, Object o2) {

                Integer x1 = ((Car) o1).getMileage();
                Integer x2 = ((Car) o2).getMileage();
                int sComp = x1.compareTo(x2);

                return sComp;
            }});


    }

    //сортировка списка Грузовиков(метод нужен для метода printAllSortTruck())
    private void sortListTruck(List<Truck> lists){
        Collections.sort(lists, new Comparator() {

            public int compare(Object o1, Object o2) {

                Integer x1 = ((Truck) o1).getMileage();
                Integer x2 = ((Truck) o2).getMileage();
                int sComp = x1.compareTo(x2);

                if (sComp != 0) {
                    return sComp;
                }

                Integer y1 = ((Truck) o1).getDopParamet();
                Integer y2 = ((Truck) o2).getDopParamet();
                return y1.compareTo(y2);
            }});

    }

    //сортировка списка Автобусов(метод нужен для метода printAllSortBus())
    private void sortListBus(List<Bus> lists){
        Collections.sort(lists, new Comparator() {

            public int compare(Object o1, Object o2) {

                Integer x1 = ((Bus) o1).getMileage();
                Integer x2 = ((Bus) o2).getMileage();
                int sComp = x1.compareTo(x2);

                if (sComp != 0) {
                    return sComp;
                }

                Integer y1 = ((Bus) o1).getDopParamet();
                Integer y2 = ((Bus) o2).getDopParamet();
                return y1.compareTo(y2);
            }});

    }

    //сортировка списка Тяжелой техники(метод нужен для метода printAllSortCrane())
    private void sortListCrane(List<Crane> lists){
        Collections.sort(lists, new Comparator() {

            public int compare(Object o1, Object o2) {

                Integer x1 = ((Crane) o1).getMileage();
                Integer x2 = ((Crane) o2).getMileage();
                int sComp = x1.compareTo(x2);

                if (sComp != 0) {
                    return sComp;
                }

                Integer y1 = ((Crane) o1).getDopParamet();
                Integer y2 = ((Crane) o2).getDopParamet();
                return y1.compareTo(y2);
            }});

    }




}
