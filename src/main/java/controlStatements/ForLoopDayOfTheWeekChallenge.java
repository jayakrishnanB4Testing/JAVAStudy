package controlStatements;

import java.util.Scanner;

public class ForLoopDayOfTheWeekChallenge {

    private static String day;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter the day of the week:");
        String day = scanner.next();
        printDayOfTheWeek(day);
    }

    public static void printDayOfTheWeek(String day){
        if (day.equalsIgnoreCase("SUNDAY")) {
            System.out.println("Sunday is the 1st day of the week");
        } else if (day.equalsIgnoreCase("MONDAY")) {
            System.out.println("Monday is the 2nd day of the week");
        } else if (day.equalsIgnoreCase("Tuesday")) {
            System.out.println("Tuesday is the 3rd day of the week");
        } else if (day.equalsIgnoreCase("Wednesday")) {
            System.out.println("Wednesday is the 4th day of the week");
        } else if (day.equalsIgnoreCase("thursday")) {
            System.out.println("Thursday is the 5th day of the week");
        } else if (day.equalsIgnoreCase("Friday")) {
            System.out.println("Friday is the 6th day of the week");
        } else if (day.equalsIgnoreCase("Saturday")) {
            System.out.println("Saturday is the 7th day of the week");
        } else {
            System.out.println("Error: Invalid day");
        }
    }
}
