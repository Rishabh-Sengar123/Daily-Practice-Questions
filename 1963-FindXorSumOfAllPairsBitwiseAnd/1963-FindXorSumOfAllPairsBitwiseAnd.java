// Last updated: 2/10/2026, 3:20:05 PM
class Solution {
    public int getXORSum(int[] arr1, int[] arr2) {
        int xor1 = xor(arr1);
        int xor2 = xor(arr2);
        return xor1&xor2;
    }
    public static int xor(int[] arr){
        int xor = 0;
        for(int v : arr){
            xor ^= v;
        }
        return xor;
    }
}