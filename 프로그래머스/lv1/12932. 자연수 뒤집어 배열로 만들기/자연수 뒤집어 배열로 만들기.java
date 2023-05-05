class Solution {
    public int[] solution(long n) {
        String tmp = ""+n;
        int[] arr = new int[tmp.length()];
        for(int i=0;i<tmp.length();i++){
            arr[i]=(int)(n%10);
            n/=10;
            if(n==0) break;
        }
        
        int [] answer = new int[tmp.length()];
        for(int i=0;i<tmp.length();i++){
            answer[i]=arr[i];
        }
        return answer;
    }
}