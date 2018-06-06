package Lab5;

import java.util.Arrays;

public class main {

    public static void main(String[] args) {


        int[] numbers = {10, 14, 33, 33, 4, 1,1, 55, 31, 13, 25, 99};
        System.out.println("--> "+Arrays.toString(numbers));




    }

    private static void bubbleSortDesc(int[] numbers) {
        int changes = 1;
        while (changes > 0) {
            changes = 0;
            for (int i = 0; i < numbers.length-1; i++) {
                if (numbers[i] < numbers[i + 1]) {
                    changes++;
                    int temp = numbers[i];
                    numbers[i] = numbers[i + 1];
                    numbers[i + 1] = temp;
                }
            }
        }
    }

    private static void selectionSortDesc(int[] numbers) {
        int indexToPut = 0;
        while (indexToPut<numbers.length-1) {

            int greatest = 0;
            int indexToSwapWith = 0;
            for (int i = indexToPut; i < numbers.length; i++) {
                if (numbers[i] > greatest) {
                    greatest = numbers[i];
                    indexToSwapWith = i;
                }
            }
            int temp = numbers[indexToPut];
            numbers[indexToPut] = greatest;
            numbers[indexToSwapWith] = temp;
            System.out.println(Arrays.toString(numbers));
            indexToPut++;
        }

    }



}


//        Laboratorium 5
//        1. Napisać program, który jako wejście pobierze listę 10 cyfr i zapisze je do tablicy. Następnie
//        dokona sortowania malejącego tej tablicy algorytmami:
//        a. Bubble sort
//        b. Selection sort
//        c. Insertion sort
//        Przy sortowaniu danym algorytmem wyżej oceniane będą implementacje ukazujące
//        poszczególne kroki w/w algorytmów.
//        2. Napisać program, który jako wejście pobierze jedno liniowe zdanie napisane przez
//        użytkownika na klawiaturze. Następnie posortuje literki tego zdania w kolejności
//        alfabetycznej. Spacje i inne białe znaki mają być pominięte. Do sortowania należy
//        wykorzystać jeden z poniższych algorytmów.
//        a. Quick Sort
//        b. Merge Sort