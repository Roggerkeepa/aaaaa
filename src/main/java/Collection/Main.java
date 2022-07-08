package Collection;

//Create a list of all the students present in this class and perform following actions :
//1) Add all the students on the list
//2) Print the name of all students
//3) Remove the student which is added at last
//4) Remove the student with name Ram if present

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("Hari");
        arrayList.add("Ram");
        arrayList.add("Shyam");
        System.out.println(arrayList);

        arrayList.remove(0);
        System.out.println(arrayList);

        arrayList.remove("Ram");
        System.out.println(arrayList);

    }

}

