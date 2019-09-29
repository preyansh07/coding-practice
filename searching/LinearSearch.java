package searching;

import java.util.Scanner;

public class LinearSearch {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter size of array");
        int len = scanner.nextInt();
        System.out.println("Please enter a list of numbers:");
        
        int[] arr = new int[len];
        for (int i=0; i<len; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println("Please enter number to search");
        int num = scanner.nextInt();
        scanner.close();
        boolean found = false;
        int i;
        for ( i=0; i< len; i++) {
            if (arr[i] == num) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println(num + " is present at index " + i);
        } else {
            System.out.println("NOT FOUND");
        }

    }
}