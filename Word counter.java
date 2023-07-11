package Richa;

import java.util.HashMap;
import java.util.*;

public class WordCounter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<String, Integer>words = new HashMap<String, Integer>();
		System.out.println("Enter a paragraph : ");
		String para;
		para = sc.nextLine().toLowerCase();
		String breaker = "[.,?! ]+";
		String[] arr  = para.split(breaker);
		for(int i=0; i<arr.length; i++)
		{
			if(words.containsKey(arr[i]))
			{
				int value = words.get(arr[i]);
				value++;
				words.put(arr[i], value);
			}
			else
			{
				words.put(arr[i], 1);
			}
		}
		for(Map.Entry w : words.entrySet()){    
		    System.out.println(w.getKey()+" "+w.getValue());    
		   } 

	}

}