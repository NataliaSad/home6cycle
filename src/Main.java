public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        System.out.println(" Задача 1");
        {
            for (int i = 1; i <= 10; i++)
                System.out.println(i + " ");
        }
        System.out.println("Задача 2 ");
        {
            for (int i = 10; i >= 1; i--)
                System.out.println(i + " ");
        }
        System.out.println(" Задача 3 ");
        for (int i = 0; i < 17; i += 2) {
            System.out.println(i + " ");
        }
        System.out.println(" Задача 4 ");
        for (int i = 10; i >= -10; i--) {
            System.out.println(i + " ");
        }
        System.out.println(" Задача 5 ");
        int starYear = 1904;
        int endYear = 2096;
        for (int year = starYear; year <= endYear; year += 4) {
            System.out.println(year + " ");
        }
        System.out.println(" Задача 6 ");
        int start = 7;
        int end = 98;
        int step=7;
        for (int number = start; number <= end; number += step) {
            System.out.println(number + " ");
    }
        System.out.println(" Задача 7 ");
        start = 1;
        end = 512;
        step=2;
        for (int number = start; number <= end; number *= step) {
            System.out.println(number + " ");
} System.out.println(" Задача 8 ");
        int monthlyFee =29_000;
        int total = 0;
        int months = 12;
        for ( int month = 1; month <= months; month ++) {
            total += monthlyFee;
            System.out.println( " Месяц " + months + " сумма накоплений равна " + total+ " рублей ");
        }
        System.out.println(" Задача 9 ");
        double totalWithPercents = 0;
        double percent = 0.01;
        for ( int month = 1; month <= months; month ++) {
            totalWithPercents = totalWithPercents + monthlyFee + (totalWithPercents) * percent;
            System.out.printf( " Месяц %d, сумма накоплений равна %.2f рублей%n ", month,totalWithPercents);
        }
        System.out.println(" Задача 10 ");
        int multiplier = 2;
        for ( int number = 1; number <= 10; number++) {
            int result = multiplier * number;
            System.out.println( multiplier + " * " + number + " = " + result); }
        }
    }





