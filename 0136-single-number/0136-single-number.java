class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer> count = new HashMap<>();
        for(int i:nums){
            count.put(i,count.getOrDefault(i,0)+1);
        }
      //  count.put(i,1);

        for(int a:nums){
            if(count.get(a)==1){
                return a;
            }
        }
        return -1;
    }
}