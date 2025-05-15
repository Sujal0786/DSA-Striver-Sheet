class Solution {
    public int searchInsert(int[] arr, int target) {
        int start = 0;
        int last = arr.length -1;
        while(start<=last){
            int mid = start + (last -start) /2;
            if(arr[mid] == target){
                return mid;

            }else if(arr[mid] > target){
                last = mid-1;
            }else{
                start=mid+1;
            }
        }
        return start;
    
    }
}