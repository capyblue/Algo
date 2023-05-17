class Solution {
    public int solution(int order) {
        int answer = 0;
        String orderString = Integer.toString(order);
        for(int i=0;i<orderString.length();i++){
            if(orderString.charAt(i)=='3'||orderString.charAt(i)=='6'||orderString.charAt(i)=='9'){
                answer++;
            }
        }
        return answer;
    }
}