package Programe;

import java.util.HashMap;
import java.util.Set;

public class pro {

	public static void main(String[] args) {
	   String text="maanjunath k";
		HashMap<Character, Integer> mp = new HashMap<Character, Integer> ();
		   for (int j = 0; j<text.length (); j++) {
		       char ch = text.charAt(j);
		          if(mp.containsKey(ch)){
		                int cnt = mp.get(ch);
		             mp.put(ch, ++cnt);
		         }else{
		            mp.put(ch, 1);
		          }
		}
		Set<Character> charct = mp.keySet();
		 
		for (Character ch: charct){
		     int c= mp.get(ch);
		     if(c>1){
		        System.out.println(ch+ " - " + c);
		     }
		}}}

