public class ArrayIsSorted {
    public static boolean isSortedLearned(int[] arr,int idx){
        if (idx == arr.length-1){
            return true;
        }
        /*
        if (arr[idx]<arr[idx+1]){
            return isSortedLearned(arr, idx+1);
        }else {
            return false;
        }
         */
        if (arr[idx]>=arr[idx+1]){
            return false;
        }
        return isSortedLearned(arr, idx+1);
    }


    static boolean flag;
    public static void isSorted(int[] arr,int idx){
        if (idx==arr.length-1){
            System.out.println(flag);
            return;
        }
        if (arr[idx]<arr[idx+1]){
            flag = true;
        }
        else{
            flag = false;
        }
        isSorted(arr,idx+1);
    }

    public static void main(String[] args) {
        int arr[] ={1,2,3,4};
        isSorted(arr,0);
        System.out.println(isSortedLearned(arr,0));
    }
}

//  time complexity = O(n)