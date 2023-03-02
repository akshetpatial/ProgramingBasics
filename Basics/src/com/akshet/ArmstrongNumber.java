package com.akshet;

import java.util.Scanner;

public class ArmstrongNumber {

    public static int Armstrong_3digit(int num){
        int temp=num;
        int rem;
        int sum=0;
        while(temp>0){
            rem=temp%10;
            sum= sum+ (int)Math.pow(rem,3);
            temp=temp/10;
        }
        return sum;
    }

    public static int Armstrong_ndigit(int num){
        int temp=num;
        int temp1=num;
        int rem;
        int sum=0;
        int count=0;
        while(temp>0){
            temp=temp/10;
            count++;
        }
        while(temp1>0){
            rem=temp1%10;
            sum= sum+ (int)Math.pow(rem,count);
            temp1=temp1/10;
        }
        return sum;
    }
    public static boolean isArmstrong_3(int num){
        int ArmNum = Armstrong_3digit(num);
        if (ArmNum == num){
            System.out.println(num);
            return true;
        }
        else {
            return false;
        }
    }

    public static boolean isArmstrong_n(int num){
        int ArmNum = Armstrong_ndigit(num);
        if (ArmNum == num){
            System.out.println(num);
            return true;
        }
        else {
            return false;
        }
    }

    public static void ArmStrongNumber_999(){

        System.out.print(0+","+1+","+2+","+3+","+4+","+5+","+6+","+7+","+8+","+9);
        for(int i=10;i<=99;i++){
            int sum=0;
            int rem;
            int temp = i;
            while(temp>0){
                rem= temp%10;
                sum=sum+(int)Math.pow(rem,2);
                temp=temp/10;
            }
            if(sum==i)
                System.out.print(","+i);
        }
        for(int i=100;i<=999;i++){
            int sum=0;
            int rem;
            int temp = i;
            while(temp>0){
                rem= temp%10;
                sum=sum+(int)Math.pow(rem,3);
                temp=temp/10;
            }
            if(sum==i)
                System.out.print(","+i);
        }

    }

    public static void main(String[] args){

        Scanner scan= new Scanner(System.in);
        System.out.println("Enter a 3 digit number: ");
        int num=scan.nextInt();
        Integer n = num;
        boolean check = true;
        while(check) {
            if (n.toString().length() == 3) {
                check=false;
                if (isArmstrong_3(num)) {
                    System.out.println(num + " is an Armstrong Number!");
                } else
                    System.out.println(num + " is not an Armstrong Number!");
            } else {
                System.out.println("The number entered is not 3 digit Please enter a 3 digit number: ");
                num = scan.nextInt();
                n=num;
            }
        }

        System.out.println("Enter a any digit number: ");
        int num1=scan.nextInt();
        if(isArmstrong_n(num1)){
            System.out.println(num1+" is an Armstrong Number!");
        }
        else
            System.out.println(num1+" is not an Armstrong Number!");

        System.out.println("Now find the Armstrong Number up to 999: ");
        ArmStrongNumber_999();
    }
}
