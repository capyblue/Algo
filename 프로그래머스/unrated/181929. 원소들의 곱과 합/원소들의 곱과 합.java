class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int plus=0;
        int multi=1;
        for(int i=0;i<num_list.length;i++){
            multi*=num_list[i];
            plus+=num_list[i];
        }
        
        if(multi<Math.pow(plus,2)){
            return 1;
        }else{
            return 0;
        }
        

    }
}