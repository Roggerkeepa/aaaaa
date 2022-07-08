package Arraylist;

import java.util.ArrayList;

//Create a  class name Student with following attributes :
//name, address,age,gender and define it as private and create getter and setter of all the attributs.
//Now create a main class in which you have to create list of  student object and print all the values.
public class main {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("Kipa");
        s1.setAddress("Florida");
        s1.setAge(21);
        s1.setGender("Male");

        Student s2 = new Student();
        s2.setName("Lena");
        s2.setAddress("Ohio");
        s2.setAge(22);
        s2.setGender("Female");

        Student s3 = new Student();
        s3.setName("john");
        s3.setAddress("Cali");
        s3.setAge(19);
        s3.setGender("Crish");

        ArrayList<Student> students = new ArrayList<>();
        students.add(s1);
        students.add(s2);
        students.add(s3);

        for(int i = 0;i<students.size();i++) {
            System.out.println(students.get(i).getName()+" is "+students.get(i).getGender()+ " , age " +students.get(i).getAge()+" and living in "+students.get(i).getAddress());
        }

    }
}
