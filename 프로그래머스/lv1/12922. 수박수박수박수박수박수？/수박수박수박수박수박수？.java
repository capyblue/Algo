class Solution {
    public String solution(int n) {
        String answer = "";
        
        if(n%2==0){
            for(int i=0;i<n/2;i++){
                answer+="수";
                answer+="박";
            }
        }else{
            for(int i=0;i<(n-1)/2;i++){
                answer+="수";
                answer+="박";
            }
            answer+="수";
        }
        
        return answer;
    }
}