public class Dog {
    String name;
    int age;
    String species;
    boolean pet;

    String getName() {
        return name;
    }

    public String getInfo() {
        return "Собаку зовут " + name + " ей " + age + " лет, порода " + species;
    }
}


