package com.project.prelim;

public class LeetCode {
    public static void main(String[] args) {
        int kElements = 0;

        int[] nums = {0,0,1,2,3,4,4,5};

        kElements = removeDuplicates(nums);
        System.out.println(kElements);
        for (int i = 0; i < kElements; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    static int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;

        int i = 0; // index of the last unique element
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1; // number of unique elements
    }



}
