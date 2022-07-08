package OOP.Basic;

public class Cat {

    String name, type, color;
    int age;

    protected void eat(){
        System.out.println("Cat is eating food");
    }
    void speed(){
        System.out.println("Cat is running fast");
    }

    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.name = "Tom";
        cat.type = "Japanese";
        cat.color = "white";
        cat.age = 2;

        cat.eat();
        cat.speed();


        System.out.println(cat.name + "is "+ cat.color +"and"+ cat.type +"and" + cat.age);
    }
}
