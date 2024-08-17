package leetcode;

import java.util.*;

    class Solution {
        public int removeDuplicates(int[] nums) {
            if (nums.length <= 2) return nums.length;
    
            int insertPosition = 2;
    
            for (int i = 2; i < nums.length; i++) {
                if (nums[i] != nums[insertPosition - 2]) {
                    nums[insertPosition] = nums[i];
                    insertPosition++;
                }
            }
    
            return insertPosition;
        }
    
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
    
            System.out.println("Enter the number of elements:");
            int n = sc.nextInt();
            int[] nums = new int[n];
    
            System.out.println("Enter the elements:");
            for (int i = 0; i < n; i++) {
                nums[i] = sc.nextInt();
            }
    
            Solution sol = new Solution();
            int k = sol.removeDuplicates(nums);
    
            System.out.println("Number of elements after removing duplicates: " + k);
            System.out.print("Array after removing duplicates: ");
            for (int i = 0; i < k; i++) {
                System.out.print(nums[i] + " ");
            }
        
        }
    }
