package String;

public class reduceRepetingChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder st=new StringBuilder();
        char[] str={'a','b','b','b','c','c','c','c','c','d','d','d','f'};
        st.append(str[0]);
        for(int i=1;i<str.length;i++){
            if( str[i-1] !=str[i]){
                st.append(str[i]);
            }
        }
        System.out.println(st);
	}

}
