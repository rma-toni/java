package JavaBasics;
//In Java, we have a class (Math) to perform mathematical operations
//we don't need to import the Math class
public class MathClass {
    public static void main(String[] args) {
        int abs1 = Math.abs(-20); //20
        double floor = Math.floor(7.343);  // floor = 7.0
        int min = Math.min(10, 20);//10
        double roundedDown = Math.round(23.445);
        double roundedUp   = Math.round(23.545);
        double random = Math.random();

        // There are many of other methods we can use in the Math class
        // https://www.w3schools.com/java/java_ref_math.asp
    }
}
