// Question no:396
// QUestion name: Rotate function
class Solution {
    public int maxRotateFunction(int[] nums) {
        int max=0;
        int len=nums.length;
        int sumarr=0;
        int sumind=0;
        for(int i=0;i<nums.length;i++){
            sumind+=i*nums[i]; 
            sumarr+=nums[i];
        }
        max=sumind;
        for(int j=len-1;j>0;j--){
            int k=sumind+sumarr-len*nums[j];
            sumind=k;
            if(max<sumind){
                max=sumind;
            }
            
        }
        return max;
        }
    
}