import java.util.*;
class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        ArrayList<Integer> arrList = new ArrayList<>();
        ArrayList<Integer> delList = new ArrayList<>();
        
        for(int i=0;i<arr.length;i++){
            arrList.add(arr[i]);
        }
        for(int i=0;i<delete_list.length;i++){
            delList.add(delete_list[i]);
        }
        
        for(int i=0;i<delList.size();i++){
            arrList.remove(delList.get(i));
        }
        
        
        int[] answer = new int[arrList.size()];
        
        for(int i=0;i<arrList.size();i++){
            answer[i]=arrList.get(i);
        }
        return answer;
    }
}