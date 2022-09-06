package String;

public class findThe_Numberof_word {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int temp=0;
		int word=1;
		String st="i  am    arindam sbc abcd  jdlkj fjdlskjglkdjf lkjkl;dgjlk;jd;oir       kdjflkdj";
		for(int i=0;i<st.length()-1;i++){
		    char a=st.charAt(i);
		    
		    
		   if(a==' '){
		       temp++;
		       if(st.charAt(i)==st.charAt(i+1)){
		           continue;
		       }
		       else{
		           word++;
		       }
		   }
		   
		   
		}
		if(st.charAt(0)==' '){
		        word--;
		    }
		
		System.out.println(word);
	}

}
