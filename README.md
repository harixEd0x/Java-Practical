# Java-Practical

Go to src for practical

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



