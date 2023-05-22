class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String concat = Integer.toString(a)+Integer.toString(b);
        
        if(Integer.parseInt(concat)>=2*a*b) answer=Integer.parseInt(concat);
        else answer= 2*a*b;
        
        return answer;
    }
}