package controlstatement;

import java.util.Scanner;

    public class SwitchCase {
        public static void main(String args[]) {
            int a;

            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter first number :");
            a = scanner.nextInt();
            switch (a) {
                case 1:
                    System.out.println("Sunday");
                    break;                          //break;means stop the swichcase as it meet its requirement.
                //No break then it find it satisfy it condition and also print/check the following cases.

                case 2:
                    System.out.println("Monday");
                    break;

                case 3:
                    System.out.println("Tuesday");
                    break;
                case 4:
                    System.out.println("Wednesday");
                    break;
                case 5:
                    System.out.println("Thursday");
                    break;
                case 6:
                    System.out.println("Friday");
                    break;
                case 7:
                    System.out.println("Saturday");
                    break;
            }
        }
    }
