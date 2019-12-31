package controlStatements;

import java.util.Scanner;

public class SwitchCase {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
//        System.out.println("Enter the number of the day of the week:");
//        int dayNum = scanner.nextInt();
//        nthDayOfTheWeek(dayNum);

        System.out.println("Enter the day of the week:");
        String day = scanner.nextLine();
        printDayOfTheWeek(day);

    }

    private static void nthDayOfTheWeek(int dayNum){
        switch (dayNum){
            case 1:
                System.out.println("The day is a Sunday");
                break;
            case 2:
                System.out.println("The day is a Monday");
                break;
            case 3:
                System.out.println("The day is Tuesday");
                break;
            case 4:
                System.out.println("The day is a Wednesday");
                break;
            case 5:
                System.out.println("The day is a Thursday");
                break;
            case 6:
                System.out.println("The day is a Friday");
                break;
            case 7:
                System.out.println("The day is a Saturday");
                break;
            default:
                System.out.println("ERROR: Enter a valid day number in the range of 1-7");
        }
    }

    private static void printDayOfTheWeek(String day){
        switch (day.toUpperCase()){
            case "SUNDAY":
                System.out.println("Sunday is the 1st day of the week");
                break;
            case "MONDAY":
                System.out.println("Monday is the 2nd day of the week");
                break;
            case "TUESDAY":
                System.out.println("Tuesday is the 3rd day of the week");
                break;
            case "WEDNESDAY":
                System.out.println("Wednesday is the 4th day of the week");
                break;
            case "THURSDAY":
                System.out.println("Thursday is the 5th day of the week");
                break;
            case "FRIDAY":
                System.out.println("Friday is the 6th day of the week");
                break;
            case "SATURDAY":
                System.out.println("Saturday is the 7th day of the week");
                break;
            default:
                System.out.println("ERROR: Invalid day. Enter any day between Sunday - Saturday");
        }
    }

}
