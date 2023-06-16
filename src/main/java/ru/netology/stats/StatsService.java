package ru.netology.stats;

public class StatsService {
    public int allSales(int[] sales) {
        int allSales = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= 0) {
                allSales = allSales + sales[i];
            }
        }
        return allSales;
    }

    public int mediumSales(int[] sales) {

        int allSales = allSales(sales);
        int allMediumSales = allSales / sales.length;
        return allMediumSales;
    }

    public int maxSalesMonth(int[] sales) {
        int maxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth;
    }

    public int minSalesMonth(int[] sales) {
        int minMonth = 0; // номер месяца с максимальными продажами среди просмотренных ранее
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж больше
                minMonth = i; // запомним его как максимальный
            }
        }
        return minMonth; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public int allMonthMinSales(int[] sales) {
        int mediumSales = mediumSales(sales);
        int allMonthSales = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < mediumSales) {
                allMonthSales = allMonthSales + 1;
            }
        }
        return allMonthSales;
    }

    public int allMonthMaxSales(int[] sales) {
        int mediumSales = mediumSales(sales);
        int allMonthSales = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > mediumSales) {
                allMonthSales = allMonthSales + 1;
            }
        }
        return allMonthSales;
    }
}
