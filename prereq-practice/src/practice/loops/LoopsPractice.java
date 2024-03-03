package practice.loops;

public class LoopsPractice {
    public static void main(String[] args) {

//        int count = 0;
//        while(count <= 100){
//            System.out.println("Ha Jeong : " + count);
//            count = count + 1;
//        }

        // not going to print anything
//        int count = 0;
//        while(!(count <= 100)){
//            System.out.println("Ha Jeong : " + count);
//            count = count + 1;
//        }

//        int count = 0;
//        while(count <= 100){
//            System.out.println("Ha Jeong : " + count);
//            count = count + 1;
//
//            if(count == 30){
//                break;
//
//            }
//        }
        String str = "We have a large inventory of things in our warehouse falling in "
                + "the category:apperal and the slightly"
                + "more in demand category:makeup along with the category:furniture and...";
        printCategories(str);
    }
    /*
    * Extract all categories from the string argument
    * @param str
    */
    public static void printCategories(String str){
        int i = 0;
        while(true){
            int found = str.indexOf("category:", i);
            if(found == -1) break;
            int start = found + 9; // start of the actual category
            int end = str.indexOf(" ", start);
            System.out.println(str.substring(start, end));
            i = end + 1;
        }
    }
}
