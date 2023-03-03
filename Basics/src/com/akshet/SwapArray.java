package com.akshet;


import java.util.Arrays;
import java.util.Scanner;

public class SwapArray {

    public static int[] swap(int[] array){
        int start=0;
        int end=array.length-1;
        int temp;
       while(start<end){
            temp= array[start];
            array[start]=array[end];
            array[end]=temp;
            start++;
            end--;
        }
    return array;
    }

    public static void main(String[] args){
        System.out.println("Enter the size of an array: ");
        Scanner scan = new Scanner(System.in);
        int size= scan.nextInt();
       int[] array= new int[size];
        System.out.println("Enter the array you want to swap: ");

//  [1,2,3,4,5]
        for(int i=0;i<array.length;i++){
            array[i]=scan.nextInt();
        }
        System.out.println("Entered array is: ");
        int count=0;
        System.out.print("[");
        for(int element : array){
            if(count==array.length-1){
                System.out.print(element);
                break;
            }
            count++;
            System.out.print(element+", ");
        } System.out.print("]");
        System.out.println("\nSwapped array is: ");
        System.out.println(Arrays.toString(swap(array)));
    }
}
