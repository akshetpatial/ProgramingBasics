package com.akshet;

import java.util.Arrays;
import java.util.Scanner;

public class Matrix {

    public static void AddMatrix(int[][] matrix1,int[][] matrix2)
    {
        System.out.println("First Matrix");
        for(int[] element: matrix1){
            System.out.println(Arrays.toString(element));
        }
        System.out.println("Second Matrix");
        for(int[] element: matrix2){
            System.out.println(Arrays.toString(element));
        }
        int[][] Add = new int[3][3];
        for(int row =0; row<3;row++){
            for(int col=0;col<3;col++){
                Add[row][col]=matrix1[row][col]+matrix2[row][col];
            }
        }
        System.out.println("Adding Matrix First + Matrix Second");
        for(int[] element: Add){
            System.out.println(Arrays.toString(element));
        }
        System.out.println("\nCongratulations you have added the two matrices! ");
    }

    public static void SubMatrix(int[][] matrix1,int[][] matrix2)
    {
        System.out.println("First Matrix");
        for(int[] element: matrix1){
            System.out.println(Arrays.toString(element));
        }
        System.out.println("Second Matrix");
        for(int[] element: matrix2){
            System.out.println(Arrays.toString(element));
        }
        int[][] Sub = new int[3][3];
        for(int row =0; row<3;row++){
            for(int col=0;col<3;col++){
                Sub[row][col]=matrix1[row][col]-matrix2[row][col];
            }
        }
        System.out.println("Subtracting Matrix First - Matrix Second");
        for(int[] element: Sub){
            System.out.println(Arrays.toString(element));
        }
        System.out.println("\nCongratulations you have subtracted the two matrices! ");
    }

    public static void MulMatrix(int[][] matrix1,int[][] matrix2)
    {
        System.out.println("First Matrix");
        for(int[] element: matrix1){
            System.out.println(Arrays.toString(element));
        }
        System.out.println("Second Matrix");
        for(int[] element: matrix2){
            System.out.println(Arrays.toString(element));
        }
        int[][] mul = new int[3][3];
        for(int row =0; row<3;row++){
           for(int col=0;col<3;col++){
               mul[row][col]=0;
               for(int point=0;point<3;point++) {
                    mul[row][col] = mul[row][col]+(matrix1[row][point] * matrix2[point][col]);
                }
            }
        }
        System.out.println("Multiplying Matrix First with Matrix Second");
        for(int[] element: mul){
            System.out.println(Arrays.toString(element));
        }
        System.out.println("\nCongratulations you have multiplied the two matrices! ");
    }

    public static void DetMatrix(int[][] matrix1,int[][] matrix2)
    {
        System.out.println("First Matrix");
        for(int[] element: matrix1){
            System.out.println(Arrays.toString(element));
        }
        System.out.println("Second Matrix");
        for(int[] element: matrix2){
            System.out.println(Arrays.toString(element));
        }
        int det1;
        int det2;

              det1 = findDeterminant(matrix1);
              det2 = findDeterminant(matrix2);


        System.out.println("Determinant of First Matrix");
            System.out.println(det1);
        System.out.println("Determinant of Second Matrix");
            System.out.println(det2);
        System.out.println("Congratulations you have found the determinant of the two matrices! ");

    }

    public static int findDeterminant(int[][] matrix){
        return (matrix[0][0] *((matrix[1][1]* matrix[2][2])-(matrix[2][1]*matrix[1][2]))) - (matrix[0][1] *((matrix[1][0]* matrix[2][2])-(matrix[2][0]*matrix[1][2]))) + (matrix[0][2] *((matrix[1][0]* matrix[2][1])-(matrix[2][0]*matrix[1][1])));
    }

    public static void TransMatrix(int[][] matrix1,int[][] matrix2)
    {
        System.out.println("First Matrix");
        for(int[] element: matrix1){
            System.out.println(Arrays.toString(element));
        }
        System.out.println("Second Matrix");
        for(int[] element: matrix2){
            System.out.println(Arrays.toString(element));
        }
        int[][] trans1 = new int[3][3];
        int[][] trans2 = new int[3][3];
        for(int row =0; row<3;row++){
            for(int col=0;col<3;col++){
                trans1[row][col]=matrix1[col][row];
                trans2[row][col]=matrix2[col][row];
            }
        }
        System.out.println("Transpose Matrix of First Matrix");
        for(int[] element: trans1){
            System.out.println(Arrays.toString(element));
        }
        System.out.println("Transpose Matrix of Second Matrix");
        for(int[] element: trans2){
            System.out.println(Arrays.toString(element));
        }
        System.out.println("\nCongratulations you have found the transpose of the two matrices! ");
    }

