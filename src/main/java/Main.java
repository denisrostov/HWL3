public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.name = "Bobik";
        dog.age = 7;
        dog.species = "boxer";
        dog.pet = true;

        System.out.println(dog.getInfo());
    }
}

