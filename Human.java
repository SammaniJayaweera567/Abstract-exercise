package abstraction.human;

public abstract class Human {

    private String name;
    private int age;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract void Showering();

    public abstract void Studying();

    public abstract void Shopping();

    public abstract void Exercise();
}


