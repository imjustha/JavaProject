package strings;

public class StringsPractice {
    public static void main(String[] args) {

        String a = "hello";
        System.out.println(a.length());

        String str = "ABCDEFG";
//        String extractedString = str.substring(1);
        String extractedString = str.substring(2);
        System.out.println(extractedString);
        // str.substring(0,2) -> "AB"
        // str.substring(1,3) -> "BC"
        // str.substring(3,6) -> "DEF"
        // str.substring(3,7) -> "DEFG"

        String a1 = "hello";
        String b = "there";
        if(a1 == "hello"){
            // THIS IS A TRAP, DON'T DO THIS
        }

        if(a.equals("hello")){
            // USE THIS!!
        }

//        if(b.equals("there")){
//            System.out.println("Printed there");
//        }

        if(b.equalsIgnoreCase("TheRE")){
            System.out.println("Printed there");
        }

        System.out.println(a1.charAt(3));
        // System.out.println(a1.charAt(13)); it does not work because it exceeds the length
        // System.out.println(a1.charAt(-3)); it does not work either

        // character only contains sing quote
        // char myChar = 'H';
        // char myChar = '}';
        // char myChar = '0';

        String str1 = "Hello yogi there yogi there";
        int a2 = str1.indexOf("there");
        System.out.println(a2);
        int a3 = str1.indexOf("there", 7);
        System.out.println(a3);
        int a4 = str1.indexOf("there", 0);
        System.out.println(a4);

        int b1 = str1.lastIndexOf("yogi");
        System.out.println(b1);
    }
}
