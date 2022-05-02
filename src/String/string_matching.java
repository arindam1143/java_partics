package String;
//brute froce algo 
//time complexcity O(m*n);

public class string_matching {
	static void string_match(String st1,String st2) {
		int len1=st1.length();
		int len2=st2.length();
		int i=0,j=0;
		if(len1<len2) {
			System.out.println("your string is not present");
		}
		else {
		
		for(i=0;i<=len1-len2;i++ ) {
			
			for(j=0;j<len2;j++) {
				if(st1.charAt(i+j) !=st2.charAt(j)) {
					break;}
	
				
			}
			
			if(j==len2)
				System.out.println("your string found here");
			
		}
		
		
	}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   String st1="Arindam panja";
   String st2="Arindam ";
   string_match( st1, st2);
	}

}
