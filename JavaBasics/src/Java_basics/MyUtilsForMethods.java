package Java_basics;

public class MyUtilsForMethods {
    public static String printSomeJunk(String arg){
//        System.out.println("Some bla bla " + arg);
        return arg;
    }

    public static void printSomeJunk(int arg){
        System.out.println("Integer passed in: " + arg);
    }

    public static void sum2Numbers(int firstArg, int secondArg){
        System.out.println(firstArg + secondArg);
    }

//    public static void add10(int someArgument){
//        int result = someArgument + 10;
//        return result;
//    } void cannot be returend anything
    public static int add10(int someArgument){
        int result = someArgument + 10;
        return result; // if want to return use type
    }

}
