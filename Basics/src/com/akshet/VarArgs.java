package com.akshet;

import java.util.Arrays;

public class VarArgs {

    //This is variable Arguments where we no need to define the length of the arrays it could be of int String or any other datatype
    public static void VarArgsMethodString(String ...v){
        System.out.println("Print the array: " + Arrays.toString(v));
    }
    public static void VarArgsMethodint(int ...v){
        System.out.println("Print the array: " + Arrays.toString(v));
    }

    //variable Arguments always comes at the end
    public static void VarArgs(int a, int b, String ...v){
        System.out.println("Print the array: " +"First argument: "+a +" Second argument: "+b+" Third argument: "+Arrays.toString(v));
    }

    public static void main(String[] args){
        //Here we can pass any number of Arguments
        VarArgsMethodString("1","Hi","my","name","is","Akshet");
        VarArgsMethodint(1,2,3,4,5,6,7,8,9);
        VarArgs(1,2,"5","6","7","8","99");
    }
}
