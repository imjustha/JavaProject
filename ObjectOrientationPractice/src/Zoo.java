public class Zoo {
    public static void main(String[] args){
        Animal animal1 = new Animal(24, "Female", 407.23, "Tiger", "Deer", 12);

        animal1.speak();
        animal1.eat();
        animal1.sleep();

        Bird bird1 = new Bird();
        bird1.fly();
    }
}
