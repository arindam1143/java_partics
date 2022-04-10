package String;
import java.util.*;
import java.io.*;
import java.util.Scanner;
public class revers_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner obj=new Scanner(System.in);
	        String st=obj.nextLine();
	        StringBuilder sb=new StringBuilder(st);
	        
	        for(int i=0;i<sb.length()/2;i++){
	            int front=i;
	            int last=sb.length()-1-i;
	            char frontChar=sb.charAt(front);
	            char lastChar=sb.charAt(last);
	            
	            sb.setCharAt(front, lastChar);
	            sb.setCharAt(last, frontChar);
	        }
	        System.out.print(sb);
	}

}
