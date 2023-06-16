package ru.netology.stats;

public class Main {
    public static void main(String[] args) {
        StatsService service = new StatsService();
        int[] sales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        int amountSales = service.allSales(sales);
        System.out.println("Общяя сумма продаж " + amountSales);
        System.out.println();
        int mediumSales = service.mediumSales(sales);
        System.out.println("Средняя сумма продаж " + mediumSales);
        System.out.println();
        int maxMonth = service.maxSalesMonth(sales);
        System.out.println("Максимальные продажи были в " + maxMonth + " месяце");
        System.out.println();
        int minMonth = service.minSalesMonth(sales);
        System.out.println("Минимальные продажи были в " + minMonth + " месяце");
        System.out.println();
        int allMinMonth = service.allMonthMinSales(sales);
        System.out.println("Количество месяцев, в которых продажи были ниже среднего " + allMinMonth);
        System.out.println();
        int allMaxMonth = service.allMonthMaxSales(sales);
        System.out.println("Количество месяцев, в которых продажи были выше среднего " + allMaxMonth);
        System.out.println();
    }
}
