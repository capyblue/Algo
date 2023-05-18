class Solution {
    public int solution(int a, int b) {
        
        String str1= Integer.toString(a)+Integer.toString(b);
        String str2=Integer.toString(b)+Integer.toString(a);
        int answer1 = Integer.parseInt(str1);
        int answer2 = Integer.parseInt(str2);
        
        if(answer1>=answer2) return answer1;
        else return answer2;
        
    }
}