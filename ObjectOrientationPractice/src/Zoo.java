public class Zoo {
    public static void main(String[] args){
        Animal animal1 = new Animal(24, "Female", 407.23, "Tiger", "Deer", 12);

        animal1.speak();
        animal1.eat();
        animal1.sleep();

        Bird bird1 = new Bird(24, "Female", 407.23, "Tiger", "Deer", 12));
//        bird1.fly();
        // now we can use eat and sleep methods from Animal class
        bird1.eat();
        bird1.sleep();

        Chicken chick1 = new Chicken(24, "Female", 407.23, "Tiger", "Deer", 12);
        chick1.fly();

//        Animal sparrow1 = new Sparrow(24, "Female", 407.23, "Tiger", "Deer", 12);
//        sparrow1.move();

        Sparrow sparrow1 = new Sparrow(24, "Female", 407.23, "Tiger", "Deer", 12);
        sparrow1.move();

        Fish fish1 = new Fish(24, "Female", 407.23, "Tiger", "Deer", 12);
        fish1.move();

        Animal sparrow2 = new Sparrow(24, "Female", 407.23, "Tiger", "Deer", 12);
        sparrow2.move();

        Animal fish2 = new Fish(24, "Female", 407.23, "Tiger", "Deer", 12);
        fish2.move();

        moveAnimals(fish2);
        moveAnimals(sparrow2);
    }

    public static void moveAnimals(Animal animal){
        animal.move();
    }
}

//public class Zoo {
//    public static void main(String[] args){
//
//    }
//}
