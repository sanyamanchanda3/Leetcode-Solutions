class Solution {
    public int maximumWealth(int[][] accounts) {
        int ans = Integer.MIN_VALUE;
        for(int[] customer : accounts){
        int sum = 0;
        for(int num : customer){
            sum += num;
        }
        if(sum > ans){
        ans = sum;
        }
    }
        return ans;
        
    }
}