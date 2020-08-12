import java.util.Scanner;

public class SelectionSorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[5];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        selectionSort(a);
        display(a);
    }

    private static void selectionSort(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            int indexMin = i;
            for(int j=i+1;j<a.length;j++){
                if(a[j] < a[indexMin]) indexMin = j;
            }
            if(indexMin != i) {
                a[i] = a[indexMin] + a[i];
                a[indexMin] = a[i] - a[indexMin];
                a[i] = a[i] - a[indexMin];
            }
        }
    }

    public static void display(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
