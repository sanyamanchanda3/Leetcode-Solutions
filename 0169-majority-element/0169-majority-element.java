import java.util.HashMap;
class Solution {
    public int majorityElement(int[] nums) {
        int major = nums.length / 2;
        int count = 0;
        HashMap <Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length ; i++){
            count = map.getOrDefault(nums[i] , 0) + 1;
            map.put(nums[i] , count);

            if(count > major){
                return nums[i];
            }
        }
        return 0;
    }
}