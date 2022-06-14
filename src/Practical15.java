package com.testing.firetvremote.practical;

import java.util.Scanner;

public class Practical15 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Binary Value : ");
        int binary = scanner.nextInt();
        System.out.println("Decimal Value = " + getDecimalNumber(binary));
    }


    public static int getDecimalNumber(int binary){
        int decimal = 0;
        int n = 0;
        while(true){
            if(binary == 0){
                break;
            } else {
                int temp = binary%10;
                decimal += temp*Math.pow(2, n);
                binary = binary/10;
                n++;
            }
        }
        return decimal;
    }
}
