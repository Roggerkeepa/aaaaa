package SelfPratice;

public class ObjectClass {
    String name, gender;
    int age;

    public void EvenOdd() {
        int[] number = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        try {
            for (int i = 0; i <= number.length; i++) {
                if (number[i] % 2 == 0) {
                    System.out.println(number[i] + " EVEN NUMBERS");
                } else {
                    System.out.println(number[i] + " ODD NUMBERS");
                }
                System.out.println("This is evenODD examples");

            }
        } catch (Exception e) {
            System.out.println("Exception haldles");
        }
        System.out.println("===================================");
    }

    public void ArraysExamples() {
        int[] arrays = {50, 73, 22, 99, 100, 200, 300, 400, 500};
        try {
            for (int i = 0; i <= arrays.length; i++) {
                if (arrays[i] <= 200) {
                    System.out.println(arrays[i] + " less than equalto 200");
                } else if (arrays[i] <= 300) {
                    System.out.println(arrays[i] + " less than equalto 300");
                } else {
                    System.out.println(arrays[i] + " morethan 301 and less than eqalto 500");
                }
            }
            System.out.println("This is ArraysExamples");


        } catch (Exception e) {
            System.out.println("Exception handled");
        }
        System.out.println("===========================================");
    }

    void message(){
        System.out.println("checkinggggg");
    }




    public static void main(String[] args)  {
        ObjectClass objectClass = new ObjectClass();

        objectClass.name = "James";
        objectClass.gender = "male";
        objectClass.age = 28;

        System.out.println(objectClass.name +" " + objectClass.gender +" "+ objectClass.age);
        System.out.println("==================");

        objectClass.message();
        System.out.println("======================");
        objectClass.ArraysExamples();
        objectClass.EvenOdd();


    }
}
