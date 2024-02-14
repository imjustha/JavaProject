public class Fish extends Animal{

    public Fish(int age, String gender, double weight, String type, String favFood, int sleepTime){
        super(age, gender, weight, type, favFood, sleepTime);
    }
    public void swim(){
        System.out.println("Swimming...");
    }
}
