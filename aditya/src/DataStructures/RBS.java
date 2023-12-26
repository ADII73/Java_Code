package DataStructures;

public class RBS {
    static int findmin(int []a,int target){
        int st=0, end=a.length-1;
        while (st<=end) {
            int mid = (st + end) / 2;
            if (a[mid] == target) return mid;
            else if (a[st]==a[mid] && a[mid]==a[end]) {
                st++;
                end--;
                
            } else if (a[mid] <= a[a.length - 1]) {
                if (target > a[mid] && target <= a[end]) {
                    st = mid + 1;
                } else {
                    end = mid - 1;
                }
            } else {
                if (target >= a[st] && target < a[mid]) {
                    end = mid - 1;

                } else {
                    st = mid + 1;
                }
            }

        }
            return -1;
        }

    public static void main(String[] args) {
        int[] a={0,0,1,1,1,2,2};
        int target=3;
        System.out.println(findmin(a,target));
    }
}
