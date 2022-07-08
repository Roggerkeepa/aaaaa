package Arraylist;
//Create a  class name Student with following attributes :
//name, address,age,gender and define it as private and create getter and setter of all the attributs.
//Now create a main class in which you have to create list of  student object and print all the values.
public class Student {
    private String name,address,gender;
    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
