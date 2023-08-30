
// Name: Sarah Mohammed Althobiti , Student ID: 444004881.
import java.util.Scanner;

public class lap1 {

    public static int insertElement(int[] A, int count, int key) {

        if (count == A.length) {
            System.out.println("The array is full! ");
        } else {
            A[count] = key;
            count++;
        }
        print(A, count);
        return count;

    }

    public static int Search(int[] A, int count, int key) {

        for (int i = 0; i < count; i++) {
            if (A[i] == key) {
                return i;
            }
        }
        return -1;

    }

    public static int delete(int[] A, int count, int key) {
        if (count == 0) {
            System.out.println("The Array is empty");
        } else {
            int i = Search(A, count, key);
            if (i == -1) {
                System.out.println("The element not found");
            } else {
                for (int s = i; s < count - 1; s++) {
                    A[s] = A[s + 1];
                }
                count--;
               
            }
        }
        return count;
    }

    public static void sort(int[] A, int count) {
        int temp;
        for (int i = 0; i < count; i++) {
            for (int j = i + 1; j < count; j++) {
                if (A[i] > A[j]) {
                    temp = A[i];
                    A[i] = A[j];
                    A[j] = temp;
                }
            }
        }
        print(A, count);
    }

    public static int removeDuplicat(int[] A, int count) {
        for (int i = 0; i < count; i++) {
            for (int j = i + 1; j < count; j++) {
                if (A[i] == A[j]) {
                   count = delete(A, count, A[j]);

                }
            }
        }
        return count;
        
    }

    public static void print(int[] A, int count) {
        for (int i = 0; i < count; i++) {
            System.out.print(A[i] + " ");
        }
    }

    public static void main(String[] args) {

        int[] myArray = new int[20];
        myArray[0] = 1;
        myArray[1] = 3;
        myArray[2] = 2;
        myArray[3] = 5;
        myArray[4] = 5;
        int count = 5;
        boolean flag = true;

        while (flag) {

            Scanner scnr = new Scanner(System.in);

            System.out.println("\nPlease choose the number of the operation you want to perform it on an Array:\n");
            System.out.println("1. Insert an element in the array");
            System.out.println("2. Search for an element and return its index");
            System.out.println("3. Delete an element from the array");
            System.out.println("4. Sort the array");
            System.out.println("5. Remove duplicate elements from the array");
            System.out.println("6. Exit");

            int opNum = scnr.nextInt();
            if (opNum == 1) {
                System.out.println(" Enter the element");
                int key = scnr.nextInt();
               count = insertElement(myArray, count, key);

            } else if (opNum == 2) {
                System.out.println(" Enter the element");
                int key = scnr.nextInt();
                int i = Search(myArray, count, key);
                if (i == -1) {
                    System.out.println("Not found");
                } else {
                    System.out.println("the index of the element = " + i);
                }

            } else if (opNum == 3) {
                System.out.println(" Enter the element");
                int key = scnr.nextInt();
              count =  delete(myArray, count, key);
              print(myArray, count);
            } else if (opNum == 4) {
                sort(myArray, count);
            } else if (opNum == 5) {
               count = removeDuplicat(myArray, count);
               print(myArray, count);
            } else if (opNum == 6) {
                flag = false;
            }

        }
        System.out.println("Thank you");

    }

}