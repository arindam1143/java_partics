package partten;

public class star_partten1 {
	static void fib(int n){
        if(n>0){
            fib(--n);
            System.out.println(n+" ");
            fib(--n);
        }
    }
	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		for(int i=0;i<=5;i++) {
//			for(int j=0;j<=i;j++) {
//				System.out.print("*"+" ");
//			}
//			System.out.println();
//		}
		//System.out.print(fib(4));
		fib(4);

	}

}
