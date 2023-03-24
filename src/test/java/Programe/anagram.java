package Programe;

import java.util.Arrays;

public class anagram {

	public static void main(String[] args) {
		String str1 = "mmm";
		String str2="mmm";
		boolean anagrmstat = false;
		if (str1.length() != str2.length())
		{  
			System.out.println(str1 + " and " +str2 + " not anagrams string");  
		}
		else
		{
			char[] anagram1 = str1.toCharArray();  
			char[] anagram2 = str2.toCharArray(); 
			Arrays.sort(anagram1);  
			Arrays.sort(anagram2);
			anagrmstat = Arrays.equals(anagram1, anagram2); 
		}
		if (anagrmstat == true)
		{
			System.out.println(str1 + " and " +str2 + " anagrams string");  
		}else
		{
			System.out.println(str1 + " and " +str2 + " not anagrams string");  
		}

	}

}
