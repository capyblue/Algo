import java.util.*;
class Solution {
    static int[] tmp, answer;
    static ArrayList<Integer> list = new ArrayList<>();
    public int[] solution(int[] numbers) {
        
        tmp= new int[2];
        
        comb(0,0, numbers);
        Collections.sort(list);
        
        int[] answer= new int[list.size()];
        for(int i=0;i<list.size();i++){
            answer[i]=list.get(i);
        }
        
        return answer;
    }
    
    public void comb(int start, int depth, int[] numbers){
        if(depth==2){
            if(!list.contains(tmp[0]+tmp[1]))
            list.add(tmp[0]+tmp[1]);
            return;
        }
        
        for(int i=start;i<numbers.length;i++){
            tmp[depth]=numbers[i];
            comb(i+1,depth+1,numbers);
        }
    }
}