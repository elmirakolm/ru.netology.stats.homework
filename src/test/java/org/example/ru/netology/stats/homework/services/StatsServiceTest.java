package org.example.ru.netology.stats.homework.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    @Test
    public void shouldCalculateMinSales() {
        StatsService service = new StatsService();
        int expected = 9;
        int actual = service.minSales(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateMaxSales() {
        StatsService service = new StatsService();
        //long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 6;
        int actual = service.maxSales(sales);
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldCalculateTotalSales() {
        StatsService service = new StatsService();
        //long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;
        long actual = service.totalSales(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateAverageSales() {
        StatsService service = new StatsService();
        //long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;
        int actual = service.averageSales(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateMonthsBelowAverage() {
        StatsService service = new StatsService();
        //long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.monthsBelowAverage(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateMonthsAboveAverage() {
        StatsService service = new StatsService();
        //long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.monthsAboveAverage(sales);
        Assertions.assertEquals(expected, actual);
    }
}