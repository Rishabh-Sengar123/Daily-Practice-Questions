// Last updated: 10/5/2025, 4:09:04 PM
import java.util.*;

class Solution {
    public int[] fullBloomFlowers(int[][] flowers, int[] people) {
        int[] ans = new int[people.length];
        int[] start = new int[flowers.length];
        int[] end = new int[flowers.length];

        for (int i = 0; i < flowers.length; i++) {
            start[i] = flowers[i][0];
            end[i] = flowers[i][1];
        }

        Arrays.sort(start);
        Arrays.sort(end);

        for (int i = 0; i < people.length; i++) {
            int starter = first(start, people[i]);
            int ended = second(end, people[i]);
            ans[i] = starter - ended;
        }

        return ans;
    }

    public int first(int[] arr, int target) {
        int left = 0, right = arr.length;
        while(left < right){
            int mid = left + (right-left)/2;
            if(arr[mid]<=target){
                left = mid+1;
            }else{
                right = mid;
            }
        }
        return left;
    }

    public int second(int[] arr, int target) {
        int left = 0, right = arr.length;
        while(left < right){
            int mid = left + (right-left)/2;
            if(arr[mid]<target){
                left = mid+1;
            }else{
                right = mid;
            }
        }
        return left;
    }
}
