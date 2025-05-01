import java.util.*;
class Solution {
    public int missingNumber(int[] arr) {
         int n= arr.length;
        Arrays.sort(arr);
        for(int i = 0 ; i<n ;i++){
            if(arr[i]!=i){
                return i;
            }
        }
        return arr[n-1] +1 ;   
    }
}