package graph;
//using DSF find the grpaph conected or not
public class Conected_or_not{
	
    static void conect_or_not(int[][]graph,boolean[] arr,int s){
           arr[s]=true;
           for(int i=0;i<arr.length;i++){
               if(graph[s][i]==1 && arr[i]==false){
                   conect_or_not(graph,arr,i);
               }
           }
       }
    public static void main(String[] args){
       //this is conected graph
        //int[][] graph = {
         //   { 0, 1, 0, 1 },
           // { 1, 0, 1, 0 },
            //{ 0, 1, 0, 0 },
           // { 1, 0, 0, 0 }};
    	//this is not conected graph
    	 int[][] graph = {
    	            { 0, 1, 0, 0 },
    	            { 1, 0, 1, 0 },
    	            { 0, 1, 0, 0 },
    	            { 0, 0, 0, 0 }};
            int n=graph.length;
             boolean[] arr=new boolean[n];
            //System.out.println(graph.length);
            //conect_or_not(graph,arr,0);
             int count=0;
             conect_or_not(graph,arr,0);
             count++;
            for(int i=0;i<n;i++){
                if(arr[i]==false){
                    System.out.println("graph is not conected!!!!");
                    return;
                }
            }
            System.out.println("graph is conected");
        
    }
}
