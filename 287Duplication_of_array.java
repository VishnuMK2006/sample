class Solution {
    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++)
            if(nums[i] == nums[i+1]) return nums[i];
        return -1;

}
}
//1ms --o(n) complexity but we use extra space of o(n) to achive efficient way
/*class Solution {
    public int findDuplicate(int[] nums) {
byte b[]=new byte[nums.length];
int n,i=-1;
while(i<nums.length){
    n=nums[++i];
    if(b[n]==1)
    return nums[i];
b[n]=1;
}
return 0;
}
}*/
