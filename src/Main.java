public class Main {
    public static void main(String[] args) {

    // Задача 1: С помощью цикла for выведите в консоль все числа от 1 до 10.

        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

       // Задача 2: С помощью цикла for выведите в консоль все числа от 10 до 1.

        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }

        //Задача 3: Выведите в консоль все четные числа от 0 до 17.

        for (int i = 0; i < 18; i=i+2) {
            System.out.println(i);
        }
        // Задача 4: Выведите в консоль все числа от 10 до −10 от бо́льшего числа к меньшему.
        for (int i = 10; i > -11; i--) {
            System.out.println(i);
        }
        // Задача 5: Вывести в консоль все високосные года с 1904 по 2096
        for (int i = 1904; i <= 2096; i=i+4) {
            System.out.println(i + " год является високосным");
        }
        // Задача 6: Вывести последовательность 7 14 21 28 35 42 49 56 63 70 77 84 91 98
        for (int i = 7; i <= 98; i=i+7) {
            System.out.printf("%d ", i);
        }
        // Задача 7: Вывести последовательность 1 2 4 8 16 32 64 128 256 512
        System.out.println("");
        for (int i = 1; i <= 512; i=i*2) {
            System.out.printf("%d ", i);
        }
        // Задача 8: Посчитать сумму годовых накоплений, если откладывать по 29000 в месяц
        int money = 0;
        for (int i = 1; i <= 12; i++) {
            money = money + 29000;
            System.out.printf("\n Месяц  %d, сумма накоплений равна %d рублей", i, money);
        }
        // Задача 9: Перепишите решение задачи выше при условии, что деньги вы откладывать будете в банк под проценты — 12%
        int moneyProcent = 0;
        for (int i = 1; i <= 12; i++) {
            moneyProcent = moneyProcent + 29000 + moneyProcent/100;
            System.out.printf("\n Месяц  %d, сумма накоплений равна %d рублей", i, moneyProcent);
        }
    // Задача 10: Напишите программу, которая выводит в консоль таблицу умножения на 2
        System.out.println("");
        for (int i = 1; i < 11; i++) {
            System.out.println("2*" + i + "=" + (i*2));
        }
    }
}