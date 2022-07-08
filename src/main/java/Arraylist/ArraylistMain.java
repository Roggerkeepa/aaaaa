package Arraylist;

import java.util.ArrayList;

//Using toString Method and Constructor


public class ArraylistMain {
    public static void main(String[] args) {
     ArraylistExamples s1 = new ArraylistExamples("Keepa","Male","Florida",21);
     ArraylistExamples s2 = new ArraylistExamples("Ari","Female","NYC",18);
     ArraylistExamples s3 = new ArraylistExamples("Hayes","Male","Seattle",25);
     ArraylistExamples s4 = new ArraylistExamples("Tatiyana","Female","Cali",19);

        ArrayList<ArraylistExamples> arrayList = new ArrayList<>();
        arrayList.add(s1);
        arrayList.add(s2);
        arrayList.add(s3);
        arrayList.add(s4);


        for(int i = 0; i < arrayList.size(); i ++){
            System.out.println("Get Only names");
            System.out.println(arrayList.get(i).getName());

            System.out.println("Get All Entities Using toString Method");
            System.out.println(arrayList.get(i));
            System.out.println("=======================");
        }


    }
}
