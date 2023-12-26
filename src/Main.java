public class Main {

    public static void main(String[] args)
    {
        //Task 1
        System.out.println("TASK 1");
        int i = 1029432;
        byte b = 120;
        short sh = 3457;
        long l = 3245367L;
        float fl = 324.7569f;
        double d = 5674.58769533;
        System.out.println("Значение переменной i с типом int равно " + i );
        System.out.println("Значение переменной b с типом byte равно " + b );
        System.out.println("Значение переменной sh с типом short равно " + sh );
        System.out.println("Значение переменной l с типом long равно " + l );
        System.out.println("Значение переменной fl с типом float равно " + fl );
        System.out.println("Значение переменной d с типом double равно " + d );
        System.out.println("--------------------------------------------------------");

        //Task 2
        float myFloat = 27.12f;
        long myLong = 987678965549L;
        double myDouble = 2.786;
        short myShort = 569;
        int myInteger = -159;
        short myShort2 = 27897;
        byte myByte = 67;


        //Task 3
        System.out.println("TASK 3");
        int students1 = 23;
        int students2 = 27;
        int students3 = 30;
        int sheets = 480;

        int result = sheets / (students1 + students2 + students3);

        System.out.println("На каждого ученика рассчитано " + result + " листов бумаги");
        System.out.println("--------------------------------------------------------");

        //Task 4
        System.out.println("TASK 4");
        int bottles = 16;
        int time = 2;

        int productivity = bottles / time; //производительность за одну минуту

        int bottlesAmountForTwentyMinutes = productivity * 20;
        int bottlesAmountForOneDay = productivity * 24 * 60;
        int bottlesAmountForThreeDays = productivity * 3 * 24 * 60;
        int bottlesAmountForOneMonth = productivity * 30 * 24 * 60; //учитываю, что в 1 месяце 30 дней

        System.out.println("За 20 минут машина произвела " + bottlesAmountForTwentyMinutes + " штук бутылок");
        System.out.println("За 1 день машина произвела " + bottlesAmountForOneDay + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + bottlesAmountForThreeDays + " штук бутылок");
        System.out.println("За 1 месяц машина произвела " + bottlesAmountForOneMonth + " штук бутылок");
        System.out.println("--------------------------------------------------------");

        //Task 5
        System.out.println("TASK 5");
        int cans = 120;
        int whiteCansForClassroom = 2;
        int brownCansForClassroom = 4;

        int classrooms = cans / (whiteCansForClassroom + brownCansForClassroom);

        int whiteCans = classrooms * whiteCansForClassroom;
        int brownCans = classrooms * brownCansForClassroom;

        System.out.println("В школе, где " + classrooms + " классов," +
                "нужно " + whiteCans + " банок белой краски и " + brownCans + " банок коричневой краски");
        System.out.println("--------------------------------------------------------");

        //Task 6
        System.out.println("TASK 6");
        int bananas = 5;
        int weightOfOneBanana = 80;

        int milk = 200;
        int weightOfMilkForOneHundredMl = 105;

        int iceCream = 2;
        int weightOfOneIceCream = 100;

        int eggs = 4;
        int weightOfOneEgg = 70;

        int totalWeightGr = bananas * weightOfOneBanana +   //общая масса в граммах
                milk / 100 * weightOfMilkForOneHundredMl +
                iceCream * weightOfOneIceCream +
                eggs * weightOfOneEgg;

        double totalWeightKg = 1.0 * totalWeightGr / 1000;

        System.out.println("Общая масса смеси в граммах: " + totalWeightGr + " гр");
        System.out.println("Общая масса смеси в килограммах: " + totalWeightKg + " кг");
        System.out.println("--------------------------------------------------------");

        //Task 7
        System.out.println("TASK 7");
        int weightToLose = 7;
        int weightPerDay1 = 250;
        int weightPerDay2 = 500;

        double weightPerDayInKg1 = weightPerDay1 * 1.0/ 1000;
        double weightPerDayInKg2 = weightPerDay2 * 1.0/ 1000;

        double time1 = weightToLose / weightPerDayInKg1;
        double time2 = weightToLose / weightPerDayInKg2;

        double averageTime = (time1 + time2) / 2;

        System.out.println("Если сбрасывать " + weightPerDay1 + " гр в день, то чтобы похудеть на " +
                weightToLose + " кг, нужно " + time1 + " дня(-ей)");
        System.out.println("Если сбрасывать " + weightPerDay2 + " гр в день, то чтобы похудеть на " +
                weightToLose + " кг, нужно " + time2 + " дня(-ей)");
        System.out.println("В среднем, чтобы похудеть на " + weightToLose + " кг, нужно " + averageTime + " дня(-ей)");
        System.out.println("--------------------------------------------------------");

        //Task 8
        System.out.println("TASK 8");
        int salaryOfMasha = 67760;
        int salaryOfDenis = 83690;
        int salaryOfChristina = 76230;
        double salaryIncreasePercentage = 10;

        double newSalaryOfMasha = salaryOfMasha + (double)10 / 100 * salaryOfMasha;
        double newSalaryOfDenis = salaryOfDenis + (double)10 / 100 * salaryOfDenis;
        double newSalaryOfChristina = salaryOfChristina + (double)10 / 100 * salaryOfChristina;

        double salaryIncreaseForMashaPerYear = 12 * (0.1 * salaryOfMasha);
        double salaryIncreaseForDenisPerYear = 12 * (0.1 * salaryOfDenis);
        double salaryIncreaseForChristinaPerYear = 12 * (0.1 * salaryOfChristina);

        System.out.println("Маша теперь получает " + newSalaryOfMasha + " рублей." +
                " Годовой доход вырос на " + salaryIncreaseForMashaPerYear + " рублей");
        System.out.println("Денис теперь получает " + newSalaryOfDenis + " рублей." +
                " Годовой доход вырос на " + salaryIncreaseForDenisPerYear + " рублей");
        System.out.println("Кристина теперь получает " + newSalaryOfChristina + " рублей." +
                " Годовой доход вырос на " + salaryIncreaseForChristinaPerYear + " рублей");
    }
}