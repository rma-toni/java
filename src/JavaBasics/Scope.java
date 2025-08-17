package JavaBasics;

//variable are only accessible in their scope

public class Scope {
    int number = 5; //variable "number" of type int is in the Class scope

    public static void main(String[] args) {
        String name = "Robert"; //variable "name" of type String is in the main Method Scope
        int control = 6;
        while(control > 5){
            double number3 = 4.5; //variable "number" is in the loop scope
        }

        {
            boolean value = false; //variable "value" is in the bracket scope
        }

    }

    public void method1(){
        float number2 = 2.7f; //variable "number2" of type Float is in the method1 Method Scope
    }
}
