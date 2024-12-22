package java.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class sort {
    public static int Max = 0;
    public static int Min = 0;
    public static boolean isInt = true;

    private static int[] append(int[] arr, int element) {
        List<Integer> list = new ArrayList<>(Arrays.asList(arr));
        list.add(element);

        return list.toArray(new int[0]);
    }

    public static void main(String[] args) {
        int arr[];
        int b = 0;
        System.out.println("Enter the minimum value");
        Scanner sc2 = new Scanner(System.in); // new scanner for minimum value UI
        while (isInt) {
            try {
                Min = sc2.nextInt();
                isInt = false;
            } catch (InputMismatchException exception) {
                System.out.println("Please enter a valid integer");
            } finally {
                sc2.nextLine();
            }
        }
        isInt = true;
        ;

        System.out.println("Enter the maximum value:");
        Scanner sc = new Scanner(System.in); // new scanner for maximum value UI
        while (isInt) {
            try {
                Max = sc.nextInt();
                isInt = false;
            } catch (InputMismatchException exception) {
                System.out.println("Please enter a valid integer");
            } finally {
                sc.nextLine();
            }

            Random rand = new Random();
            int rand_val = 0;
            for (int i = 0; i < 20; i++) {
                rand_val = rand.nextInt();
                rand_val = Math.abs(rand_val % (Max - Min + 1) + Min); // Generating a random value within user set
                                                                       // param
                b += rand_val; // storing each instance of rand_val into b at the end of each loop
                arr = append(arr, b);
            }

            int n = arr.length;
            bubbleSort(arr, n);
            System.out.println("Sorted array: ");
            printArray(arr, n);
        }

    }

    class GFG {

        void bubbleSort(int arr[], int n) {
            int i, j, temp;
            boolean swapped;
            for (i = 0; i < n - 1; i++) {
                swapped = false;
                for (j = 0; j < n - i - 1; j++) {
                    if (arr[j] > arr[j + 1]) {
                        // swap arr[j] and arr[j+1]
                        temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                        swapped = true;
                    }
                }

                if (swapped == false)
                    break;
            }
        }

        void printArray(int arr[], int size) {
            int i;
            for (i = 0; i < size; i++)
                System.out.print(arr[i] + " ");
            System.out.println();
        }

    }

}
