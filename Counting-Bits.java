class Solution {
    public int[] countBits(int num) {
       int[] binCount = new int[num+1];
        binCount[0]=0;
        int pow=1;
        for(int i =1,t=0;i<=num;i++,t++){
            if(pow==i){
                pow=pow*2;
                t=0;
            }
            //System.out.println(t);
            binCount[i]=binCount[t]+1;
            
        }
        return binCount;
    }
}
