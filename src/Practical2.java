import java.util.Scanner;

public class Practical2 {


    static double a, b, c, d, e, f, x, y;

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Values from Equestion:- 1 :");
        System.out.print("Enter value of a : ");
        double a = input.nextDouble();
        System.out.print("Enter value of b : ");
        double b = input.nextDouble();
        System.out.print("Enter value of e : ");
        double e = input.nextDouble();

        System.out.println("Values from Equestion:- 2 :");
        System.out.print("Enter value of c : ");
        double c = input.nextDouble();
        System.out.print("Enter value of d : ");
        double d = input.nextDouble();
        System.out.print("Enter value of f : ");
        double f = input.nextDouble();


        x = ((e * d) - (b * f)) / ((a * d) - (b * c));
        y = ((a * f) - (e * c)) / ((a * d) - (b * c));

        System.out.print(" X = "+ x + " Y = " + y);
    }


}
