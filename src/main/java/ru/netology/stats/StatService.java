package ru.netology.stats;

public class StatService {

    public int calculateSum(int[] monthsSales) {
        int sum = 0;
        for (int monthsSale : monthsSales) {
            sum += monthsSale;
        }
        return sum;
    }

    public double calculateAverage(int[] monthsSales) {
        double averageSum = (double)calculateSum(monthsSales) / (monthsSales.length);
        return averageSum;
    }

    public int findLastMaxMonth(int[] monthsSales) {
        int maxMonth = 0;
        for (int i = 1; i < monthsSales.length; i++)
            if (monthsSales[i] >= monthsSales[maxMonth])
            maxMonth = i;
        return maxMonth + 1;
    }

    public int findLastMinMonth(int[] monthsSales) {
        int minMonth = 0;
        for (int i = 1; i < monthsSales.length; i++)
            if ( monthsSales[i] <= monthsSales[minMonth])
                minMonth = i;
            return minMonth + 1;
        }

    public int countMonthsLessAverage(int[] monthsSales) {
        int monthsLessAverage = 0;
        for (int monthsSale : monthsSales) {
            if (monthsSale > calculateAverage(monthsSales)) monthsLessAverage = monthsLessAverage + 1;
        }
        return monthsLessAverage;
    }

    public int countMonthsMoreAverage(int[] monthsSales) {
        int monthsMoreAverage = 0;
        for (int monthsSale : monthsSales) {
            if (monthsSale < calculateAverage(monthsSales)) monthsMoreAverage = monthsMoreAverage + 1;
        }
        return monthsMoreAverage;
    }
}
