<h1 align="center">
  <br>
  Java Practical
</h1>
<h4 align="center">Be sure to :star: my configuration repo so you can keep up to date on any daily progress!</h4>
<div align="center"><img src="https://gitee.com/duhouan/ImagePro/raw/master/logo.png" width="250px"/></div>

## JAVA Practical 1
Write a Program that displays Welcome to Java, Learning Java Now and Programming is fun.

```java
public class Practical1 {
    public static void main(String[] args) {
        System.out.println("Welcome to java");
        System.out.println("Learning java now");
        System.out.println("Programming  is fun");

    }
}
```

#### Output
```text

Welcome to java
Learning java now
Programming  is fun

```

## JAVA Practical 2
Write a program that solves the following equation and displays the value x and y:
1) 3.4x+50.2y=44.5
2) 2.1x+.55y=5.9
(Assume Cramer’s rule to solve equation ax+by=e x=ed-bf/ad-bc cx+dy=f y=af-ec/ad-bc )

```java
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
```

#### Output
```text

Values from Equestion:- 1 :
Enter value of a : 3.2
Enter value of b : 50.2
Enter value of e : 44.5
Values from Equestion:- 2 :
Enter value of c : 2.1
Enter value of d : .55
Enter value of f : 5.9
 X = 2.6211171136407483 Y = 0.7193710206444143

```
## JAVA Practical 3
Write a program that reads a number in meters, converts it to feet, and displays the result.

```java
import java.util.Scanner;
public class Practical3 {
    static double meter;
    static double feet;

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number : ");
        meter = input.nextDouble();
        func(meter)

    }

    private static void func(double meter) {
        feet = meter * 3.28084;
        System.out.print(meter + " Meters = " + feet + " Feets");
    }
}
```

#### Output
```text

Enter the number : 
10
10.0 Meters = 32.8084 Feets

```
## JAVA Practical 4
Body Mass Index (BMI) is a measure of health on weight. It can be calculated by taking your weight in kilograms and dividing by the square of your height in meters. Write a program that prompts the user to enter a weight in pounds and height in inches and displays the BMI.
Note:- 1 pound=.45359237 Kg and 1 inch=.0254 meters.

```java
import java.util.Scanner;
public class Practical4 {
    static double pound, inch;
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your weight in Pound :");
        pound = input.nextDouble();
        System.out.print("Enter Your Height in Inch :");
        inch = input.nextDouble();
        converter(pound, inch);

    }
    private static void converter(double pound, double inch) {
        double BMI = (pound * 0.45359237) / ((inch * 0.0254) * (inch * 0.0254));
        System.out.print("BMI = " + BMI);
    }
}
```

#### Output
```text

Enter Your weight in Pound : 150
Enter Your Height in Inch :5.8
BMI = 3134.9713717560617

```

## JAVA Practical 5
Write a program that prompts the user to enter three integers and display the integers in decreasing order.

```java
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
```

#### Output
```text

Enter the first number: 
10
Enter the second number: 
20
Enter the third number: 
30
30 20 10

```

## JAVA Practical 6
Write a program that prompts the user to enter a letter and check whether a letter is a vowel or constant.
```java
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
```

#### Output
```text

Enter a character :
a
It's a vowel


```

## JAVA Practical 7
Assume a vehicle plate number consists of three uppercase letters followed by four digits. Write a program to generate a plate number.
```java
public class Practical7 {
    public static void main(String[] args) {
        //letter
        int letter1 = 65 + (int) (Math.random() * (90 - 65));
        int letter2 = 65 + (int) (Math.random() * (90 - 65));
        int letter3 = 65 + (int) (Math.random() * (90 - 65));
        //number
        int numb1 = (int) (Math.random() * 10);
        int numb2 = (int) (Math.random() * 10);
        int numb3 = (int) (Math.random() * 10);
        int numb4 = (int) (Math.random() * 10);
        System.out.println("" + (char) letter1 + (char) letter2 + (char) letter3 + "-" + numb1 + numb2 + numb3 + numb4);
    }
}
```

#### Output
```text

CLS-2591

```

## JAVA Practical 8
Write a program that reads an integer and displays all its smallest factors in increasing order. For example if input number is 120, the output should be as follows:2,2,2,3,5.
```java
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
```

#### Output
```text

Enter any number : 12
2 
2 
3 

```

## JAVA Practical 9
Write a method with following method header. public static int gcd(int num1, int num2)
Write a program that prompts the user to enter two integers and compute the gcd of two integers.
```java
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
```

#### Output
```text

Enter your first number : 
150
Enter your second number : 
250
gcd of 150 and 250 is : 50

```

## JAVA Practical 10
Write a test program that prompts the user to enter ten numbers, invoke a method to reverse the numbers, display the numbers.
```java
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
```

#### Output
```text

Enter 10 digits : 
Enter a number : 
1
Enter a number : 
2
Enter a number : 
3
Enter a number : 
4
Enter a number : 
5
Enter a number : 
6
Enter a number : 
7
Enter a number : 
8
Enter a number : 
9
Enter a number : 
10
Your numbers 1 : 10
Your numbers 2 : 9
Your numbers 3 : 8
Your numbers 4 : 7
Your numbers 5 : 5
Your numbers 6 : 6
Your numbers 7 : 4
Your numbers 8 : 3
Your numbers 9 : 2
Your numbers 10 : 1

```

