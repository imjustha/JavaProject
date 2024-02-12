package Java_basics;

public class ControlFlow {
    public static void main(String[] args) {
        boolean hungry= true;

//        if(hungry){
//            System.out.println("I'm starving ...");
//        }else{
//            System.out.println("I'm not hungry");
//        }

//        if(2 == 2){
//            System.out.println("I'm starving ...");
//        }else{
//            System.out.println("I'm not hungry");
//        }

//        if(2 < 2){
//            System.out.println("I'm starving ...");
//        }else{
//            System.out.println("I'm not hungry");
//        }

        if(!hungry){
            System.out.println("I'm starving ...");
        }else{
            System.out.println("I'm not hungry");
        }

        int hungerRating = 5;

//        if(hungerRating < 6){
//            System.out.println("Not hungry");
//        }else{
//            System.out.println("I'm starving");
//        }

//        if(!(hungerRating < 6)){
//            System.out.println("Not hungry");
//        }else{
//            System.out.println("I'm starving");
//        }
//        if(!(hungerRating == 6)){
//            System.out.println("Not hungry");
//        }else{
//            System.out.println("I'm starving");
//        }
        if(!(hungerRating != 6)){
            System.out.println("Not hungry");
        }else{
            System.out.println("I'm starving");
        }

        int favoriteTemp = 90;
        int currentTemp = 60;
        String opinion;

//        if(currentTemp < favoriteTemp - 30){
//            opinion = "It's pretty darn cold...";
//        }else if(currentTemp < favoriteTemp - 20){
//            opinion = "It's kinda cold out...";
//        }else{
//            opinion = "it's beautiful day....";
//        }

        if(favoriteTemp == currentTemp){
            if(currentTemp <= favoriteTemp - 30){
                opinion = "It's pretty darn cold...";
            }else if(currentTemp < favoriteTemp - 20){
                opinion = "It's kinda cold out...";
            }else{
                opinion = "it's beautiful day....";
            }
        }else{
            opinion = "unknown temp";
        }
        System.out.println(opinion);


        int month = 4;
        String monthString;

        switch (month){
            case 1: monthString = "January";
            break;
            case 2: monthString = "Feurary";
            break;
            case 3: monthString = "March";
            break;
            case 4: monthString = "April";
            break;
            default: monthString = "Unknown Month";
            break;
        }
        System.out.println(monthString);
    }
}
