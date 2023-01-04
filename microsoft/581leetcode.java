// Question no:396
// QUestion name:Shortest Unsorted Continuous Subarray
class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int[] copied = Arrays.copyOf(nums, nums.length);
        Arrays.sort(copied);
        int start=0;
        int end=0;
        if(Arrays.equals(nums,copied) || nums.length==1) {
            return 0;
        }
        else{
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=copied[i]){
                start=i;
                break;
            }
        }
        for(int i=nums.length-1;i>=0;i--){
            if(nums[i]!=copied[i]){
                end=i;
                break;
            }
        }
        int res=0;
        res=end-start+1;
        return res;
        }
    }
}