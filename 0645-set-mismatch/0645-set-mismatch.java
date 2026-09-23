class Solution {
    public int[] findErrorNums(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        int i = 0;
        while(i < nums.length){
             int j = nums[i] - 1;
            if(nums[i] != nums[j]){
                //swap
               int temp = nums[i];
               nums[i] = nums[j];
               nums[j] = temp ; 
        } else{
            i++;
        }
        }
        for(int k = 0 ; k < nums.length; k++){
           if(nums[k] != k+1){
            ans.add(nums[k]);
            ans.add(k+1);
           }
        }
        return new int[] {ans.get(0) , ans.get(1)};
    }
}