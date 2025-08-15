package JavaBasics;

import java.util.concurrent.locks.Condition;

public class ControlFlow {
    public static void main(String[] args) {

        boolean condition = true;

        //IF - ELSE IF - ELSE
        if(condition){ //Execute the block if the condition is true
            System.out.println("Hello");
        }

        if(condition){
            System.out.println("Hello");
        }else{ //when the condition is false, executes "else" block
            System.out.println("Bye");
        }

        if(condition){
            System.out.println("Hello");
        } else if (condition) { //when de first condition is false, evaluate this condition
            System.out.println("Hello, again");
        }else{
            System.out.println("Bye");
        }

        //WHILE AND DO WHILE
        //execute the clock until the condition is false
        while(condition){
            System.out.println("Hello");
        }

        //executes the block at least once, even if the condition is false
        do{
            System.out.println("Hello");
        }while (condition);

        //FOR
        //(CONTROLVARINIT, CONDITION, CONTROLVARCHANGE)
        /*
        In Java, a for loop increments
        the control variable after the code
        inside the loop executes.
         */
        for(int i = 1; i < 11 ; i++){
            System.out.println(i);
        }

        //Arrays
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int item : numbers) {
            if (item == 8) {
                continue;
            }
            System.out.println("Count is: " + item);
            if(item==6){
                break;
            }

        }
        //You can also use an unlabeled break to terminate a for,
        //while, or do-while loop,

        //The continue statement skips the current iteration of a for,
        // while, or do-while loop.

        //The next branching statements is the return statement. The return statement exits from the current method,
        // and control flow returns to where the method was invoked.

        //The last branching statement is the yield statement. The yield statement exits from the current switch expression it is in. A yield statement is always followed by an expression
        //that must produce a value. This expression must not be void.
    }
}
