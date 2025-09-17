package Day3.ControlStatement.Loops;

public class Day3_ForLoop {
    public static void main(String[] args) {
        int count = 5;

        if(count> 0){
            System.out.println("Starting Count ");
            for(int i=count; i>=0; i--){
                System.out.println(i);
            }
            System.out.println("Let's play");
        }else{
            System.out.println("Count should positive number");
        }
    }
}
