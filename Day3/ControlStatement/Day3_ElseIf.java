package Day3.ControlStatement;

public class Day3_ElseIf {
    public static void main(String[] args) {
        int age = 2;

        if(age>50){
            System.out.println("System Hangged!!!");
            return ;
        }
        else if(age>25 && age<50){
            System.out.println("You are from Generation Millenials");
        } else if (age<25 && age>16) {
            System.out.println("You are from Generation Z");
        }else{
            System.out.println("Don't know your Generation");
        }
    }
}
