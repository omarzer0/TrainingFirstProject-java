package com.company;

import java.util.Scanner;

public class TrainingFirstProject {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        operation();
    }


    static void Max_Two_Number() {
        int arr[] = readArray();
        int maxNum1 = 0;
        int maxNum2 = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxNum1) {
                maxNum1 = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxNum2 && maxNum1 != arr[i]) {
                maxNum2 = arr[i];
            }
        }
        System.out.println("Max two numbers = " + "{" + maxNum1 + "," + maxNum2 + "}");
    }

    static void Bubble_Sort() {
        int arr[] = readArray();
        int arrLength = arr.length;
        for (int i = 0; i < arrLength - 1; i++) {
            for (int j = 0; j < (arrLength - i - 1); j++) {

                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        printArray(arr);
    }

    static void Capital_Or_Small() {
        int num = readChar();
        if (num > 64 && num < 91) {
            System.out.println("This is a capital character");
        } else if (num > 96 && num < 123) {
            System.out.println("This is a small character");
        } else {
            System.out.println("not a alphabetical character");
        }
    }

    static void Number_Of_Repetitions() {
        int arr[] = readArray();
        int num = readNumber();
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num)
                counter++;
        }
        System.out.println(counter);
    }

    static void Number_of_Prime() {
        int arr[] = readArray();
        boolean isPrime = false;
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            if (!(arr[i] == 0 || arr[i] == 1)) {
                for (int j = 2; j <= arr[i] / 2; j++) {
                    if (arr[i] % j == 0) {
                        isPrime = true;
                        break;
                    }
                    isPrime = false;
                }
                if (!isPrime) {
                    counter++;
                }
            }
        }
        System.out.println("number of primes is: " + counter);
    }

    static void operation() {
        sc = new Scanner(System.in);
        System.out.println("Please choose an operation: " + "\n" +
                "Select 1 to execute Max Two Numbers" + "\n" +
                "Select 2 to execute Number of Primes" + "\n" +
                "Select 3 to execute Bubble Sort" + "\n" +
                "Select 4 to execute Capital or Small" + "\n" +
                "Select 5 to execute Number of Repetitions");

        int num = sc.nextInt();
        switch (num) {
            case 1:
                Max_Two_Number();
                break;
            case 2:
                Number_of_Prime();
                break;
            case 3:
                Bubble_Sort();
                break;
            case 4:
                Capital_Or_Small();
                break;
            case 5:
                Number_Of_Repetitions();
                break;
            default:
                System.out.println("wrong choice");
        }
        System.out.print("wanna do another operation? type 1 for (Yes) or 2 for (No): ");
        int retry = sc.nextInt();
        if (retry == 1) {
            operation();
        } else {
            System.out.println("Bye Bye");
            done();
        }
    }

    // helper methods
    private static int[] readArray() {
        sc = new Scanner(System.in);
        System.out.print("enter the length of the array: ");
        int len = sc.nextInt();
        int arr[] = new int[len];
        System.out.println("enter the array of integers ");
        for (int i = 0; i < len; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    private static void printArray(int arr[]) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("]");
    }

    private static char readChar() {
        System.out.print("Enter a character: ");
        char c = sc.next().charAt(0);
        return c;
    }

    private static int readNumber() {
        System.out.print("Enter the number you wanna search for: ");
        int num = sc.nextInt();
        return num;
    }

    private static void done() {

        System.out.println(
                "******************************************************");
        System.out.println(
                "******************************************************");
        System.out.println(
                "******************************************************");
        System.out.println(
                "******" + "            **        **************      " + "******");
        System.out.println(
                "******" + "           ** **      **************      " + "******");
        System.out.println(
                "******" + "          **   **                ***      " + "******");
        System.out.println(
                "******" + "         **     **             ***        " + "******");
        System.out.println(
                "******" + "        ** ***** **          ***          " + "******");
        System.out.println(
                "******" + "        ** ***** **        ***            " + "******");
        System.out.println(
                "******" + "        **       **     ***               " + "******");
        System.out.println(
                "******" + "        **       **   **************      " + "******");
        System.out.println(
                "******" + "        **       **   **************      " + "******");
        System.out.println(
                "******************************************************");
        System.out.println(
                "******************************************************");
        System.out.println(
                "******************************************************");

    }
}
