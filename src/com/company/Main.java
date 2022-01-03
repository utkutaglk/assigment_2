package com.company;

public class Main {

    public static void main(String[] args) {

        //Declaring two matrix
        int[][] matrix1 = new int[4][4];
        int[][] matrix2 = new int[4][4];


        //to assign random integer number for matrix1
        for(int i = 0; i <= 3; i++){
            for(int j = 0; j <= 3; j++){
                matrix1[i][j] = (int)(Math.random() * 30 + 1);

            }
        }

        System.out.println("First Matrix: ");

        //to print all elements in matrix1
        for(int i = 0; i <= 3; i++){

            System.out.print("[");
            for(int j = 0; j <= 3; j++){

                System.out.printf("%5d ", matrix1[i][j]);

            }
            System.out.print("]");
            System.out.println();
        }


        //Declaring another matrix
        int[][] transposedMatrix = new int[4][4];

        //to assign the values that transpose of matrix1
        for(int i = 0; i < matrix1.length; i++) {
            for(int j = 0; j < matrix1.length ; j++) {
                transposedMatrix[i][j] = matrix1[j][i];
            }
        }

        System.out.println("**************************** \n"
                +  "Transpose of first Matrix : ");

        //to print all elements in transposedmatrix
        for(int i = 0; i <= 3; i++){

            System.out.print("[");
            for(int j = 0; j <= 3; j++){

                System.out.printf("%5d ", transposedMatrix[i][j]);

            }
            System.out.print("]");
            System.out.println();
        }


        //to assign random integer number for matrix2
        for(int i = 0; i <= 3; i++){
            for(int j = 0; j <= 3; j++){
                matrix2[i][j] = (int)(Math.random() * 30 + 1);

            }
        }

        System.out.println("Second Matrix: ");

        //to print all elements in matrix2
        for(int i = 0; i <= 3; i++){

            System.out.print("[");
            for(int j = 0; j <= 3; j++){

                System.out.printf("%5d ", matrix2[i][j]);

            }
            System.out.print("]");
            System.out.println();
        }

        //Declaring another matrix
        int[][] transposedMatrix2 = new int[4][4];


        //to assign the values that transpose of matrix1
        for(int i = 0; i < matrix2.length; i++) {
            for(int j = 0; j < matrix2.length ; j++) {
                transposedMatrix2[i][j] = matrix2[j][i];
            }
        }

        System.out.println("**************************** \n"
                        +  "Transpose of second Matrix : ");

        //to print all elements in transposedmatrix
        for(int i = 0; i <= 3; i++){

            System.out.print("[");
            for(int j = 0; j <= 3; j++){

                System.out.printf("%5d ", transposedMatrix2[i][j]);

            }
            System.out.print("]");
            System.out.println();
        }

        //
        int[][] sumOfMatrix = new int[4][4];

        for(int i = 0; i <= 3; i++){
            for(int j = 0; j <= 3; j++){
                sumOfMatrix[i][j] = matrix1[i][j] + matrix2[i][j];

            }
        }

        System.out.println("**************************** \n"
                +  "Summation : ");

        for(int i = 0; i <= 3; i++){

            System.out.print("[");
            for(int j = 0; j <= 3; j++){

                System.out.printf("%5d ", sumOfMatrix[i][j]);

            }
            System.out.print("]");
            System.out.println();
        }

        int[][] subOfMatrix = new int[4][4];

        for(int i = 0; i <= 3; i++){
            for(int j = 0; j <= 3; j++){
                subOfMatrix[i][j] = matrix1[i][j] - matrix2[i][j];

            }
        }


        System.out.println("**************************** \n"
                +  "Subtraction : ");

        for(int i = 0; i <= 3; i++){

            System.out.print("[");
            for(int j = 0; j <= 3; j++){

                System.out.printf("%5d ", subOfMatrix[i][j]);

            }
            System.out.print("]");
            System.out.println();
        }

        int[][] multipOfMatrix = new int[4][4];

        for(int i = 0; i <= 3; i++){
            for(int j = 0; j <= 3; j++){
                multipOfMatrix[i][j] = matrix1[i][j] * matrix2[i][j];

            }
        }


        System.out.println("**************************** \n"
                +  "Multiplication : ");

        for(int i = 0; i <= 3; i++){

            System.out.print("[");
            for(int j = 0; j <= 3; j++){

                System.out.printf("%5d ", multipOfMatrix[i][j]);

            }
            System.out.print("]");
            System.out.println();
        }








    }
}
