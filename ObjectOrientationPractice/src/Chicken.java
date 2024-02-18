public class Chicken extends Bird{
    public Chicken(int age, String gender, double weight, String type, String favFood, int sleepTime){
        super(age, gender, weight, type, favFood, sleepTime);
    }

    // overriding the method defined in Bird
    public void fly(){
        System.out.println("not able to fly...");
    }
}
