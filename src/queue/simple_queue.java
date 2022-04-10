package queue;

public class simple_queue {

	static int front=0;
    static int raer=0;
    static int size=6;
    static int[] arr=new int[size];
    // Main(int len){
    //     size=len;
    //     arr=new int[len];
    // }
    public static void enqueu(int data){
        if(raer==size){
            
            System.out.println("your queue is full");
            return;
        }
        else{
            arr[raer]=data;
            raer++;
            
        }
    }
    
    static void dequeu(){
        if(front==raer)
        System.out.println("your queeu is empty");
        
        else{
            for(int i=front;i<raer-1;i++){
                arr[i]=arr[i+1];
                
            }
            raer=raer-1;
        }
        
    }
    static void queeufront(){
        if(front==raer){
            System.out.println("your queue is empty");
        }
        else{
            System.out.println(arr[0]);
        }
    }
    
    
    public static void main (String[] args) {
         enqueu(5);
          enqueu(6);
          enqueu(15);
          enqueu(16);
          enqueu(25);
          enqueu(26);
          enqueu(5);
          queeufront();
          //enqueu(6);
          dequeu();
          queeufront();
          for(int i=front;i<raer;i++){
              System.out.print(arr[i]+" ");
          }
    }
}

