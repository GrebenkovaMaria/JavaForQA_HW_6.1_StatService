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
        int monthMin = 0;
        for (int monthsSale : monthsSales) {
            if (monthsSale < min) min = monthsSale;
            else monthMin = monthMin +1;
            //while (monthsSale > min )
              //  monthMin = monthMin + 1;
                //break;
        }
        return monthMin;
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
