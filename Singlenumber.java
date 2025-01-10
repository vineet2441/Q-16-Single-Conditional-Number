class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        
        int a=-10000;
        for(int i=1; i<nums.length; i=i+2){
            if(nums[i]!=nums[i-1]){
                a=nums[i-1];
                break;

            }
        }
        if(a==-10000){
            a=nums[nums.length-1];
        }
        return a;
    }
}
