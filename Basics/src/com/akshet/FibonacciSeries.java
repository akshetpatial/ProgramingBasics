package com.akshet;

import java.util.Scanner;

public class FibonacciSeries {

    static void FibonacciNumbers() {
        System.out.println();
        System.out.println("Enter the term at which you want to find the fibonacci number");
        Scanner scan = new Scanner(System.in);
        int num1 = 0;
        int num2 = 1;
        int fnumber = scan.nextInt();
        int num = 0;
        int sum=0;
        System.out.println("The fibonacci number at " + fnumber + " is: ");
        if (fnumber <= num1) {
            System.out.println(num1);
        } else if (fnumber == num2) {
            System.out.println(num2);
        } else {
            while (num <= fnumber - 2) {
                sum = num1 + num2;
                num1 = num2;
                num2 = sum;
                num++;
            }
            System.out.print(sum);
        }
    }
    static void AllFibonacciNumbers(){

        System.out.println("Enter the term up to which you want to find the fibonacci series");
        Scanner scan= new Scanner(System.in);
        int num1=0;
        int num2=1;
        int fnumber= scan.nextInt();
        int num=0;
        int sum;
        System.out.println("The fibonacci series up to "+fnumber+" is: ");
        if(fnumber<=num1)
        {
            System.out.println(num1);
        }
        else if(fnumber==num2){
            System.out.println(num+", "+num2);
        }
        else {
            System.out.print(0+", "+1);
            while (num <= fnumber-2) {
            sum=num1+num2;
            System.out.print(", "+sum);
            num1=num2;
            num2=sum;
            num++;
            }
        }
    }

    public static void main(String[] args){

        AllFibonacciNumbers();
        FibonacciNumbers();
    }
}
