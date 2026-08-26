class Solution {
    public int maximumWealth(int[][] accounts) {
        int rich = 0;
        for(int[] customer : accounts){
        int sum = 0;
        for(int num : customer){
            sum += num;
        }
        if(sum > rich){
        rich = sum;
        }
    }
        return rich;
        
    }
}