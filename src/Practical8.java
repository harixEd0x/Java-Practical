import java.util.Scanner;

public class Practical8 {



static  int fix = 2;
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number : ");
        int num = scanner.nextInt();
        while (num > 1){
            if (num%fix==0){
                System.out.println(fix+" ");
                num=num/fix;
            }
            else
            {
                fix++;
            }
        }



    }
}
