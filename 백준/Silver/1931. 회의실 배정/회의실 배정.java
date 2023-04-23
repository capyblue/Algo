import java.io.*;
import java.util.*;
public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(in.readLine());
        //회의 시작과 끝 시간을 저장할 리스트
        int[][] time = new int[N][2];
        //최대 회의 개수
        int count = 0;


        for(int i=0;i<N;i++){
            st= new StringTokenizer(in.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
                time[i][0]=start;
                time[i][1]=end;

        }
        Arrays.sort(time,((o1, o2) -> {
            if(o1[1]==o2[1]){
                return o1[0]-o2[0];
            }
            return o1[1]-o2[1];
        }));

        //이전 회의 끝나는 시간
        int prevEndTime=0;
        for(int i=0;i<N;i++){
            //이전 회의 종료시간이 다음 회의 시작 시간보다 작거나 같으면 갱신
            if(prevEndTime<=time[i][0]){
                prevEndTime=time[i][1];
                count++;
            }
        }

        System.out.println(count);

    }
}
