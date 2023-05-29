class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int originX=x;
        int tmp=0;
        while(x>0){
            tmp+=x%10;
            x/=10;
        }
        
        if(originX%tmp!=0) answer=false;
        
        return answer;
    }
}