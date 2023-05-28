import java.util.*;
class Solution {
    public String[] solution(String my_string) {
        ArrayList<String> list = new ArrayList<>();
        
        StringTokenizer st = new StringTokenizer(my_string);
        while(true){
            list.add(st.nextToken());
            if(!st.hasMoreTokens()) break;
        }
        
        String[] answer = new String[list.size()];
        for(int i=0;i<list.size();i++){
            answer[i]=list.get(i);
        }
        return answer;
    }
}