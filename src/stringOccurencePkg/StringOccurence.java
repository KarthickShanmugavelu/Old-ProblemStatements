package stringOccurencePkg;

import java.util.Scanner;

public class StringOccurence {

	public static void main(String[] args) {
		String s1 = "jjkkhhghghgasd";
		int flag = 0;
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < s1.length(); i++) 
		{
			if (i == 0) 
			 {
				sb.append(s1.charAt(i));
				sb.append('1');
			} 
			else 
			 {
				for (int j = 0; j < sb.length(); j++) 
				{
					// System.out.println("sb.charAt(j): "+sb.charAt(j)+"sb.charAt(i):
					// "+sb.charAt(i));
					if (sb.charAt(j) == s1.charAt(i)) {
						int temp = Integer.parseInt(String.valueOf(sb.charAt(j + 1)));
						temp++;
						String c = String.valueOf(temp);
						sb.replace(j + 1, j + 2, c);
						flag=1;
					}
					
				}
				if(flag==0) {
					sb.append(s1.charAt(i));
					sb.append('1');
				}
				flag=0;
				}
		}
		System.out.println(sb.toString());
		
		System.out.printf("%-10s%03d","sam",22);

	}

}
