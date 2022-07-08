package Constructor;

public class Average {
    //average number of three numbers
    public static double AverageNumber(double a, double b, double c){
        return (a+b+c)/3;

    }
    public static void main(String[] args) {

        double a = 3242, b =88, c =99;

        System.out.println("This is the average number of three numbers"+ " "+ AverageNumber(a,b,c));

    }

}
