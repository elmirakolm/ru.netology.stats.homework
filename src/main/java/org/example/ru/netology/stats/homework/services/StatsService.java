
    package org.example.ru.netology.stats.homework.services;

    public class StatsService {

        public int minSales(long[] sales) {
            int minMonth = 0;

            for (int i = 0; i < sales.length; i++) {
                if (sales[i] <= sales[minMonth]) {
                    minMonth = i;
                }
            }

            return minMonth + 1;
        }

        public int maxSales(long[] sales) {
            int maxMonth = 0;

            for (int i = 0; i < sales.length; i++) {
                if (sales[i] > sales[maxMonth]) {
                    maxMonth = i;
                }
            }

            return maxMonth + 1;
        }

        public long totalSales(long[] sales) {
            long total = 0;

            for (long sale : sales) {
                total += sale;
            }

            return total;
        }

        public int averageSales(long[] sales) {
            long total = totalSales(sales);
            return (int) (total / sales.length);
        }

        public int monthsBelowAverage(long[] sales) {
            int average = averageSales(sales);
            int count = 0;

            for (long sale : sales) {
                if (sale <= average) {
                    count++;
                }
            }

            return count;
        }

        public int monthsAboveAverage(long[] sales) {
            int average = averageSales(sales);
            int count = 0;

            for (long sale : sales) {
                if (sale >= average) {
                    count++;
                }
            }

            return count;
        }
    }
