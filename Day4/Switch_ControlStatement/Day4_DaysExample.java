package Day4.Switch_ControlStatement;

import java.util.Scanner;

public class Day4_DaysExample {
    public static void main(String[] args) {
        System.out.print("Enter Day name:   ");
        Scanner sc = new Scanner(System.in);
       String day = sc.next().toLowerCase();

        switch(day){
            case "monday":
                System.out.println("You Selected Monday");
                break;
            case "tuesday":
                System.out.println("You Selected Tuesday");
                break;
            case "wednesday":
                System.out.println("You Selected Wednesday");
                break;
            case "thursday":
                System.out.println("You Selected Thursday");
                break;
            case "friday":
                System.out.println("You Selected Friday");
                break;
            case "saturday":
                System.out.println("You Selected Saturday");
                break;
            case "sunday":
                System.out.println("You Selected Sunday");
                break;
            default:
                System.out.println("Invalid Input");
                break;
        }
    }
}
