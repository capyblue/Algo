import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader in =new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
        int N= Integer.parseInt(in.readLine());
        int [] arr = new int[201];
        st = new StringTokenizer(in.readLine());
        for(int i=0;i<N;i++){
            arr[Integer.parseInt(st.nextToken())+100]++;
        }
        int M = Integer.parseInt(in.readLine())+100;
        
        System.out.println(arr[M]);
		

	}

}