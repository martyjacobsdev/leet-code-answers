class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        int[] results = new int[2];
        
        for(int i=0; i < nums.length; i++) {
            
            for(int k=i+1; k < nums.length; k++) {
                
                if((nums[i] + nums[k]) == target) {
                    
                    results[0] = i;
                    results[1] = k;
                    break;
                }
            }
            
        }
        return results;
    }
}