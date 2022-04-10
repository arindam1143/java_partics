package coding;

public class recertion {
	public void Mfunction(){
		System.out.println("i am first function");
		Mfunction();
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		recertion obj=new recertion();
		obj.Mfunction();

	}

}