## JAVA Practical 11
Write a program that generate 6*6 two-dimensional matrix, filled with 0’s and 1’s , display the matrix, check every raw and column have an odd number’s of 1’s.
```java
import java.util.Scanner;

public class Practical11 {


    public static void main(String[] args) {

        int[][] my_matrix;
        int i, j, count;
        my_matrix = Fuctions.create_fill_matrix();
        Fuctions.displayMatrix(my_matrix);
        System.out.println("\n Row's having odd number of 1");
        for (i = 0; i < 6; ++i) {
            count = 0;
            for (j = 0; j < 6; j++) {
                if (my_matrix[i][j] == 1) {
                    count++;
                }

            }
            if (count % 2 != 0) {
                System.out.println("Row -" + (i + 1) + " have odd number of 1's");
            }
        }
        System.out.println("\n Colums having odd number of 1");
        for (i = 0; i < 6; ++i) {
            count =0;
            for (j=0;j<6;++j){
                if (my_matrix[j][i]==1){
                    count++;
                }
            }
            if (count % 2 != 0){
                System.out.println("Colum -" + (i + 1) +" have odd number of 1's");
            }
        }
    }


    public static class Fuctions {
        public static int[][] create_fill_matrix() {
            int[][] matrix = new int[6][6];
            for (int i = 0; i < 6; i++) {
                for (int j = 0; j < 6; j++) {
                    matrix[i][j] = (int) ((Math.random() * 5) % 2);
                }
            }
            return matrix;
        }

        public static void displayMatrix(int[][] matrix) {
            System.out.print("\nMatrix Values \n");
            for (int i = 0; i < 6; i++) {
                for (int j = 0; j < 6; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}
```

#### Output
```text

Matrix Values 
1 0 0 0 1 0 
1 1 0 1 1 0 
1 0 0 0 1 0 
0 0 0 0 0 1 
0 0 1 1 0 0 
0 0 1 1 1 1 

 Row's having odd number of 1
Row -4 have odd number of 1's

 Colums having odd number of 1
Colum -1 have odd number of 1's
Colum -2 have odd number of 1's
Colum -4 have odd number of 1's

```

## JAVA Practical 12
Write a program that creates a Random object with seed 1000 and displays the first 100 random integers between 1 and 49 using the NextInt (49) method.
```java
import java.util.Random;

public class Practical12 {
    public static void main(String[] args) {
        Random random = new Random(1000);
        for (int i = 0; i < 100; ++i) {
            System.out.format("%5d", random.nextInt(49));
            if ((i + 1) % 20 == 0) {
                System.out.println();
            }
        }
    }
}
```

#### Output
```text

   40    1   17    0   46   46    4   33    9   40   25   13   17   29   30   31   42   35   48   40
   11   13   10    0   38    9    0   10   35   10   14   26   34   35   31   43   47   35    2   33
   16   48   45   43    5   29    1   35    0   25   28   42   25    2   33   30   18   27    4   28
   31   35    9   13   33   12   18   36   39    7   17   31   21   26   47   39   11   40   11   26
   48   26   27   32   19   30   26    4    7   40    9   41    8   37    3   34   10   36    4   21

```

## JAVA Practical 13
Write a program for calculator to accept an expression as a string in which the operands and operator are separated by zero or more spaces.
For ex: 3+4 and 3 + 4 are acceptable expressions.
```java
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
```

#### Output
```text

Enter Equation : 
5+5
5 + 5 = 10

```

## JAVA Practical 14
Write a program that creates an Array List and adds a Loan object , a Date object , a string, and a Circle object to the list, and use a loop to display all elements in the list by invoking the object’s to String() method.
```java
import java.util.ArrayList;
import java.util.Date;

public class Practical14 {
    public static void main(String[] args) {
        ArrayList<Object> arrayList = new ArrayList<>();
        arrayList.add(new String("Java Practical"));
        arrayList.add(new Loan(25000));
        arrayList.add(new Date());
        arrayList.add(new Circle(3.45));

        for (int i = 0; i < arrayList.size(); i++)
        {
            System.out.println((arrayList.get(i)).toString());
        }
    }
}
class  Loan{
    double amount;
    Loan(double amt)
    {
        this.amount=amt;
    }
    public String toString()
    {
        return "Loan with Amount "+this.amount;
    }
}

class Circle{
    double radius;
    Circle(double r)
    {
        this.radius=r;
    }
    public String toString()
    {
        return "Circle with Radius "+this.radius;
    }
}
```

#### Output
```text

Java Practical
Loan with Amount 25000.0
Wed Jun 15 18:06:48 IST 2022
Circle with Radius 3.45

```

## JAVA Practical 14
Write the bin2Dec (string binary String) method to convert a binary string into a decimal number. Implement the bin2Dec method to throw a NumberFormatException if the string is not a binary string.
```java
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
```

#### Output
```text

Enter Binary Value : 1010
Decimal Value = 10

```




















