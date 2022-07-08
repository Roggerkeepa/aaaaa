package Interface2;

public class Human extends Monkey implements BasicAnimal{


    @Override
    public void sleep() {
        System.out.println("sleeping");
    }

    @Override
    public void eat() {
        System.out.println("eating");

    }
}
