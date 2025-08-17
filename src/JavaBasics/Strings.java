package JavaBasics;

public class Strings {
    public static void main(String[] args) {
        //Strings in java are objects
        //two ways to create a string
        String string1 = new String("Hello World!");

        //String literals
        String string2 = "Hello World!";

        //Escape characters
        String slash = "\\";
        String tab = "\t";
        String carriageReturn = "\r";
        String newLine = "\n";

        //String concatenation
        String part1 = "Hello ";
        String part2 = "World!";
        String finalString = part1+part2;

        //String Length
        int length = finalString.length();
        System.out.println(length);

        //Substrings
        String substring = finalString.substring(0,5);

        //There are many of other methods we can use to manipulate
        //strings https://www.w3schools.com/java/java_ref_string.asp

    }
}
