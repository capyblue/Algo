import java.util.*;
class Solution {
    public String solution(String my_string) {
        my_string= my_string.toLowerCase();
        char[] StringArr=my_string.toCharArray();

        Arrays.sort(StringArr);
        
        String answer = "";
        
        for(int i=0;i<StringArr.length;i++){
            answer+=StringArr[i];
        }
        
        return answer;
    }
}