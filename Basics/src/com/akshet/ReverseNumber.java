package com.akshet;

import java.util.Scanner;

public class ReverseNumber {
    public static void ReversedNumber(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number you want to reverse");
        int num=scan.nextInt(); // 123456789
        System.out.println("Entered number is: "+ num);

        int temp=num;
        int rNumber=0;
        int count=0;
        int rem;
        while(temp>0){
            rem=temp%10;
            rNumber=(int) (rNumber*10) + rem;
            temp=temp/10;
            count++;
        }
        System.out.println("The Reverse of the number "+num+" is: "+rNumber);
    }


    public static void main(String[] args){
        ReversedNumber();
    }
}
