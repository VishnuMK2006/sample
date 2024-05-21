/*
step 1:read question it's not to arrange element in an ascending order,its to order 0(red),1(blue),2(green)
step 2:creat an array with 3 size because we just store the element repeated times
step 3:itrate the element according to no.of times
step 4:replace with in orginal one
step 5:return the array

*/
class Solution {
    public void sortColors(int[] nums) {
        int[] frequency = new int[]{0, 0, 0};
        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i] == 0){
                frequency[0]++;
            } 
            else if(nums[i] == 1){
                frequency[1]++;
            }
            else{
                frequency[2]++;
            }
        }
        int iter = 0;
        for(int i = 0; i < nums.length;)
        {
            if(frequency[iter] > 0){
                nums[i] = iter;
                frequency[iter]--;
                i++;
            }
            else{
                iter++;
            }
        }
    }
}

