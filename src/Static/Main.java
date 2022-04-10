package Static;

public class Main{
    public static int partiction(int arr[],int low,int high){
        int pivot=arr[high];
        int i=low-1;
        for(int j=low;j<high;j++){
            if(arr[j]<pivot){
                i++;
                //swap 
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        int temp=arr[i+1];
        arr[i+1]=pivot;
        arr[high]=temp;
        return i+1;
    }
public static void quicksort(int arr[], int low, int high){
      if(low<high){
          int pivot=partiction(arr,low,high);
          quicksort(arr,low,pivot-1);
          quicksort(arr,pivot+1,high);
      }  
    }
    
    
    
    
    public static void main (String[] args) {
        int[] arr={4,8,9,1,2,9,10};
        int low=0;
        int high=arr.length;
        
        quicksort(arr,low,high-1);
        for(int i=0;i<high;i++){
            System.out.print(arr[i]+" ");
        }
    }
}