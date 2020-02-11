package com.epam.calculator;
import java.util.*;

public class App 
{
    public static void main( String[] args )
    {
       Scanner sc=new Scanner(System.in);
       double a,b,result;
       System.out.println("Enter the two numbers:");
       a=sc.nextDouble();
       b=sc.nextDouble();
       System.out.println("Enter the operation to be performed");
       System.out.println("Enter the options:");
       System.out.println("1- for addition");
       System.out.println("2- for subtraction");
       System.out.println("3- for multiplication");
       System.out.println("4- for division");
       System.out.println("5- for modulus");
       int  c;
       c=sc.nextInt();
       Calculator ob = new Calculator();
         result=ob.calculatorop(a,b,c);
       if(!((Double)result).isNaN()) {
        System.out.println("The result of operation is:"+result+";");
       }
       sc.close();
    }
}
