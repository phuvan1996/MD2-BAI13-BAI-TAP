package baitap1;

public class InsertionSort {
    void sort (int arr[]){
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int key = arr[i];
            int j = i-1;
            while (j>=0&&arr[i]>key){
                arr[j+1] = arr[j];
                j= j-1;
            }
            arr[j+1]=key;
        }
    }
    static void printArray(int arr[]){
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]+"");

            System.out.println();
        }
    }
    public static void main(String args[]){
        int arr[] = {7,6,2,4,8,9};
        System.out.println("mang ban dau");
        printArray(arr);
        InsertionSort is = new InsertionSort();
        is.sort(arr);
        System.out.println("mang sau khi sap xep");
        printArray(arr);
    }
}
