public abstract class Animal {
    String gender;
    String type;
    String favFood;
    int age;
    int sleepTime;
    double weight;



    public Animal(int age, String gender, double weight, String type, String favFood, int sleepTime){
        this.age = age;
        this.gender = gender;
        this.weight = weight;
        this.type = type;
        this.sleepTime = sleepTime;
        this.favFood = favFood;
    }

    public void speak(){
        System.out.print("I am " + type);
        System.out.println(" And I am " + gender);
        System.out.println("I am " + age + " years old now");
        System.out.println("My weight is " + weight + " lbs");
    }

    public void eat(){
        System.out.println("I am eating and my favorite Human Food is " + favFood);
    }

    public void sleep(){
        System.out.println("I am going to sleep and I usually sleep for about " + sleepTime);
    }

    public abstract void move();

}
