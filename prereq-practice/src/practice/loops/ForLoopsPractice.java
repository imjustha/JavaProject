package practice.loops;

public class ForLoopsPractice {
    public static void main(String[] args) {
//        for(int i = 0; i < 100; i++){
//            System.out.println("i: " + i);
//        }

        String name = "wefwefwefweknlwenglk";
        for(int i = 0; i < name.length(); i++){ // or i <= name.length() - 1
            System.out.println("char: " + name.charAt(i));
        }

        String name1 = "wefwefwefweknlwenglk";
        for(int i = name.length() - 1; i >= 0; i--){ //
            System.out.println("char: " + name1.charAt(i));
        }

        // print all of the numbers that are even between 0 and 100 inclusive
        // MY SOLUTION:
//        for (int i = 0; i <= 100; i++) {
//            while(i <= 100){
//                if ((i % 2) == 0) {
//                    System.out.println(i);
//                }break;
//            }
//        }
        // ANSWER:
        for(int i = 0; i <= 100; i += 2){
            System.out.println(i);
        }
    }

}
