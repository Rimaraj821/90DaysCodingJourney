class Solution {
    public int reverse(int num) {
        int x = Math.abs(num);
        int reverseno =0 ;
        while(x!=0){
            int rem = x%10;
            if(reverseno>(Integer.MAX_VALUE-rem)/10){
                return 0;
            }
            reverseno =reverseno*10+ rem;
            x=x/10;


        }
        if(num<0){
            return -reverseno;

        }
        else{
            return reverseno;
        }
        
    }
}