public class Calendar {

    public static void main(String[] args) {
        String space = "   ";
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