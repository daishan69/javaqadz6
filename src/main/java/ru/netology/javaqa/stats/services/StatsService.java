package ru.netology.javaqa.stats.services;


public class StatsService {

    public long sumSales(long[] sales) {
        long sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum = sum + sales[i];
        }
        return sum;

    }

    public long midlSumSales(long[] sales) {
        long sum = sumSales(sales);
        long midl = sum / sales.length;
        return midl;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public int belowMidlSales(long[] sales) {
        long mid = midlSumSales(sales);
        int belowMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < mid) {
                belowMonth ++;

            }
        }
        return belowMonth ;

    }

    public int higherMidlSales(long[] sales) {
  long midl = midlSumSales(sales);
        int highMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > midl) {
                highMonth ++;
            }
        }
        return highMonth;

    }
}
