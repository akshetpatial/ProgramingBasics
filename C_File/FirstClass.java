//access the class from any where 
public class FirstClass{ //here the name of class is same as the file name then only the code will run
//Main function is the entry point of java, whenever the java code runs the first function to call is Main
  //here static is here because this is the entry point so we want to run this main function without creating 
  //the object of FirstClass 

  //String[] args is the command line argument it sotes that in array of String
    public static void main(String[] args){
        System.out.println("hello world! ");
        System.out.println(args[0]);
        System.out.println(args[1]);
    }
}