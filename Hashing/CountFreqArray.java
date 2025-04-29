import java.util.*;
public class CountFreqArray {

    public static void main(String[] args){
        int arr [] = {10, 20, 20, 30, 30, 30};
        int n = arr.length;
        count(arr, n);
    }
    static void count(int[] arr, int n){
        Map<Integer , Integer> map = new HashMap<>();
        for(int i = 0 ; i< n ; i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i] , map.get(arr[i]) + 1);
            }else{
                map.put(arr[i],1);
            }
        }
        for(Map.Entry<Integer, Integer> entry :map.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}