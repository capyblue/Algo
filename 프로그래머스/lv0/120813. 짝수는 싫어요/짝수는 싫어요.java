import java.util.*;
class Solution {
    public int[] solution(int n) {
        int[] answer = new int[(n+1)/2];
        
        for(int j=0,i=1;i<=n;j++,i+=2){
            answer[j]=i;
        }
        
        Arrays.sort(answer);
        return answer;
    }
}