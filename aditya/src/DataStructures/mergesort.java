package DataStructures;

public class mergesort {
    static void mergesort1(int[] arr, int l, int r) {   // sroting the arrays
        if (l >= r) return; // base case
        int mid = (l + r) / 2;
        mergesort1(arr, l, mid);  // calling mergesort on first half
        mergesort1(arr, mid + 1, r); // 2nd half
        merge(arr, l, mid, r); // merging above two sorted array into overall sorted array
    }

    static void merge(int[] arr, int l, int mid, int r) {   // merging  sorted array into overall sorted array
        int n1 = mid - l + 1;    // length of left sorted array
        int n2 = r - mid;      // length of right sorted array
        int[] left = new int[n1];   // left array
        int[] right = new int[n2];  // right array
        int i, j, k;
        for (i = 0; i < n1; i++) {    // filling left array
            left[i] = arr[l + i];
        }
        for (j = 0; j < n2; j++) {       // filling right array
            right[j] = arr[mid + 1 + j];
        }
        i = 0;
        j = 0;
        k = l;
        while (i < n1 && j < n2) {    //comparing elemnts of left array to right array and filling in overall array
            if (left[i] < right[j]) {
                arr[k++] = left[i++];
//                i++;
//                k++;
            }
            else arr[k++] = right[j++];
//            j++;
//            k++;

        }
        while (i < n1) {     // if left is left-behind
            arr[k++] = left[i++]; // fill the array with left elements(j elements are finished)
//            k++;
//            i++;
        }
        while (j<n2){   // if right is left-behind
            arr[k++]=right[j++]; // fill the array with right elements(i elements are finished)
//            k++;
//            j++;
        }

    }

    public static void main(String[] args) {
        int[] arr = {4, 1, 3, 5, 2};
        mergesort1(arr, 0, arr.length - 1);
        for (int val : arr) {
            System.out.print(val+" ");

        }
    }
}
