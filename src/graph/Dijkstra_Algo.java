package graph;

public class Dijkstra_Algo {
	static int findMinDistNode(int[] distance, boolean[] visited){
        System.out.println("a");
        int minv=-1;
        int node=0;
        for(int i=0;i<visited.length;i++){
            if(!visited[i] && (minv==-1 || distance[i]<distance[minv])){
                minv=i;
                
            }
        }
        System.out.println("min distance "+minv);
        return minv;
    }
    
    
    //dijkastra algo
    static void dijkstra(int[][] graph,int src){
        int v=graph.length;
        boolean visited[] =new boolean[v];
        for(int i=0;i<v;i++){
            visited[i]=false;
        }
        int distance[]= new int[v];
        for(int i=0;i<v;i++){
            distance[i]=Integer.MAX_VALUE;
        }
        distance[src]=0;
        
        
        for(int i=0;i<v;i++){
            int minNode=findMinDistNode(distance,visited);
            visited[minNode]=true;
            
            for(int j=0;j<v;j++){
                if(graph[minNode][j] !=0 && !visited[j]){
                    int newdistance=distance[minNode]+graph[minNode][j];
                    if(newdistance<distance[j]){
                        distance[j]=newdistance;
                    }
                }
            }
        }
        
        for(int i=0;i<v;i++){
            System.out.println(src+" - "+i+" : "+distance[i]);
        }
    }
    
    
    public static void main(String[] args){
        int[][] graph = {
	            { 0, 5, 5, 100 },
	            { 1, 0, 7, 5 },
	            { 5, 70, 0, 98 },
	            { 45, 5, 28, 0 }};
	   int n=graph.length;
	   int src=1;
	            
	   boolean[] visited=new boolean[n];
	   int[] distance=new int[n];
	   
	   dijkstra( graph,0);
        
        
    }
}
