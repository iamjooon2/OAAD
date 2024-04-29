class Solution {
    public void moveZeroes(int[] nums) {
        int zeroCount = 0;
        for (int num : nums) {
            if (num == 0) zeroCount += 1;
        }
        if (zeroCount == 0) return;

        int tempIndex = 0;
        int[] temp = new int[nums.length];
        for (int i = 0; i < nums.length; i += 1) {
            if (nums[i] != 0) {
                temp[tempIndex] = nums[i];
                tempIndex += 1;
            }
        }

        int index = 0;
        for (int i = 0; i < temp.length; i += 1) {
            if (temp[i] != 0) {
                nums[index] = temp[i];
                index += 1;
            }
        }

        for (int i = 0; i < zeroCount; i += 1) {
            nums[index] = 0;
            index += 1;
        }
    }

    /*
    best practice
    public void moveZeroes(int[] nums) {
        int left = 0;

        for (int right = 0; right < nums.length; right++) {
            if (nums[right] != 0) {
                int temp = nums[right];
                nums[right] = nums[left];
                nums[left] = temp;
                left++;
            }
        }        
    }
    
     */
}
