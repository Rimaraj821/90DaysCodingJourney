class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n = numbers.length;
        int sum = 0;
        int starting_index =-1;
        int last_index = -1;
        for(int i =0;i<n;i++){
            for(int j = i+1;j<n;j++){
                sum = numbers[i] +numbers[j];
                if(sum == target){
                    return new int[]{i+1,j+1};
                }

            }
            
        }
        return new int[]{-1, -1};
       
        
    }
}