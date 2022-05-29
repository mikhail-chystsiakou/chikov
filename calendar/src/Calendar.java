public class Calendar {

    /**
     * Пн Вт Ср Чт Пт Сб Вс
     * 01 02 03 04 05 06 07
     * 08 09 10 11 12 13 14
     * 15 16 17 18 19 20 21
     * 22 23 24 25 26 27 28
     * 29 30 31
     *
     * Пн Вт Ср Чт Пт Сб Вс
     *       01 02 03 04 05
     * 06 07 08 09 10 11 12
     * 13 14 15 16 17 18 19
     * 20 21 22 23 24 25 26
     * 27 28 29 30 31
     *
     */
    public static void main(String[] args) {
        int day = 1;

        while (day < 32) {
            String dayPrint = day + " ";

            if (day < 10) {
                dayPrint = "0" + dayPrint;
            }

            System.out.printf("%02d ", day);


            int d = day % 7;
            if (d == 0) {
                System.out.println();
            }

            day++;
        }
    }


    public static void step6() {
        String space; // объявление - define
        space = "   ";// определение - definition

        String[] weekdays = {"Пн", "Вт", "Ср", "Чт", "Пт", "Сб", "Вс"};

        int number = 0;
        int последнийДень = weekdays.length - 1;
        while (number < последнийДень) {
            System.out.print(weekdays[number] + space);
            number++;
        }
        System.out.print(weekdays[number]);
    }

    public static void step5() {
        String space = "   ";
        String[] weekdays = {"Пн", "Вт", "Ср", "Чт", "Пт", "Сб", "Вс"};

        int number = 0;
        System.out.print(weekdays[number] + space);
        number++; // number = number + 1;
        System.out.print(weekdays[number] + space);
        number++; // number = number + 1;
        System.out.print(weekdays[number] + space);
        number++; // number = number + 1;
        System.out.print(weekdays[number] + space);
        number++; // number = number + 1;
        System.out.print(weekdays[number] + space);
        number++; // number = number + 1;
        System.out.print(weekdays[number] + space);
        number++; // number = number + 1;
        System.out.print(weekdays[number]);
    }

    public static void step1() {
        System.out.println("Пн Вт Ср Чт Пт Сб Вс");
    }

    public static void step2() {
        String weekdays = "Пн Вт Ср Чт Пт Сб Вс";

        System.out.println(weekdays);
    }

    public static void step3() {
        String space = "   ";
        String day1 = "Пн";
        String day2 = "Вт";
        String day3 = "Ср";
        String day4 = "Чт";
        String day5 = "Пт";
        String day6 = "Сб";
        String day7 = "Вс";

        String weekdays = "";
        weekdays += day1 + space; // "" + "Пн" + "   " = "Пн   "
        weekdays += day2 + space; // "Пн   " + "Вт" + "   " = "Пн   Вт   "
        weekdays += day3 + space;
        weekdays += day4 + space;
        weekdays += day5 + space;
        weekdays += day6 + space;
        weekdays += day7;

        System.out.println(weekdays);
    }

    public static void step4() {
        String space = "   ";
        String[] weekdays = {"Пн", "Вт", "Ср", "Чт", "Пт", "Сб", "Вс"};

        String weekdaysString = "";
        weekdaysString += weekdays[0] + space; // "" + "Пн" + "   " = "Пн   "
        weekdaysString += weekdays[1] + space; // "Пн   " + "Вт" + "   " = "Пн   Вт   "
        weekdaysString += weekdays[2] + space;
        weekdaysString += weekdays[3] + space;
        weekdaysString += weekdays[4] + space;
        weekdaysString += weekdays[5] + space;
        weekdaysString += weekdays[6];

        System.out.println(weekdaysString);
    }


}