public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }


    public static void task1() {
        System.out.println("Задача 1");


        int a = 45;
        byte b = 5;
        short c = 78;
        long d = 7990L;
        float e = 449.8f;
        double f = 56.097;
        System.out.println("Значение переменной 'a' с типом int равно " + a);
        System.out.println("Значение переменной 'b' с типом byte равно " + b);
        System.out.println("Значение переменной 'c' с типом short равно " + c);
        System.out.println("Значение переменной 'd' с типом long равно " + d);
        System.out.println("Значение переменной 'e' с типом float равно " + e);
        System.out.println("Значение переменной 'f' с типом double равно " + f);
    }

    public static void task2() {
        System.out.println("Задача 2");

        float f = 27.12f;
        long l = 987678965549L;
        double d = 2.786;
        short s = 569;
        int i = -159;
        int ii = 27897;
        byte b = 67;
        System.out.println(f);
        System.out.println(l);
        System.out.println(d);
        System.out.println(s);
        System.out.println(i);
        System.out.println(ii);
        System.out.println(b);
       }
    public static void task3() {
        System.out.println("Задача 3");

        byte class1 = 23;
        byte class2 = 27;
        byte class3 = 30;
        int totalStudents = class1 + class2 + class3;
        short paper = 480;
        int paperToStudent = paper / totalStudents;
        System.out.println("На каждого ученика рассчитано " + paperToStudent + " листов бумаги");
    }
    public static void task4() {
        System.out.println("Задача 4");

        byte bottleInMin = 16 / 2;
        byte twentyMin = 20;
        short day = 24 * 60;
        int threeDays = day * 3;
        int month = day * 30;
        System.out.println("За 20 минут машина произвела " + bottleInMin*twentyMin + " штук бутылок");
        System.out.println("За сутки машина произвела " + bottleInMin*day + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + bottleInMin*threeDays + " штук бутылок");
        System.out.println("За месяц машина произвела " + bottleInMin*month + " штук бутылок");
    }
    public static void task5() {
        System.out.println("Задача 5");

        byte cansOfPaint = 120;
        byte whiteCansOneClass = 2;
        byte brownCansOneClass = 4;
        int totalCansOnClass = whiteCansOneClass + brownCansOneClass;
        int totalClass = cansOfPaint / totalCansOnClass;
        System.out.println("В школе, где " + totalClass + " классов, нужно " + totalClass*whiteCansOneClass +
                " банок белой краски и " + totalClass*brownCansOneClass + " банок коричневой краски");
    }
    public static void task6() {
        System.out.println("Задача 6");

        byte banana = 80;
        byte numberBanana = 5;
        int totalBananaWeight = banana * numberBanana;
        short milkVolume = 200;
        float oneMlMilk = 105 / 100f;
        float totalMilkWeight = milkVolume * oneMlMilk;
        byte iceCream = 100;
        byte numberIceCream = 2;
        int totalIceCreamWeight = iceCream * numberIceCream;
        byte oneEggWeight = 70;
        byte numberEggs = 4;
        int totalEggsWeight = oneEggWeight * numberEggs;
        float totalWeightGram = totalBananaWeight + totalMilkWeight + totalIceCreamWeight + totalEggsWeight;
        int grPerKg = 1000;
        float totalWeightKg = totalWeightGram / grPerKg;
        System.out.println("Спортзавтрак спортсмена равен " + totalWeightGram + " грамм");
        System.out.println("Спортзавтрак спортсмена равен " + totalWeightKg + " кг");
    }
    public static void task7() {
        System.out.println("Задача 7");
        int grPerKg = 1000;
        int excessWeight = 7 * grPerKg;
        short lossPerDayMin = 250;
        short lossPerDayMax = 500;
        int maxRes = excessWeight / lossPerDayMin;
        int minRes = excessWeight / lossPerDayMax;
        int averageRes = maxRes / 2 + minRes / 2;
        System.out.println("В среднем, чтобы добиться результата похудения, понадобится " + averageRes +
                " день/дней (минимальный срок: " + minRes + " день/дней, максимальный срок: " + maxRes +
                " день/дней)");
    }
    public static void task8() {
        System.out.println("Задача 8");
        int mashaSalary = 67760;
        int denisSalary = 83690;
        int kristinaSalary = 76230;
        float indexMashaSal = mashaSalary * 1.1f;
        float indexDenSal = denisSalary * 1.1f;
        float indexKrisSal = kristinaSalary * 1.1f;
        byte year = 12;
        float riseMashaYearSal = indexMashaSal*year - mashaSalary*year;
        float riseDenYearSal = indexDenSal*year - denisSalary*year;
        float riseKrisSal = indexKrisSal*year - kristinaSalary*year;
        System.out.println("Маша теперь получает " + indexMashaSal + " рублей. Годовой доход вырос на " +
                riseMashaYearSal + " рублей.");
        System.out.println("Денис теперь получает " + indexDenSal + " рублей. Годовой доход вырос на " +
                riseDenYearSal + " рублей.");
        System.out.println("Кристина теперь получает " + indexKrisSal + " рублей. Годовой доход вырос на " +
                riseKrisSal + " рублей.");
    }
}
