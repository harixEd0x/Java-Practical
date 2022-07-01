import java.util.Scanner;

public class Practical16 {
    private static Fraction fraction;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a decimal number");
        String decimal = input.nextLine();
        int indexOfDecimal = decimal.indexOf(".");
        int len = decimal.substring(indexOfDecimal).length();
        int imag_part=(int) Math.pow(10,len-1);
        int real_part=(int)(Double.parseDouble(decimal)*imag_part);
        fraction = new Fraction(real_part,imag_part);
        System.out.println("The Fraction number is "+ fraction);
    }
}
