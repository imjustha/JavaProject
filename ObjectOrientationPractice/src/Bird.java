public class Bird extends Animal {
    public Bird(int age, String gender, double weight, String type, String favFood, int sleepTime){
        super(age, gender, weight, type, favFood, sleepTime);
    }

    // overriding the method defined in Bird
//    public void fly(){
//        System.out.println("Flying...");
//    }

    public void move(){
        System.out.println("Flapping wigs...");
    }
}