    public static void UpperTriMatrix(int[][] matrix1,int[][] matrix2)
    {
        System.out.println("First Matrix");
        for(int[] element: matrix1){
            System.out.println(Arrays.toString(element));
        }
        System.out.println("Second Matrix");
        for(int[] element: matrix2){
            System.out.println(Arrays.toString(element));
        }
        int[][] upper1 = new int[3][3];
        int[][] upper2 = new int[3][3];
        for(int row =0; row<3;row++){
            for(int col=row;col<3;col++){
                upper1[row][col]=matrix1[row][col];
                upper2[row][col]=matrix2[row][col];
            }
        }
        System.out.println("Upper triangular Matrix of First Matrix");
        for(int[] element: upper1){
            System.out.println(Arrays.toString(element));
        }
        System.out.println("Upper triangular Matrix of Second Matrix");
        for(int[] element: upper2){
            System.out.println(Arrays.toString(element));
        }
        System.out.println("\nCongratulations you have found the Upper triangular matrix of the two matrices! ");
    }

    public static void LowerTriMatrix(int[][] matrix1,int[][] matrix2)
    {
        System.out.println("First Matrix");
        for(int[] element: matrix1){
            System.out.println(Arrays.toString(element));
        }
        System.out.println("Second Matrix");
        for(int[] element: matrix2){
            System.out.println(Arrays.toString(element));
        }
        int[][] lower1 = new int[3][3];
        int[][] lower2 = new int[3][3];
        for(int row =0; row<3;row++){
            for(int col=0;col<=row;col++){
                lower1[row][col]=matrix1[row][col];
                lower2[row][col]=matrix2[row][col];
            }
        }
        System.out.println("Lower triangular Matrix of First Matrix");
        for(int[] element: lower1){
            System.out.println(Arrays.toString(element));
        }
        System.out.println("Lower triangular Matrix of Second Matrix");
        for(int[] element: lower2){
            System.out.println(Arrays.toString(element));
        }
        System.out.println("\nCongratulations you have found the lower triangular matrix of the two matrices! ");
    }

    public static void main(String[] args){
        System.out.println("Welcome to the Matrix world! ");
        System.out.println("Enter the First Matrix elements: ");

        Scanner scan= new Scanner(System.in);

        int[][] matrix1= new int[3][3];
        for(int row =0;row<3;row++)  // 1 2 3 4 5 6 7 8 9
        {
            for(int col =0;col<3;col++){
                matrix1[row][col]=scan.nextInt();
            }
        }
        System.out.println("Entered First Matrix is: ");
        for(int[] element : matrix1){ //For each loop
            System.out.println(Arrays.toString(element));
        }

        System.out.println("Enter the Second Matrix elements: ");

        int[][] matrix2= new int[3][3];
        for(int row =0;row<3;row++) // 1 0 0 0 1 0 0 0 1 // 9 8 7 6 5 4 3 2 1
        {
            for(int col =0;col<3;col++){
                matrix2[row][col]=scan.nextInt();
            }
        }
        System.out.println("Entered Second Matrix is: ");
        for(int[] element : matrix2){
            System.out.println(Arrays.toString(element));
        }

        System.out.println("Press 1 to add the two matrices: ");
        System.out.println("Press 2 to subtract the two matrices: ");
        System.out.println("Press 3 to multiply the two matrices: ");
        System.out.println("Press 4 to find the determinant of the two matrices: ");
        System.out.println("Press 5 to transpose the two matrices: ");
        System.out.println("Press 6 for upper triangular matrix of the two matrices: ");
        System.out.println("Press 7 for lower triangular matrix of the two matrices: ");
        System.out.println("Press 0 to Exit ");
        while(true) {
            System.out.println("\nPlease enter your choice! ");
            try {
                int choice = scan.nextInt();
                switch (choice) {
                    case 1:
                        AddMatrix(matrix1, matrix2);
                        break;
                    case 2:
                        SubMatrix(matrix1, matrix2);
                        break;
                    case 3:
                        MulMatrix(matrix1, matrix2);
                        break;
                    case 4:
                        DetMatrix(matrix1, matrix2);
                        break;
                    case 5:
                        TransMatrix(matrix1, matrix2);
                        break;
                    case 6:
                        UpperTriMatrix(matrix1, matrix2);
                        break;
                    case 7:
                        LowerTriMatrix(matrix1, matrix2);
                        break;
                    case 0:
                        System.out.println("thanks for playing! ");
                        System.exit(0);
                    default:
                        System.out.println("Please enter from above choices only i.e. 0, 1, 2, 3, 4, 5, 6, 7");
                }
            } catch (Exception e) {
                System.out.println("Please enter number only, Entered input is not a number!:");
                System.exit(-1);
            }
        }
    }

}
