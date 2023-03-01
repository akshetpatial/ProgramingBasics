package com.akshet;

import java.util.Scanner;

public class CountingOccurrence {

    public static void CountOccurrenceFromNumber(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number having multiple occurrences of elements");
        int num=scan.nextInt(); // 4554713456
        System.out.println("Entered number is: "+ num);
        System.out.println("Enter the element you want to find the occurrences of: ");
        int num1=scan.nextInt();
        int temp=num;
        if(num1<0){
            System.out.println("Please enter a positive number!");
            System.exit(-1);
        }
        int rem;
        int count=0;
        while(temp>0){
            rem=temp%10;
            if(rem==num1){
                count++;
            }
            temp=temp/10;
        }
        System.out.println(num1  +" has occurred "+count+" time/times in the given number "+num);
    }

    public static void CountOccurrence() {
        Scanner scan = new Scanner(System.in);
        // 1 3 8 5 7 5 7 8 7 9
        // 7 8 7 7 5 7 8 7 9 3
        System.out.println("Enter the int array having multiple occurrences of elements");
        int[] myArr = new int[10];
        for(int i=0;i<myArr.length;i++){
            myArr[i]= scan.nextInt();
        }
        System.out.println("Given array is: ");
        for(int i=0;i<myArr.length;i++){
            System.out.print(myArr[i]+" ");
        }

        int maxOccurrence=0;
        int secondmaxOccurrence=0;
        int tempMax=0;
        int tempMax1=0;
        for(int i=0;i<myArr.length;i++){
            int count=0;
            for(int j=0;j<=i;j++){
                if(myArr[j]==myArr[i]){
                    //System.out.println(myArr[i]);
                    count++;
                    if(maxOccurrence<count) {
                        maxOccurrence = count;
                        tempMax = j;
                    }
                    //Leaving the Second Most frequent occurrence for now will come later
                    if(secondmaxOccurrence<count && secondmaxOccurrence!=maxOccurrence && maxOccurrence!=count){
                        secondmaxOccurrence=count;
                        tempMax1=j;
                    }
                }
                //System.out.println("the total number of occurrences of the element "+myArr[i]+" are "+maxOccurrence);
            }
        }
        System.out.println("\nthe Maximum number of occurrences are "+maxOccurrence+ " and the element with maximum occurrence is "+myArr[tempMax]);
        System.out.println("\nthe Second Maximum number of occurrences are "+secondmaxOccurrence+ " and the element with Second maximum occurrence is "+myArr[tempMax1]);
    }

    public static void main(String[] args) {
        System.out.println("Enter 1 if you want to find the Occurrences of the the elements from the int array ");
        System.out.println("Enter 2 if you want to find the Occurrences of the the elements from the number ");
        System.out.println("Enter 0 to exit!");
        Scanner scan = new Scanner(System.in);
        int CaseCheck=scan.nextInt();
        switch(CaseCheck) {
            case 1:
                CountOccurrence();
                break;
            case 2:
                CountOccurrenceFromNumber();
                break;
            default:
                System.exit(-1);
        }
    }
}
