import java.util.*;
class Solution {
    public int[] solution(String myString) {
        ArrayList<Integer> tmp = new ArrayList<>();
        
        int cnt = 0;
        for(int i=0;i<myString.length();i++){
            
            if(myString.charAt(i)=='x'){
                tmp.add(cnt);
                cnt=-1;
            }
            cnt++;
        }
        tmp.add(cnt);
        
        int[] answer = new int[tmp.size()];
        for(int i=0;i<tmp.size();i++){
            answer[i]=tmp.get(i);
        }
        return answer;
    }
}