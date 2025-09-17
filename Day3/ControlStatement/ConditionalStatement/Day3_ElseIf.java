package Day3.ControlStatement.ConditionalStatement;

public class Day3_ElseIf {
    public static void main(String[] args) {
        int age = 2;

        if(age>50){ // if age is greater than 50
            System.out.println("System Hangged!!!");
            return ;
        }
        else if(age>25 && age<50){ // else age is greater than 25 And age should be less than 50
            System.out.println("You are from Generation Millenials");
        } else if (age<25 && age>16) { // else if age should be less than 25 and greater than 16
            System.out.println("You are from Generation Z");
        }else{ // Default Condition
            System.out.println("Don't know your Generation");
        }
    }
}
