package Programe;

import java.util.Arrays;

public class anagram1 {
	public static void main(String[] args) {
		String str1="hear";
		String str2="earth";
		boolean anagramy = false;
		if(str1.length()!=str2.length())
		{
			System.out.println(str1+" and "+str2+" not a angram ");
		}
		char[] angram1 = str1.toCharArray();
		char[] angram2 = str2.toCharArray();
		Arrays.sort(angram1);
		Arrays.sort(angram2);
		anagramy = Arrays.equals(angram1, angram2);
		if(anagramy==true)
		{
			System.out.println("it is anagrame ");
		}
		else
		{
			System.out.println("it is not anagarme");
		}
	}

}
