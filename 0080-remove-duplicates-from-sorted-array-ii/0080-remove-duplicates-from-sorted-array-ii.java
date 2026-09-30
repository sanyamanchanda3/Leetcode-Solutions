class Solution {
    public int removeDuplicates(int[] nums) {
        int ans = 1;//
        int count = 1;
        for(int j=1; j < nums.length; j++){
            if(nums[j] == nums[j - 1] && count < 2){
                count++;
                nums[ans] = nums[j];
                ans++;
            }
            else if(nums[j] != nums[j - 1]){
            count = 1;
            nums[ans] = nums[j];
            ans++;
            }
            
        }
        return ans ;
    }
}