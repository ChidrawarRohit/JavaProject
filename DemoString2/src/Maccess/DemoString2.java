package Maccess;
import java.util.*;
public class DemoString2 {
	public static void main(String [] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("Enter the String:");
	String str = s.nextLine();
	int len = str.length();
	int count=0;
	System.out.println("==Vowels==");
	for (int i=0;i<=len-1;i++);
	{
		char ch= str.charAt('i');
		switch(ch)
		{
		case 'a':
		case 'A':
		System.out.print(ch+" ");
		count++;
		break;
		case 'e':
		case 'E':
		System.out.print(ch+" ");
		count++;
		break;
		case 'i':
		case 'I':
		System.out.print(ch+" ");
		count++;
		break;
		case 'o':
		case'O':
		System.out.print(ch+" ");
		count++;
		break;
		case 'u':
		case 'U':
			System.out.print(ch+" ");
			count++;
			break;
		}//end of switch
	}//end of loop
	System.out.println("\ncount of Vowels:"+count);
	s.close();
	}
	
	}


