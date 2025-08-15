package JavaBasics;

public class Arrays {
    public static void main(String[] args) {

        int[] numbers = {1,2,3};

        // declares an array of integers
        int[] anArray;

        // allocates memory for 10 integers
        anArray = new int[10];

        // initialize first element
        anArray[0] = 100;
        anArray[1] = 200;
        anArray[2] = 300;
        anArray[3] = 400;
        anArray[4] = 500;
        anArray[5] = 600;
        anArray[6] = 700;
        anArray[7] = 800;
        anArray[8] = 900;
        anArray[9] = 1000;

        System.out.println("Element at index 5: " + anArray[5]);

        //Multidimensional Arrays
        int[][] numbers2 = {
                {1,2,3},
                {4,5,6}
        };

        int length = anArray.length;
    }
}


