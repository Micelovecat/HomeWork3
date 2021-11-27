package ru.skypro;

public class Main {
    public static void main(String[] args) {
    HomeWork3Easy1();
    HomeWork3Easy2();
//  HomeWork3Easy2_1();
    HomeWork3Easy3();
//  HomeWorkEasy3_1();
    HomeWork3Easy4();
//  HomeWork3Easy4_1();
    HomeWork3Easy5();
//  HomeWork3Hard6();
//  HomeWork3Hard7();

    }

    public static void HomeWork3Easy1() {
        System.out.println("HomeWork3. Exercise 1.");
        int clientOS = 1;
            if (clientOS == 0) {
                System.out.println("Установите версию  приложения для iOS по ссылке");
            }
            if (clientOS == 1) {
                System.out.println("Установите версию  приложения для Android по ссылке");
            }
        }

    public static void HomeWork3Easy2() {
        System.out.println("HomeWork3. Exercise 2.");
        int clientDeviceYear = 2034;         // Выберите год производства девайса
        int clientOS = 0;                    // Выберите девайс: 0 - iOS, 1 - Android
        boolean isLiteNeeded = clientDeviceYear < 2015;
        if (isLiteNeeded && clientOS == 0) {
            System.out.println("Установите Lite-версию для iOS по ссылке");
        }
        if (isLiteNeeded && clientOS == 1) {
            System.out.println("Установите Lite-версию для Android по ссылке");
        }
        if (clientDeviceYear > 2015 && clientOS == 0) {
            System.out.println("Установите версию для iOS");
        } else
        if (clientDeviceYear > 2015 && clientOS == 1) {
            System.out.println("Установите версию для Android");
        }
    }

    public static void HomeWork3Easy2_1() {
        System.out.println("HomeWork3. Exercise 2.");
        int clientDeviceYear = 2021;         // Выберите год производства девайса
        int clientOS = 0;                    // Выберите девайс: 0 - iOS, 1 - Android
        if (clientDeviceYear < 2015 && clientOS == 0) {
            System.out.println("Установите облегченную версию для iOS по ссылке");
        } else if (clientDeviceYear < 2015 && clientOS == 1) {
               System.out.println("Установите облегченную версию для Android по ссылке");
        } else {
            System.out.println("Установите приложение");
        }
    }

    public static void HomeWork3Easy3() {
        System.out.println("HomeWork3. Exercise3.");
        int year = 1600;
        if (year % 4 == 0 && year % 400 == 0 || year % 100 != 0){
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
           }
        }

//        int conditionLeapYear1 = leapYear + 4;
        //int conditionLeapYear2 = leapYear + 400;
        //boolean isYearLeapYear = year == conditionLeapYear1 && year == conditionLeapYear2;
//          if (year == leapYear && year == conditionLeapYear1) {    // && year == leapYear + 400
//               System.out.println(year + " год является високосным");
//           } else {    //(year == leapYear + 100 && year == leapYear + 200 && year == leapYear + 300)
//               System.out.println(year + " год не является високосным");
//           }


    public static void HomeWork3Easy3_1() {
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
    }

    public static void HomeWork3Easy4() {
        System.out.println("HomeWork3. Exercise4.");
        int deliveryDistance = 5;
        int daysForDelivery = 1;
        if (deliveryDistance > 20) {
            daysForDelivery ++;
        }
        if (deliveryDistance > 60 && deliveryDistance <= 100) {
            daysForDelivery ++;
        }
        System.out.println("Потребуется дней: " + daysForDelivery + " суток");
    }

    public static void HomeWork3Easy4_1() {
        System.out.println("HomeWork3. Exercise4.");
        int deliveryDistance = 95;
        int km0_20 = 1;
        int km20_60 = km0_20 + 1;
        int km60_100 = km20_60 + 1;
           if (deliveryDistance > 0 && deliveryDistance <= 20) {
               System.out.println("Потребуется дней: " + km0_20 + " сутки");
           }
           if (deliveryDistance > 20 && deliveryDistance <= 60) {
               System.out.println("Потребуется дней: " + km20_60 + " суток");
           }
           if (deliveryDistance > 60 && deliveryDistance <= 100) {
               System.out.println("Потребуется дней: " + km60_100 + " суток");
           }
    }

        public static void HomeWork3Easy5() {
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

