package insertion_sort;

import java.util.Random;

public class Insertion_sort {

    public static void main(String[] args) {
        Random rand = new Random();
        int[] numbers = new int[10];// cho mang input la 10 so


        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(100); // random tu 0-100
        }

        System.out.println("Before:");
        printArray(numbers);

        insertionSort(numbers);

        System.out.println("\nAfter:");
        printArray(numbers);
    }

    private static void insertionSort(int[] inputArray) {
        for (int i = 1; i < inputArray.length; i++) {

            int currentValue = inputArray[i];// boc cai value cua int ra A[i]

            int j = i - 1;//move value cua int ve 0

            while (j >= 0 && inputArray[j] > currentValue) { 
                inputArray[j + 1] = inputArray[j];
                j--;
            }// move int den khi value =< value so sanh
             // insert value into correct spot
                
            inputArray[j + 1] = currentValue;
        }
    }

    private static void printArray(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}
/* minh hoa : https://visualgo.net/en/sorting */
/* credit by :  https://youtu.be/0lOnnd50cGI*/