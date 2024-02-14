public class Bird extends Animal {
    public Bird(int age, String gender, double weight, String type, String favFood, int sleepTime){
        super(age, gender, weight, type, favFood, sleepTime);
    }
    public void fly(){
        System.out.println("Flying...");
    }
}
