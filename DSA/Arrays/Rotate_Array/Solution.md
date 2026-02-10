class Solution {
    public void rotate(int[] arr,int k){
        int len = arr.length;
        k = k%len;
        reverse(arr,0,len-1);
        reverse(arr,0,k-1);
        reverse(arr,k,len-1);


}
public void reverse(int[] nums ,int i ,int j){
        while(i<=j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
         }
   }
        
    
    
    
    
    
}
