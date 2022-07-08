package controlstatement;

public class Arrays {
    public static void main(String[] args) {
        int [] numbers = {324,3242,67575,45433,555,3536,345};
        for(int i = 0; i <= numbers.length; i++){
            System.out.println("============================");
            System.out.println("This is array index number " + i);
            System.out.println("===========================");
            System.out.println(numbers[i]);
            if(numbers[i]%2==0){
                System.out.println("This are even numbers ");
            }
            else{
                System.out.println("This are odd numbers " );
            }
        }
    }
}