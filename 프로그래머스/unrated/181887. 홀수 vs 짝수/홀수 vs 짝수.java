class Solution {
    public int solution(int[] num_list) {
        int odd =0;
        int even = 0;
        
        odd+=num_list[0];
        for(int i=1;i<num_list.length;i++){
            if(i%2==0){
                odd+=num_list[i];
            }else{
                even+=num_list[i];
            }
        }
        
        if(even>=odd){
            return even;
        }else{
            return odd;
        }
    }
}