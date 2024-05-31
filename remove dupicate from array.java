class Solution {
    public int removeDuplicates(int[] nums) {
        int sort=0;
        for(int i=1;i<nums.length;i++){
            if(nums[sort]!=nums[i]){
                nums[++sort]=nums[i];
            }
        }
        return sort+1;
    }
}