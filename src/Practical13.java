package com.testing.firetvremote.practical;

import java.util.Scanner;

public class Practical13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Equation : ");
        String input = scanner.nextLine();
        String string = input.replaceAll(" "," ");
        //check length
        if (string.length() < 3){
            System.out.println(
                    "Minimum 2 Opearator and 1 Opearand Required");
        }
        int res= 0;
        int i = 0;

        while(string.charAt(i)!='+' && string.charAt(i)!='-' && string.charAt(i)!='*' && string.charAt(i)!='/')
        {
            i++;
        }


        switch (string.charAt(i)) {
            case '+' :
                res = Integer.parseInt(string.substring(0,i))+Integer.parseInt(string.substring(i+1,string.length()));
                break;
            case '-' :
                res = Integer.parseInt(string.substring(0,i))-Integer.parseInt(string.substring(i+1,string.length()));
                break;
            case '*' :
                res = Integer.parseInt(string.substring(0,i))*Integer.parseInt(string.substring(i+1,string.length()));
                break;
            case '/' :
                res = Integer.parseInt(string.substring(0,i))/Integer.parseInt(string.substring(i+1,string.length()));
                break;
        }
        System.out.println(string.substring(0,i) + ' ' + string.charAt(i) + ' ' + string.substring(i+1,string.length())
                + " = " + res);
    }
}
