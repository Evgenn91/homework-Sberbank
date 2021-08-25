package com.github.Evgenn91;

public class TestTransport {
    public static void main(String[] args) {

        String[] inputList = new String[]{"C100_1-100",
                "C200_1-120-1200", "C300_1-120-30",
                "C400_1-80-20", "C100_2-50", "C200_2-40-1000",
                "C300_2-200-45", "C400_2-10-20", "C100_3-10",
                "C200_3-170-1100", "C300_3-150-29", "C400_3-100-28",
                "C100_1-300", "C200_1-100-750", "C300_1-32-15"
        };

        CalculationExpensesFuel calculationExpensesFuel = new CalculationExpensesFuel();
        calculationExpensesFuel.addTransportsList(inputList);

        //вывод общей стоимости расходов ГСМ
        calculationExpensesFuel.getTotExpTransp();

        //вывод расхода каждого класса авто
        calculationExpensesFuel.getTotExpClassTransp();

        //вывод авто с наибольшей стоимостью расходов
        calculationExpensesFuel.getMaxExpClass();

        //вывод авто с наименьшей стоимостью расходов
        calculationExpensesFuel.getMinExpClass();

        //вывод на экран отсортированного списка легковых автомобилей
        calculationExpensesFuel.printAllSortCars();

        //вывод на экран отсортированного списка грузового авто
        calculationExpensesFuel.printAllSortTruck();

        //вывод на экран отсортированного списка пассажирского транспорта
        calculationExpensesFuel.printAllSortBus();

        //вывод на экран отсортированного списка тяжелой техники
        calculationExpensesFuel.printAllSortCrane();

    }
}
