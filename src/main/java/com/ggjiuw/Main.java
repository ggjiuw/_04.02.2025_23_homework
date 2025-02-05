package com.ggjiuw;

public class Main {
    public static void main(String[] args) {

        System.out.println("=== MATRIX 7x7 ===");
        int[][] randomMatrix1 = matrix(7);
        print(randomMatrix1);
        System.out.println("7: " + countNums(randomMatrix1, 7));
        System.out.println("11: " + countNums(randomMatrix1, 11));
        System.out.println("18: " + countNums(randomMatrix1, 18));

        nullDiagonal(randomMatrix1);
        System.out.println("\n=== AFTER nullDiagonal(randomMatrix1) ===");
        print(randomMatrix1);
        System.out.println("7: " + countNums(randomMatrix1, 7));
        System.out.println("11: " + countNums(randomMatrix1, 11));
        System.out.println("18: " + countNums(randomMatrix1, 18));

        multiply(randomMatrix1);
        System.out.println("\n=== AFTER multiply(randomMatrix1) ===");
        print(randomMatrix1);
        System.out.println("7: " + countNums(randomMatrix1, 7));
        System.out.println("11: " + countNums(randomMatrix1, 11));
        System.out.println("18: " + countNums(randomMatrix1, 18));
    }

    public static int[][] matrix(int size) {
        int[][] matrix = new int[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                long num = Math.round(Math.random() * 9) + 10;
                matrix[i][j] = (int) num;
            }
        }

        return matrix;
    }

    public static int countNums(int[][] matrix, int number) {
        int counter = 0;

        for (int[] array : matrix) {
            for (int num : array) {
                if (num == number) {
                    counter++;
                }
            }
        }

        return counter;
    }

    public static void nullDiagonal(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            matrix[i][i] = 0;
        }
    }

    public static void multiply(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i+1; j < matrix.length; j++) {
                matrix[i][j] *= 10;
            }
        }
    }

    private static void print(int[][] m) {
        for (int[] n : m) {
            for (int i : n) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
