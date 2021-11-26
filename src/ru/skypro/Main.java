package ru.skypro;

public class Main {
    public static void main(String[] args) {
  HomeWorkEasy1();
  HomeWorkEasy2();
//  HomeWorkEasy3();
//  HomeWorkEasy3_1();
  HomeWorkEasy4();
  HomeWorkEasy5();
//  HomeWorkHard6();
//  HomeWorkHard7();

    }
//    public static void HomeWorkEasy4() {
//        System.out.println("HomeWork2. Exercise4.");

//    }
    public static void HomeWorkEasy1() {
        System.out.println("HomeWork3. Exercise 1.");
        int clientOS = 1;
            if (clientOS == 0) {
                System.out.println("Установите версию  приложения для iOS по ссылке");
            }
            if (clientOS == 1) {
                System.out.println("Установите версию  приложения для Android по ссылке");
            }
        }

    public static void HomeWorkEasy2() {
        System.out.println("HomeWork3. Exercise 2.");
        int clientDeviceYear = 2021;         // Выберите год производства девайса
        int clientOS = 0;                    // Выберите девайс: 0 - iOS, 1 - Android
        if (clientDeviceYear < 2015 && clientOS == 0) {
            System.out.println("Установите облегченную версию для iOS по ссылке");
        }
        if (clientDeviceYear < 2015 && clientOS == 1) {
               System.out.println("Установите облегченную версию для Android по ссылке");
        } else {
            System.out.println("Установите приложение");
        }
    }

//    public static void HomeWorkEasy3() {
//        System.out.println("HomeWork3. Exercise3.");
//        int year = 1604;
//        int leapYear = 1600;
//        int conditionLeapYear1 = leapYear + 4;
        //int conditionLeapYear2 = leapYear + 400;
        //boolean isYearLeapYear = year == conditionLeapYear1 && year == conditionLeapYear2;
//          if (year == leapYear && year == conditionLeapYear1) {    // && year == leapYear + 400
//               System.out.println(year + " год является високосным");
//           } else {    //(year == leapYear + 100 && year == leapYear + 200 && year == leapYear + 300)
//               System.out.println(year + " год не является високосным");
//           }
//    }

    public static void HomeWorkEasy4() {
        System.out.println("HomeWork3. Exercise4.");
        int deliveryDistance = 50;
        int km0_20 = 1;
        int km20_60 = km0_20 + 1;
        int km60_100 = km20_60 + 1;
           if (deliveryDistance > 0 && deliveryDistance <= 20) {
               System.out.println("Потребуется дней: " + km0_20 + " сутки");
           }
           if (deliveryDistance > 20 && deliveryDistance <= 60) {
               System.out.println("Потребуется дней: " + km20_60 + " сутки");
           }
           if (deliveryDistance > 60 && deliveryDistance <= 100) {
               System.out.println("Потребуется дней: " + km60_100 + " сутки");
           }
    }

    public static void HomeWorkEasy5() {
        System.out.println("HomeWork3. Exercise5.");
        int monthNumber = 6;

        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
        }
        if (monthNumber >= 13) {
            System.out.println("Такого месяца не существует");
        }
    }
}

