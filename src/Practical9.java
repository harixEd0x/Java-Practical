import java.util.Scanner;

public class Practical9 {


    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your first number : ");
        int num1 = scanner.nextInt();
        System.out.println("Enter your second number : ");
        int num2 = scanner.nextInt();
        System.out.println("gcd of " + num1 + " and " + num2 +" is : " + gcdfunction(num1,num2));




    }

    public static int gcdfunction(int number1,int number2){

        while (number1 != number2){


            if (number1 > number2){

                number1 = number1 - number2;

            }
            else {
                number2 = number2 - number1;
            }
        }


        return number1;
    }

}
