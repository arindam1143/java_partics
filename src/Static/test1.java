package Static;

public class test1 {
	int emplay_id;
	String emplay_name;
 static	 String company="chitkara unuversity";
	public test1(int emplay_id,String emplay_name/*String company*/) {
		this.emplay_id=emplay_id;
		this.emplay_name=emplay_name;
		//this.company=company;
	}
	void display() {
		System.out.println("emplay_id= "+emplay_id+" emplay_name "+emplay_name +" company_name "+company);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test1 e1= new test1(101, "avi"/* "virtusha"*/);
		test1 e2=new test1(102,"manu");
		e1.display();
		e2.display();

	}

}
