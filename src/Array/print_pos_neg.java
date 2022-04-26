package Array;

public class print_pos_neg {
	static void display(int arr[]) {
		int[] newarr=new int[arr.length];
		int i,j;
		i=j=0;
		boolean p=true;
		while(i<arr.length && arr[i]<0)
			i++;
		while(j<arr.length && arr[j]>0)
			j++;
		
		for(int k=0;k<arr.length && (i<arr.length || j<arr.length);k++) {
			if(p==true) {
				newarr[k]=arr[i];
				
				i++;
				p=false;
				while(i<arr.length && arr[i]<0)
					i++;
				
			}
			else {
				newarr[k]=arr[j];
				
				j++;
				p=true;
				while(j<arr.length && arr[j]>=0)
					j++;
				
			}
		}
		for(int x=0;x<arr.length;x++) {
			System.out.print(newarr[x]+" ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] arr= {9,4,-2,-1,5,0,-5,-3,2};
display(arr);
	}

}
