public class Sparrow extends Bird implements Flyable{
    public Sparrow(int age, String gender, double weight, String type, String favFood, int sleepTime){
        super(age, gender, weight, type, favFood, sleepTime);
    }

    public void fly(){
        System.out.println("Sparrow flying high...");
    }
}
