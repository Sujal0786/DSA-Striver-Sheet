class Solution {
    public void reverse(int[] arr, int n) {
            rev(arr , 0 , n-1);
    }
    static void rev(int[]arr , int start , int end){
        if(start>=end){
            return;
        }

        int temp = arr[start];
        arr[start]=arr[end];
        arr[end]=temp;

        rev(arr , start +1 , end -1);
    }
}

