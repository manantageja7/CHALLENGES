class Solution {
    public int firstMissingPositive(int[] nums) {
        int i=0;
        while(i<nums.length){
            int count=nums[i]-1;
            if(nums[i]>0&&nums[i]<=nums.length&&nums[count]!=nums[i]){
                int temp=nums[i];
                nums[i]=nums[count];
                nums[count]=temp;
            }
            else{
                i++;
            }  
        }
        for(i=0;i<nums.length;i++){
            if(nums[i]!=i+1){
                return i+1;
            }
        }
        return nums.length +1;
    }
}
