package app;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {
        int arrLength = ThreadLocalRandom.current().nextInt(15, 26);
        int[] arr = new int[arrLength];
        for (int i = 0; i < arrLength; i++) {
            arr[i] = ThreadLocalRandom.current().nextInt(0, 151);
        }

        System.out.println("Исходный масив: "+Arrays.toString(arr));
        System.out.println("Длинна масива: "+arrLength);

        ArrayUtils.mergeSort(arr, 0, arr.length-1);

        System.out.println("Отсортированый масив: "+Arrays.toString(arr));

        int target = arr[ThreadLocalRandom.current().nextInt(arr.length)];
        System.out.println("Выбраное число: "+target);

        int index = ArrayUtils.binarySearch(arr, target);

        if(index>=0){
            System.out.println("Єлемент найден на позиции: "+(index+1));
        }
        else{
            System.out.println("Елемент не найден");
        }


        System.out.println("Реализация неверно выбраного элемента для поиска");

        int target2 = -2;
        System.out.println("Выбраное число: "+target2);

        int index2 = ArrayUtils.binarySearch(arr, target2);

        if(index2>=0){
            System.out.println("Єлемент найден на позиции: "+(index2+1));
        }
        else{
            System.out.println("Елемент не найден");
        }

    }
}
