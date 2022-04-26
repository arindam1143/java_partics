package graph;

public class DSF {
  static void DSF(int[][] graph,int s,boolean[]arr) {
	  arr[s]=true;
	  System.out.println(s);
	  for(int i=0;i<4;i++) {
		  if(graph[s][i]==1 && arr[i]==false) {
			  DSF(graph,i,arr);
		  }
	  }
  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 boolean[] arr=new boolean[4];
	       /* int[][] graph={{0,1,1,1},
	                     {1,0,1,0},
	                     {1,1,0,0},
	                     {1,0,0,0}};*/
	        int[][] graph={{0,0,1,1},
                           {0,0,0,1},
                           {1,0,0,0},
                           {1,1,0,0}};
	                     DSF(graph,0,arr);
	}

}
