package com.testing.firetvremote.practical;

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