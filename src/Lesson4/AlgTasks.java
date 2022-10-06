package Lesson4;

public class AlgTasks {
    public static void main(String[] args) {
        int[] arr = new int[]{25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
        int[] arr2 = changeElement(arr, 2, 5);
        showEvensAndUnevens(arr2);

        System.out.println("Макс значение = " + maxValue(arr));
        System.out.println("Мин значение = " + minValue(arr));
    }

    public static int[] changeElement(int[] arr, int index, int element) {
        arr[index] = element;
        return arr;
    }

    public static int maxValue(int[] arr) {
        int val = arr[0];
        for (int i=1;i<arr.length;i++) {
            if (arr[i]>val) {
                val = arr[i];
            }
        }
        return val;
    }

    public static int minValue(int[] arr) {
        int val = arr[0];
        for (int i=1;i<arr.length;i++) {
            if (arr[i]<val) {
                val = arr[i];
            }
        }
        return val;
    }

    public static void showEvensAndUnevens(int[] arr) {
        int evens = 0;
        int unevens = 0;
        for (int i=0;i<arr.length;i++) {
            if (arr[i] % 2 == 0) {
                evens +=1;
            }
            else {
                unevens +=1;
            }
        }
        System.out.println("Количество четных чисел: " + evens);
        System.out.println("Количество нечетных чисел: " + unevens);
    }
}
