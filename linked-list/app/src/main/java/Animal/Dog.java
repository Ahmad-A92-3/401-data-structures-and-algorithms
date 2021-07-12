package Animal;

public class Dog implements AnimalEat{
    private String name;
    private String type;
    private int age;
    private int height;

    public Dog(String name, String type, int age, int height) {
        this.name = name;
        this.type = type;
        this.age = age;
        this.height = height;
    }
    @Override
    public String getName() {
        return name;
    }

    @Override
    public String eat() {
        return "I eat meat";
    }


}
