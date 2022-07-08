package Constructor;

public class Student {
    String name;
    int rollNum;



    public static void main(String[] args) {
        Student student = new Student();
        student.name = "John";
        student.rollNum = 2;

        System.out.println(student.name +" "+ student.rollNum);

    }
}
