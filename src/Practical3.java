import java.util.Scanner;


public class Practical3 {
    static double meter;
    static double feet;
    //Write a program that reads a number in meters, converts it to feet, and displays the result.

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number : ");
        meter = input.nextDouble();

    }

    private static void func(double meter) {
        feet = meter * 3.28084;
        System.out.print(meter + " Meters = " + feet + " Feets");
    }


}
