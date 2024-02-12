package Java_basics;

public class Methods {
    public static void main(String[] args) {

        System.out.println("wefwef");
//        printSomeJunk("this is new sentence");
//        printSomeJunk(34);

        MyUtilsForMethods.printSomeJunk("this is new sentence");
        MyUtilsForMethods.printSomeJunk(34);

        MyUtilsForMethods.sum2Numbers(10, 23);

//        MyUtilsForMethods.add10(99);
//        int myvar = MyUtilsForMethods.add10(99);
        // could calculate with it if it returns
        int myvar = MyUtilsForMethods.add10(99) + 1000 - 50;
        System.out.println(myvar);


        System.out.println(MyUtilsForMethods.printSomeJunk("Hello there"));
    }
//    public static void printSomeJunk(String arg){
//        System.out.println("Some bla bla " + arg);
//    }
//
//    public static void printSomeJunk(int arg){
//        System.out.println("Integer passed in: " + arg);
//    }
}
