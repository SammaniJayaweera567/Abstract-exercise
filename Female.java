package abstraction.human;

public class Female extends Human {

    public Female(String name, int age) {
        super(name, age);
    }


    @Override
    public void Showering() {
        System.out.println("Remove the thing you are wearing");
        System.out.println("Open the shower");
        System.out.println("Get ready to shower");
        System.out.println("Take a bath");
    }

    @Override
    public void Studying() {
        System.out.println("Plan the daily time table");
        System.out.println("Sitting in study area ");
        System.out.println("Get the books you need the study");
        System.out.println("Start studying");
    }

    @Override
    public void Shopping() {
        System.out.println("Wear a nice dress");
        System.out.println("Leaving home");
        System.out.println("Choosing good cloth shops");
        System.out.println("Select the clothes you want");
    }

    @Override
    public void Exercise() {
        System.out.println("Pick a realistic time");
        System.out.println("Plan out your exercise routing");
        System.out.println("Put together a motivating playlist");
        System.out.println("Exercise often!");
    }
}