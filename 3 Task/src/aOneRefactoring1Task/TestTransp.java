package aOneRefactoring1Task;


import aOneRefactoring1Task.transport.Car;

/**
 * Переработать задачу про ГСМ с использование коллекций.
 * Добавить иерархию классов, а также провести переработку приложения с использованием коллекций.
 */

public class TestTransp {
    public static void main(String[] args) {

        String[] inputList = new String[]{"C100_1-100",
                "C200_1-120-1200", "C300_1-120-30",
                "C400_1-80-20", "C100_2-50", "C200_2-40-1000",
                "C300_2-200-45", "C400_2-10-20", "C100_3-10",
                "C200_3-170-1100", "C300_3-150-29", "C400_3-100-28",
                "C100_1-300", "C200_1-100-750", "C300_1-32-15"
        };

        CalculExpensFuel calculationExpensesFuel = new CalculExpensFuel();
        calculationExpensesFuel.addTransportsList(inputList);

        //вывод общей стоимости расходов ГСМ
        calculationExpensesFuel.getTotExpTransp();
        System.out.println("-----------------");
        System.out.println("-----------------");

        //вывод расхода каждого класса авто
        calculationExpensesFuel.getTotExpClassTransp();
        System.out.println("-----------------");
        System.out.println("-----------------");

        //вывод авто с наибольшей стоимостью расходов
        calculationExpensesFuel.getMaxExpClass();
        System.out.println("-----------------");
        System.out.println("-----------------");

        //вывод авто с наименьшей стоимостью расходов
        calculationExpensesFuel.getMinExpClass();
        System.out.println("-----------------");
        System.out.println("-----------------");

        //вывод на экран отсортированного списка легковых автомобилей
        calculationExpensesFuel.printAllSortCars();
        System.out.println("-----------------");

        //вывод на экран отсортированного списка грузового авто
        calculationExpensesFuel.printAllSortTruck();
        System.out.println("-----------------");

        //вывод на экран отсортированного списка пассажирского транспорта
        calculationExpensesFuel.printAllSortBus();
        System.out.println("-----------------");

        //вывод на экран отсортированного списка тяжелой техники
        calculationExpensesFuel.printAllSortCrane();
        System.out.println("-----------------");
        System.out.println("-----------------");


    }
}
