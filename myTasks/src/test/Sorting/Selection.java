package Sorting;

public class Selection {
    public static void main(String[] args) {
        int[] arr = {10, 2, 9, 5, 4, 9,};
        int index = 0;
        int min = 0;
        for (int i = 0; i < arr.length; i++) {
            index = i;
            min = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < min) {
                    index = j;
                    min = arr[j];
                }
            }
            if (arr[index] < arr[i]) {
                arr[index] = arr[i];
                arr[i] = min;
            }
        }

        for (int i : arr) {
            System.out.println(i);
        }


    }


}
