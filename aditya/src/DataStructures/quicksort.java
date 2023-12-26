package DataStructures;

public class quicksort {
    static int partition(int[] arr, int st, int end) {
        int pivot = arr[st];    // chossing pivot element which is strt element
        int cnt = 0;
        for (int i = st + 1; i <= end; i++) {   // count elements less than pivot
            if (arr[i] <= pivot)
                cnt++;
        }
        int pivotidx = st + cnt;    // cnt is nmber of smaller elements (finding the pivot element)
        swap(arr, st, pivotidx);    // swap the pivot element(strt) to its correct position(pivotindex) how correrct position found . pivot element is strt it must come at its correct index(pivotidx) by strt+cnt(cnt is no. of smaller elements than pivot element)
        int i = st;
        int j = end;
        while (i < pivotidx && j > pivotidx) {   // i is less than pivot index and j is greater than pivotidx
            while (arr[i] <= pivot)
                i++;
            while (arr[j] > pivot)
                j--;

            if (i < pivotidx && j > pivotidx) {
                swap(arr, i, j);
                i++;
                j--;
            }
        }
        return pivotidx;

    }

    static void swap(int[] arr, int x, int y) {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

    static void quicksort1(int[] arr, int st, int end) {
        if (st >= end) return;   // base case
        int pi = partition(arr, st, end);
        quicksort1(arr, st, pi - 1);      //sort from start to pivot-1 element
        quicksort1(arr, pi + 1, end);       //sort from pivot+1 element to end element

    }

    public static void main(String[] args) {
        int[] arr = {5, 13, 8,2, 7, 10, 2, 4};
        quicksort1(arr, 0, arr.length - 1);
        for (int val : arr) {
            System.out.print(" ");
            System.out.print(val);

        }
    }
}
