package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatServiceTest {

    @Test
    void shoulsCalculateSumOfMassive() {
    StatService service = new StatService();
        int[] monthsSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected  = 180;
        int actual = service.calculateSum(monthsSales) ;
        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateAverage() {
        StatService service = new StatService();
        int[] monthsSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        double expected  = 15;
        double actual = service.calculateAverage(monthsSales) ;
        assertEquals(expected, actual);
    }

    @Test
    void shouldFindLastMonthWithMaximumOfAmount() {
        StatService service = new StatService();
        int[] monthsSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected  = 8;
        int actual = service.findLastMaxMonth(monthsSales) ;
        assertEquals(expected, actual);
    }

    @Test
    void shouldFindLastMonthWithMinimumOfAmount() {
        StatService service = new StatService();
        int[] monthsSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected  = 9;
        int actual = service.findLastMinMonth(monthsSales) ;
        assertEquals(expected, actual);
    }

    @Test
    void shouldCountMonthsWithAmountLessAverage() {
        StatService service = new StatService();
        int[] monthsSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected  = 5;
        int actual = service.countMonthsLessAverage(monthsSales) ;
        assertEquals(expected, actual);
    }

    @Test
    void shouldCountMonthsWithAmountMoreAverage() {
        StatService service = new StatService();
        int[] monthsSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected  = 5;
        int actual = service.countMonthsMoreAverage(monthsSales) ;
        assertEquals(expected, actual);
    }
}