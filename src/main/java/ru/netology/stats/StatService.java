package ru.netology.stats;

public class StatService {

    public int calculateSum(int[] monthsSales) {
        int sum = 0;
        for (int monthsSale : monthsSales) {
            sum += monthsSale;
        }
        return sum;
    }

    public int calculateAverage(int[] monthsSales) {
        int sum = 0;
        for (int monthsSale : monthsSales) {
            sum += monthsSale;
        }
        int averageSum = sum / (monthsSales.length);
        return averageSum;
    }

    public int findLastMaxMonth(int[] monthsSales) {
        int max = 0;
        int monthMax = 0;
        for (int monthsSale : monthsSales) {
            if (monthsSale > max) max = monthsSale;
            else monthMax = monthMax + 1;
        }
        return monthMax;
    }

    public int findLastMinMonth(int[] monthsSales) {
        int min = monthsSales[0];
        int monthMin = 1;
        for (int monthsSale : monthsSales) {
            if (monthsSale < min) min = monthsSale;
        }
        for (int i = 0; monthsSales[i] > min; i++) {
            monthMin = monthMin + 1;
        }
        return monthMin;
    }

    public int countMonthsLessAverage(int[] monthsSales) {
        int sum = 0;
        int monthsLessAverage = 0;
        for (int monthsSale : monthsSales) {
            sum += monthsSale;
        }
        int averageSum = sum / (monthsSales.length);
        for (int monthsSale : monthsSales) {
            if (monthsSale > averageSum) monthsLessAverage = monthsLessAverage + 1;
        }
        return monthsLessAverage;
    }

    public int countMonthsMoreAverage(int[] monthsSales) {
        int sum = 0;
        int monthsMoreAverage = 0;
        for (int monthsSale : monthsSales) {
            sum += monthsSale;
        }
        int averageSum = sum / (monthsSales.length);
        for (int monthsSale : monthsSales) {
            if (monthsSale < averageSum) monthsMoreAverage = monthsMoreAverage + 1;
        }
        return monthsMoreAverage;
    }
}
