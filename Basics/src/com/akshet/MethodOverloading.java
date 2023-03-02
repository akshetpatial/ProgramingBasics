package com.akshet;


public class MethodOverloading {

    //We can achieve method overloading by two ways
    //First if number of arguments are same but of different return types for example int and String as shown in Example 1 and 2.
    //Second if number of arguments are different for example String a and String a, String b as shown in Example 1 and 3.

    //Method overloading happens at compile time.

    //Example 1
    public static void fun(String a){
        System.out.println("Datatype of "+a+" is: "+a.getClass().getSimpleName());
    }

    //Example 2
    //Here the function name is same but the return type of arguments are different
    public static void fun(Integer a) { //Here I am using Integer instead of int
        //Integer is wrapper class or in simple terms it coverts the int(primitive type ) into objects. Just like any other class.
        //int is of 4 bytes or 32 bit but Integer is of 16 bytes or 128 bits
        System.out.println("Datatype of "+a+" is: "+a.getClass().getSimpleName());
    }

    //Example 3
    //Here the function name is same but the number of arguments are different
    public static void fun(String a, String b){
        System.out.println("Datatype of "+a+" is: "+a.getClass().getSimpleName());
        System.out.println("Datatype of "+b+" is: "+b.getClass().getSimpleName());
    }


    public static void main(String[] args) {

        fun(1); //this will call the function of Example 2

        fun("Akshet Patial"); //this will call the function of Example 1

        fun("Akshet Patial","002"); //this will call the function of Example 3
    }
}
