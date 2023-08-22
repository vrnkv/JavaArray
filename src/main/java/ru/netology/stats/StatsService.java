package ru.netology.stats;

public class StatsService {
    public long sum(long[] sales) {
        long totalSale = 0;
        for (long sale : sales) {
            totalSale += sale;
        }
        return totalSale;
    }

    public long average(long[] sales) {
        return sum(sales) / sales.length;
    }

    public long max(long[] sales) {
        int monthMax = 0;
        long saleMax = sales[0];

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= saleMax) {
                monthMax = i;
                saleMax = sales[i];
            }
        }
        return monthMax + 1;
    }

    public long min(long[] sales) {
        int monthMin = 0;
        long saleMin = sales[0];

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= saleMin) {
                monthMin = i;
                saleMin = sales[i];
            }
        }
        return monthMin + 1;
    }

    public int belowAverage(long[] sales) {
        long avaradeSale = average(sales);
        int counter = 0;
        for (long sale : sales) {
            if (sale < avaradeSale) {
                counter++;
            }
        }
        return counter;
    }

    public int aboveAverage(long[] sales) {
        long avaradeSale = average(sales);
        int counter = 0;
        for (long sale : sales) {
            if (sale > avaradeSale) {
                counter++;
            }
        }
        return counter;
    }
}