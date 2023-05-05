class Solution {
    public int[] solution(int[] arr) {
        int[] answer;
        
        int min=Integer.MAX_VALUE;
        
        if(arr.length==1){
            answer=new int[1];
            answer[0]=-1;
        }else{
            answer = new int[arr.length-1];
            for(int i=0;i<arr.length;i++){
            if(arr[i]<min) min=arr[i];
        }
        
        for(int i=0, idx=0;i<arr.length;i++){
            if(arr[i]!=min){
                answer[idx]=arr[i];
                idx++;
            }
        }
            
        }
        
        
        
        return answer;
    }
}