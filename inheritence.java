class Animal{
    private String name;
    private int weight;
    private String brain;
    public Animal(String name, int weight, String brain){
        System.out.println("parent class constructor");
        this.name = name;
        this.weight = weight;
        this.brain = brain;
    }
    public Animal(){
        this("animal", 50, "yes");
    }

    public void eat(){
        System.out.println("Animal.eat() called.");
    }
    public void move(int speed) {
        System.out.println("Animal move at speed of "+speed+"kmph");
        
    } 
}

class Dog extends Animal{
    private int leg;
    private int eyes;
    private String nameDog;
    public Dog(String name, int weight, String brain, int leg, int eyes, String nameDog ){
        
        super(name, weight, brain);
        this.eyes = eyes;
        this.leg = leg;
        this.nameDog = name;
        System.out.println("child class cunstructor");
    }
    public Dog(){
        this("animal", 50, "yes", 4, 2, "defaultDog");
    }
    @Override
    public void eat(){
        System.out.println("dog loves chicken.");
    }
}

public class inheritence {
    public static void main(String[] args) {
        Animal animal1 = new Animal();
        animal1.eat();
        Dog dog = new Dog("animal", 40, "yes", 4, 2, "rock");
        dog.eat();
    }
    
}
