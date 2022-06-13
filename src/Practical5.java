import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Practical5 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int numb1 = input.nextInt();
        System.out.println("Enter the second number: ");
        int numb2 = input.nextInt();
        System.out.println("Enter the third number: ");
        int numb3 = input.nextInt();


        Integer[] myarray = new Integer[3];
        myarray[0]  = numb1;
        myarray[1]  = numb2;
        myarray[2]  = numb3;
        Arrays.sort(myarray, Collections.reverseOrder());
        System.out.println(myarray[0] + " " + myarray[1] + " " + myarray[2]);
    }

}
