package stack;
import java.util.Stack;
import java.util.Scanner;

public class valid_parantasis {
	public static boolean cheakparentasis(String str) {
		Stack<Character> st=new Stack<>();
		for(int i=0;i<str.length();i++) {
			char c=str.charAt(i);
			if(c=='(' || c=='{' || c=='[') {
				st.push(c);
			}
			else if(c==')'){
				if(!st.isEmpty() && st.peek()=='(') {
					st.pop();
				}
				else {
					return false;
				}
			}
			else if(c=='}') {
				if( !st.isEmpty() && st.peek()=='{') {
					st.pop();
				}
				else {
					return false;
				}
			}
			else if(c==']') {
				if(!st.isEmpty() && st.peek()=='[') {
					st.pop();
				}
				else {
					return false;
				}
			}
		}
		if(st.isEmpty()) {
			return true;
		}
		else {
			return false;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
      Scanner obj=new Scanner(System.in);
     String str=obj.nextLine();
     System.out.print(cheakparentasis(str));
     
     
		

	}

}
