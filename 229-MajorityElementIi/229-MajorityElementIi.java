// Last updated: 8/3/2025, 9:54:45 AM
class Solution {
    public List<Integer> majorityElement(int[] nums) {
         if (nums.length == 1) {
            List<Integer> result = new ArrayList<>();
            result.add(nums[0]);
            return result;
        }

        if (nums.length == 2) {
            List<Integer> result = new ArrayList<>();
            result.add(nums[0]);
            if (nums[0] != nums[1]) result.add(nums[1]);
            return result;
        }

        
        int candidate1 = 0, candidate2 = 0;
        int count1 = 0, count2 = 0;

        for (int num : nums) {
            if (num == candidate1) {
                count1++;
            } else if (num == candidate2) {
                count2++;
            } else if (count1 == 0) {
                candidate1 = num;
                count1 = 1;
            } else if (count2 == 0) {
                candidate2 = num;
                count2 = 1;
            } else {
                count1--;
                count2--;
            }
        }

        
        count1 = 0;
        count2 = 0;

        for (int num : nums) {
            if (num == candidate1) count1++;
            else if (num == candidate2) count2++;
        }

        
        List<Integer> result = new ArrayList<>();
        int threshold = nums.length / 3;
        if (count1 > threshold) result.add(candidate1);
        if (count2 > threshold) result.add(candidate2);

        return result;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        
        int[] nums1 = {3, 2, 3};
        System.out.println("Output: " + solution.majorityElement(nums1)); // Output: [3]

        
        int[] nums2 = {1};
        System.out.println("Output: " + solution.majorityElement(nums2)); // Output: [1]

        
        int[] nums3 = {1, 2};
        System.out.println("Output: " + solution.majorityElement(nums3)); // Output: [1, 2]
    }

}