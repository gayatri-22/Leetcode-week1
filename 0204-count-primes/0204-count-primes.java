class Solution {
    public int countPrimes(int N) {
       
        //int N=1000000;
        
        if(N<2){
            return 0;
        }
        
        boolean[] sieve = new boolean[N];
        
        for(int i=0;i<N;i++){
            sieve[i]=true;
        }
        
        for(int i=2;i*i<=N;i++){
            if(sieve[i]==true){
                for(int j=i*i;j<N;j+=i){
                    sieve[j]=false;
                }
            }
        }
        int count=0;
        for(int k=2;k<N;k++){
            if(sieve[k] == true){
                count++;
            }
        }
        return count;
    }
}