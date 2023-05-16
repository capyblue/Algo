class Solution {
    public String solution(String n_str) {
        String answer = "";
        boolean flag = true;
        for(int i=0;i<n_str.length();i++){
            if(flag){
                if(n_str.charAt(i)=='0'){
                
                }else{
                    answer+=n_str.charAt(i);
                    flag=false;
                }
            }else{
                answer+=n_str.charAt(i);
            }
        
        }
        
        
        return answer;
    }
}