class Solution {
    public int[] twoSum(int[] nums, int target) {
        /*int[] ans = new int[2];
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                ans[0] =i;
                ans[1]=j;
            }
            }
        }
        return ans;*/

        int[] ans = new int[2];
        HashMap<Integer,Integer> map = new HashMap<>();
        int index=0;
        for(int num:nums){
            map.put(num,index);
            index++;
        }
        
         for(int i=0;i<nums.length;i++){
            int c= target-nums[i];
            if(map.containsKey(c) && map.get(c)!=i){
              ans[0] = i;
              ans[1] = map.get(c);  
            }
            //map.put(a,i);
        }
            return ans;
    }
}