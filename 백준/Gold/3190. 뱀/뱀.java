import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        ArrayDeque<int[]> q = new ArrayDeque<>(); //뱀 꼬리 위치 알기 위한 큐
        int[] dx={1,0,-1,0}; //하좌상우 (왼쪽으로 90도 오른쪽으로 90도)
        int[] dy={0,-1,0,1};
        int d=3; //뱀은 우측을 향하고 있음

        int N = Integer.parseInt(in.readLine());
        int A = Integer.parseInt(in.readLine()); //사과 개수

        int[][] board = new int[N][N];
        for(int a=0;a<A;a++){
            st= new StringTokenizer(in.readLine());
            int x = Integer.parseInt(st.nextToken())-1;
            int y = Integer.parseInt(st.nextToken())-1;

            board[x][y]=1; //사과는 1

        }

        //시간 1
        int sec=1;

        // 큐에 크기 1의 뱀 머리 넣기
        //뱀 머리 위치
        int hx=0;
        int hy=0;
        board[hx][hy]=-1; //뱀은 -1
        q.offer(new int[] {hx,hy});
        int x=hx;
        int y=hy;

        
//        for(int[] i : board){
//            System.out.println(Arrays.toString(i));
//        }
        
        //t를 인덱스로 가지는 for문에서 벽에 부딪히거나 몸에 부딪혀서 break되었을 때, while문으로 다시 들어가지 않게 하기 위한 flag
        boolean flag = true;


        //방향 바꾸는 수
        int T = Integer.parseInt(in.readLine());
        here:
        for(int t=0;t<T;t++){
            st=new StringTokenizer(in.readLine());
            int S = Integer.parseInt(st.nextToken());
            char C = st.nextToken().charAt(0);

            //방향 바꾸기 전까지 직진
            for(;sec<=S;sec++){
            	
                x= x+dx[d];
                y= y+dy[d];
                //벽에 부딪히거나, 뱀 몸에 닿으면
                if(x<0||y<0||x>=N||y>=N){
                	flag=false;
                    break here;
                }
                //몸에 닿으면
                if(board[x][y]==-1){
                	flag=false;
                	break here;
                }

                //사과 없으면
                if(board[x][y]==0){
                    int[] tmp =q.poll();
                    int i= tmp[0];
                    int j= tmp[1];

                    board[i][j]=0; //꼬리 없애줌
                }
                
                //뱀 이동
                q.offer(new int[] {x, y});
                board[x][y]=-1;
                

//                System.out.println();
//                System.out.println(sec);
//                for(int[] i : board){
//                    System.out.println(Arrays.toString(i));
//                }
            }
            if(C=='D'){ //오른쪽 90도 회전
                d= (d+1)%4;
            }else{ //왼쪽 90도 회전
                d= (d-1+4)%4;
            }

        }
        if(flag) sec--; //위 for문을 break 없이 통과한 경우, sec++된 상태로 끝나는데 바로 아래 while문에서 sec++ 해줄것이기 때문에 -1

        while(flag){
        	sec++;

            x= x+dx[d];
            y= y+dy[d];
            //벽에 부딪히거나, 뱀 몸에 닿으면
            if(x<0||y<0||x>=N||y>=N){
//                System.out.println("wall");
                break;
            }
            //몸에 닿으면
            if(board[x][y]==-1){
//                System.out.println("body");
                break;
            }

            //사과 없으면
            if(board[x][y]==0){
                int[] tmp =q.poll();
                int i= tmp[0];
                int j= tmp[1];

                board[i][j]=0;
            }

            //뱀 이동
            q.offer(new int[] {x, y});
            board[x][y]=-1;
//
//            System.out.println(sec);
//            for(int[] i : board){
//                System.out.println(Arrays.toString(i));
//            }
            

        }

        System.out.println(sec);
    }
}