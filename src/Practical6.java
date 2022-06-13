import java.util.Scanner;

public class Practical6 {
    public static void main(String[] args) {

        // Write a program that prompts the user to enter a letter and check whether a letter is a vowel or constant.
        System.out.println("Enter a character :");
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        if(ch == 'a'|| ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
            System.out.println("It's a vowel");
        }   else if(ch == 'A'|| ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){
            System.out.println("It's a vowel");
        }
        else {
            System.out.println("It's Constant");
        }

    }
}
