package JavaBasics;

public class Operators {
    public static void main(String[] args) {
        //Assignment Operator '='
        int speed = 0;

        //Arithmetics Operators
        int num1 = 10;
        int num2 = 2;
        int addition = num1 + num2;
        int substraction = num1 - num2;
        int multiplication = num1 * num2;
        int division = num1 / num2;
        int remainder = num1 % num2;

        //Unary Operators
        int num3 = +5;
        num3 = num3++;
        num3 = num3--;
        // '!' is the logical complement operator

        //Relational Operators
        int num4 = 4;
        int num5 = 6;
        boolean value1 = num4 == num5;
        boolean value2 = num4 != num5;
        boolean value3 = num4 > num5;
        boolean value4 = num4 >= num5;
        boolean value5 = num4 < num5;
        boolean value6 = num4 <= num5;

        //Conditional Operators
        boolean value7 = true;
        boolean value8 = false;
        boolean value9 = value7 && value8; //AND
        boolean valie10 = value7 || value8; //OR

        //instanceof operator
        //the instanceof operator return a boolean value if an object is an instance
        //of a class  *ob1 instanceof Class;*
        //we will see this in depth later

        //Bitwise and Bit Shift Operators
        //we will see this in depth later
    }

}
