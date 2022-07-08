package controlstatement;

import java.util.Scanner;

class Ifelse {
    public static void main(String[] args) {
        int a , b , c, d;


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter value of a :");
        a = scanner.nextInt();

        Scanner scanners = new Scanner(System.in);
        System.out.println("Enter value of b :");
        b = scanner.nextInt();

        System.out.println("===============================================");

        c=a+b;
        System.out.println("a+b ="+c);
        System.out.println("===============================================");

        if(c>=100){
            System.out.println(c+" is greater equalto 100 ");
        }
        else{
            System.out.println(c+" is less than 100");
        }
        System.out.println("===============================================");


        d=a-b;
        System.out.println("a-b ="+d);
        System.out.println("===============================================");

        if(d>=100){
            System.out.println(d+" is greater equalto 100 ");
        }
        else{
            System.out.println(d+" is less than 100");
        }
        System.out.println("===============================================");




    }
}
