package Day3.ControlStatement.ConditionalStatement;

public class Day3_Else {
    public static void main(String[] args) {
        int age = 21;

        if(age>=18){ // checking if age is greater than or equal to 18 ? if yes printing block code , otherwise skip the block
            System.out.println("You are eligible for Driving License");
        }else{ // Default Condition
            System.out.println("Your are not 18 yet");
        }
    }
}
