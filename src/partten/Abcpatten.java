package partten;

public class Abcpatten {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=58;
int x=1;
int y=n;
for(int i=1;i<=n;i++) {
	for(int j=1;j<=n;j++) {
		if((j<=x) !=false || j>=y) {
			System.out.print((char)(j+64)+" ");
		}
		else {
			System.out.print(" ");
		}
	}
	if(i<=n/2) {
		x++;
		y--;
	}
	else {
		x--;
		y++;
	}
System.out.println();	
}
	}

}
