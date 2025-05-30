import java.util.*;
public class MergeSort {
public static void main(String[] args){
     int[] arr = {38, 27, 43, 3, 9, 82, 10};
     int[] sorted = mergeSort(arr);
    System.out.println("Sorted array: " + Arrays.toString(sorted));
    }
    public static int[] mergeSort(int[] arr) {
        if (arr.length < 2) {
            return arr;
        }
        int mid = arr.length / 2;
        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));
        return merge(left, right);
    }
    public static int[] merge(int[] left , int[] right){
        int[]mix = new int[left.length + right.length];
        int i=0 ,j=0 , k=0;
        while(i<left.length && j<right.length){
            if(left[i]< right[j]){
                mix[k]=left[i];
                i++;
            }else{
                mix[k]=right[j];
                j++;
            }
            k++;
        }
        while(i<left.length){
            mix[k]=left[i];
            i++;
            k++;
        }
        while(j<right.length){
            mix[k]=right[j];
            j++;
            k++;
        }
        return mix;
    }
}    

