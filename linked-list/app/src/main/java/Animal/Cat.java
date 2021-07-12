package Animal;

public class Cat implements AnimalEat {

    private String name;
    private String type;
    private String color ;

    public Cat(String name, String type, String color) {
        this.name = name;
        this.type = type;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    @Override
    public String eat() {
        return "I eat everything";
    }
}
