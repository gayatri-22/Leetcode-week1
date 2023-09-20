class Solution {
    public void rotate(int[] nums, int k) {
       /* int j=0;
        int[] ans = new int[nums.length];
        for(int i=k;i<nums.length;i++){
            ans[j]=nums[k];
            j++;
        }
        for(int i=0;i<k;i++){
            ans[j]=nums[k];
        }*/

        int n = nums.length;
        k%=n;

        reverse(nums,0,n-k-1);
        reverse(nums,n-k,n-1);
        reverse(nums,0,n-1);
        
    }

    public static void reverse(int[] nums, int start, int end){
        while(start<end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}