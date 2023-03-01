package com.akshet;

import java.util.Scanner;

public class PrimeNumbers {

   public void PrimeNumber(){

       System.out.println("Enter the number: ");
       Scanner scan = new Scanner(System.in);
       int prime= scan.nextInt();
       System.out.println("The number entered is: " + prime);

       int num=2;
       int flag=0;
       if(prime<=1)
       {
           flag=1;
           System.out.println(prime+" is not a prime number!");
       }
       else{
           //while(num<prime){                      //this takes a bit long to run as time complexity is n
           while(num<=(Math.sqrt(prime))){          //We can reduce the time complexity to square root n
               if(prime%num==0){
                   flag=1;
                   System.out.println(prime+" is not a prime number");
                   break;
               }
               num=num+1;
           }
       }
       if(flag==0)
       {
           System.out.println(prime +" is a prime number");
       }
    }

    public static void AllPrimeNumbers(){

        System.out.println("Enter the number up to which you want to get the prime numbers: ");
        Scanner scan = new Scanner(System.in);
        int prime = scan.nextInt();
        System.out.println("The number entered is: " + prime);
        System.out.println("Prime numbers from 0 to "+prime+" is:");
        int count=0;
        for(int i=2;i<prime;i++) {
            int flag=0;
            for(int j=2;j<i;j++) {
                if (i % j == 0) {
                    flag = 1;
                    break;
                }
            }
            if(flag==0){
                count++;
                System.out.println(i);
            }
        }
        System.out.println("There are "+count+" primes numbers between 0 and "+prime);
    }

    public static void main(String[] args) {

       //Firstly create a class Instance and call the non-static method using that instance. e.g,
        PrimeNumbers pn = new PrimeNumbers(); //class instance
        pn.PrimeNumber();//calling the method of that class this is a non static call
        
        //Static call
        AllPrimeNumbers();//Calling a static method in the Main Class
    }
}
