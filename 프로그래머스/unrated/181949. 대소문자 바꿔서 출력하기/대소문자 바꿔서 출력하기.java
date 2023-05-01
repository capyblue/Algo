import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        
        String answer="";
        
        for(int i=0;i<a.length();i++){
            int num = (int)a.charAt(i);
            if(num<=90&&num>=65){ //대문자면
                answer+=(char)(num+32);
            }else{
                answer+=(char)(num-32);
            }
        }
        
        System.out.println(answer);
    }
}