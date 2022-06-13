import java.util.*;

import static java.util.Collections.reverse;

public class Practical10 {

    static int n = 10;

    public static void main(String[] args) {
        System.out.println("Enter 10 digits : ");


        int[] arr = new int[10];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i <= 9; ++i) {
            System.out.println("Enter a number : ");

            arr[i] = scanner.nextInt();
        }

        reverse(arr);
        //System.out.println("njdsfnvjkdn");
        for (int i=0;i<=9;++i){
            System.out.println("Your numbers " + (i+1)+ " : " +arr[i]);
        }







    }

    public static void reverse(int numbers[])
    {
        int j=0,temp;
        while(j<=numbers.length/2)
        {
            temp=numbers[j];
            numbers[j]=numbers[numbers.length-1-j];
            numbers[numbers.length-1-j]=temp;
            j++;
        }
    }
}
