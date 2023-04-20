import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st= new StringTokenizer(in.readLine());

        int N= Integer.parseInt(st.nextToken());
        int K= Integer.parseInt(st.nextToken());

        int[] coin = new int[N];

        for(int i=0;i<N;i++){
            coin[i]=Integer.parseInt(in.readLine());
        }

        int coinCount=0;

        for(int i=N-1;i>=0;i--){

            int div= K/coin[i];
            if(div==0) continue;
            K=K%coin[i];
            coinCount+=div;
        }

        System.out.println(coinCount);


    }
}
