 class twoSum {
    public static void main(String[] args) {
        /*Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1]. */
        int [] num = {2,7,11,15};
        int targetValue = 8;
        int [] res = twoSum(num, targetValue);
        
        for(int i =0;i<res.length;i++){
            System.out.print(res[i]);
        }

    } 
    public static int[] twoSum(int[] nums, int target) {
        int [] res =new int[2];
        for(int i=0;i<nums.length; i++){
            for(int j = 0;j<nums.length;j++){
                if(i==j){
                    continue;
                }
                if(nums[i]+nums[j]==target){
                    res[0]=i;
                    res[1]=j;
                    return res;
                }
            }
        }
        return res;
    }   
}
