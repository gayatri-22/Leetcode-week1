class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        int index1= m-1;
        int index2=n-1;
        int k = m+n-1;

        while(index2>=0){
            if(index1>=0 && nums1[index1] > nums2[index2]){
                nums1[k--] = nums1[index1--];
            }
            else{
               nums1[k--] = nums2[index2--];
            }

           
        }

    }
}