import java.util.*;

class Solution {
    public int[] sortedSquares(int[] nums) {

        List<Integer> neg = new ArrayList<>();
        List<Integer> pos = new ArrayList<>();

        for(int num : nums){
            if(num < 0){
                neg.add(num);
            }else{
                pos.add(num);
            }
        }

        int n1 = neg.size();
        int n2 = pos.size();

        for(int i=0;i<n1;i++){
            neg.set(i, neg.get(i)*neg.get(i));
        }

        Collections.reverse(neg);

        for(int i=0;i<n2;i++){
            pos.set(i, pos.get(i)*pos.get(i));
        }

        int i=0,j=0,id=0;
        int res[] = new int[n1+n2];

        while(i<n1 && j<n2){
            if(neg.get(i) <= pos.get(j)){
                res[id++] = neg.get(i++);
            }else{
                res[id++] = pos.get(j++);
            }
        }

        while(i<n1){
            res[id++] = neg.get(i++);
        }

        while(j<n2){
            res[id++] = pos.get(j++);
        }

        return res;
    }
}