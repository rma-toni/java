package JavaBasics;

public class NonPrimitiveTypes {

    public enum Names{
        Genesis, Toni, Rogelio
    }

    public static void main(String[] args) {

        //1 - STRINGS
        //String is a Non-Primitive type, is a non-mutable array of characters
        String address = "Av. Mayo 512";

        //2 - ARRAYS
        //Arrays: A collection of primitive or not primitive types
        //Direct init
        int[] numbers1 = {1,2,3};
        //Declare numbers2 int array
        int[] numbers2;
        //init: allocates memory for an array of 3 integers
        numbers2 = new int[3];
        numbers2[1] = 2;

        //3 - CLASSES
        Person person1 = new Person("Albert");

        //4 - ENUMS
        Names name1 = Names.Toni;

        //5 - RECORDS
        //Java 17 introduces the RECORDS, the records are an alternative to a classes.
        //records generate getters, toString, equals, hashcode and Constructor method
        //automatically.

        //I'll leave the RECORDS section incomplete for now.

    }

}
