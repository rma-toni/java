package JavaBasics;

public class TypeCasting {
    public static void main(String[] args) {
        // 1 - widening:
        // Widening type casting is the process of converting a lower data type
        // to a higher data type. No risk of data loss
        // byte -> short -> char -> int -> long -> float -> double
        // (From left to right: Lower data type to Higher data type)
        // This process is performed automatically

        byte number1 = 2;
        int number2 = number1; //automatically convert from byte to int

        // 2 - narrowing:
        // Process of reducing a large data type to a smaller one.
        // other names for this is "explicit casting"
        // is unsafe because data loos might occur.
        // We need a cast operador
        // double -> float -> long -> int -> char -> short -> byte
        // (From left to right: Higher data type to Lower data type)

        double number3 = 127.0;
        int number4 = (int) number3;
        short number5 = (short) number4;

        // 3 - INT to String, String to INT
        // We need use the String and Integer class for this conversion
        int number6 = 1452;
        String number7 = String.valueOf(number6);
        int number8 = Integer.parseInt(number7);
    }
}
