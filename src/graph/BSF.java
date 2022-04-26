package graph;

import java.util.LinkedList;
import java.util.Queue;

public class BSF {
	static void BSF(int[][] graph,int s,boolean[] arr) {
		arr[s]=true;
		Queue q=new LinkedList();
		q.offer(s);
		while(!q.isEmpty()) {
			int v=(int)q.poll();
			System.out.println(v);
			
			for(int i=0;i<4;i++) {
				if(graph[v][i]==1 && arr[i]==false) {
					arr[i]=true;
					q.offer(i);
				}
			}
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 boolean[] arr=new boolean[4];
	        int[][] graph={{0,0,1,1},
	                     {0,0,0,1},
	                     {1,0,0,0},
	                     {1,1,0,0}};
	        BSF(graph,0,arr);
	                     

	}

}
