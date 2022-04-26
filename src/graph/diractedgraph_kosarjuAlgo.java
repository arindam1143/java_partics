package graph;
//SCC= strong count component for directed graph
import java.util.Stack;

public class diractedgraph_kosarjuAlgo {
	static Stack st=new Stack();
	static int flag=0;
	static void strong_countComponent(int[][]graph,boolean[] arr,int s){
        arr[s]=true;
        if(flag==0)
       st.push(s);
        for(int i=0;i<arr.length;i++){
            if(graph[s][i]==1 && arr[i]==false){
            	strong_countComponent(graph,arr,i);
            }
        }
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] graph = {
	            { 0, 1, 0, 1 },
	            { 1, 0, 1, 0 },
	            { 0, 1, 0, 0 },
	            { 1, 0, 0, 0 }};
        int n=graph.length;
         boolean[] arr=new boolean[n];
         int count=0;
         for(int i=0;i<n;i++) {
        	 if(arr[i]==false)
        		 strong_countComponent(graph,arr,i);
         }

         for(int i=0;i<n;i++) {
        	 arr[i]=false;
         }
         flag=1;
         while(!st.isEmpty()) {
        	 int p=(int)st.pop();
        	 if(arr[p]==true) {
        		 continue;
        	 }
        	 else {
        		 strong_countComponent(graph,arr,p);
        		 count++;
        	 }
         }
         System.out.print("no of scc " +count);
	}
	
	

}
