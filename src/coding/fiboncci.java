package coding;
import java.util.Scanner;

public class fiboncci {
	static int result=1;
    static int fac(int num){
        if(num==0 || num==1){
            return 1;
             //int result =1;
            //return 1;
           // System.out.print(result+" ");
        }
        //else{
        for(int i=1;i<=num;i++){
            // result=1;
            result=result*i;
            //System.out.print(result+" ");
            
        }
       // }
        return result;
        //System.out.println();
        }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
        int num =obj.nextInt();
       System.out.println(fac(num));
	}

}
