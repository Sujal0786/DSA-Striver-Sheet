class Solution {
    public int findKthPositive(int[] arr, int k) {
        // int left = 0, right = arr.length - 1;
        // while (left <= right) {
        //     int mid = left + (right - left) / 2;
        //     if (arr[mid] - mid - 1 < k) {
        //         left = mid + 1;
        //     } else {
        //         right = mid - 1;
        //     }
        // }
        // return left + k;
   int current = 1;
    int index = 0;

    while (k > 0) {
        if (index < arr.length && arr[index] == current) {
            index++;
        } else {
            k--;
        }

        if (k > 0)
            current++;
    }

    return current;
    }
}