package Java_basics;

public class Arrays {
    public static void main(String[] args) {
//        int[] values = new int[100];
//
//        values[0] = 1000;
//        // we cannot assign another type of variable to the arrays
//        // values [1] = "hello";
//        values[99] = 93423;

        double[] values = new double[100];

        values[0] = 1000;
        values[1] = 33.33;
        values[99] = 93423;

        System.out.println(values[100]);


        String[] words = new String[3];
        words[0] = "My";
        words[1] = "name";
        words[2] = "is";

        System.out.println(words[0]);

        // if make a new array then whole data will be gone
        words = new String[10];

        System.out.println(words[0]);
    }
}
