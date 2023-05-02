import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	static int N, M, K;
	static boolean[][] map;
	static int[] dx= {-1,1,0,0};
	static int[] dy= {0,0,-1,1};
	
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb= new StringBuilder();
		int T= Integer.parseInt(in.readLine());
		
		for(int tc=0;tc<T;tc++) {
			StringTokenizer st= new StringTokenizer(in.readLine()," ");
			N=Integer.parseInt(st.nextToken());
			M=Integer.parseInt(st.nextToken());
			K=Integer.parseInt(st.nextToken());
			
			map=new boolean[N][M];
			
			for(int k=0;k<K;k++) {
				st= new StringTokenizer(in.readLine()," ");
				int i=Integer.parseInt(st.nextToken());
				int j=Integer.parseInt(st.nextToken());
				
				map[i][j]=true;
			}
			
			int cnt=0;
			/*for(int i=0;i<N;i++) {
				for(int j=0;j<M;j++) {
					if(map[i][j]) {
						bfs(i, j);
						cnt++;
					}
				}
			}*/
			for(int i=0;i<N;i++) {
				for(int j=0;j<M;j++) {
					if(map[i][j]) {
						dfs(i, j);
						cnt++;
					}
				}
			}
			
			sb.append(cnt);
			
			if(tc!=T-1) {
				sb.append("\n");

			}
			
		}
		System.out.println(sb);
		
	}
	static void dfs(int i, int j) {
		map[i][j]=false;
		for(int d=0;d<4;d++) {
			int x=i+dx[d];
			int y=j+dy[d];
			
			if(x>=0&&y>=0&&x<N&&y<M&&map[x][y]) {
				dfs(x, y);
			}
			
		}
		
	}
	static void bfs(int i, int j) {
		ArrayDeque<int[]> q= new ArrayDeque<>();
		map[i][j]=false;
		q.offer(new int[] {i, j});
		while(!q.isEmpty()) {
			int[] ij=q.poll();
			i=ij[0];
			j=ij[1];
			
			for(int d=0; d<4;d++) {
				int x=i+dx[d];
				int y=j+dy[d];
				
				if(x>=0&&x<N&&y>=0&&y<M&&map[x][y]) {
					map[x][y]=false;
					q.offer(new int[] {x,y});
				}
			}
		}
	}

}
