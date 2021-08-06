package mywork;
import java.util.*;

public class ArrangingVowels {

	public static void main(String[] args) {
		String s = "hey hello everyone its getting complicated right that's why we should wrap up the tasks given on same day but we rarely stick to it sad";
		System.out.println(Vowels(s));
	}
	
	
	public static String Vowels(String s) {
		Map<Integer, String> map = new TreeMap<>(Collections.reverseOrder());
		String[] str = s.split(" ");
		for (int i = 0; i < str.length; i++) {
			int count = 0;
			for (int j = 0; j < str[i].length(); j++) {
				if(str[i].charAt(j)=='a' || str[i].charAt(j)=='e' || str[i].charAt(j)=='i'|| str[i].charAt(j)=='o' || str[i].charAt(j)=='e') {
					count++;
				}
			}
			if(map.containsKey(count)) {
				String temp = map.get(count);
				String rev = new StringBuilder(str[i]).reverse().toString();
				temp = temp + " " + rev;
				map.put(count, temp);
			} else {
				map.put(count, str[i]);
			}
		}
		System.out.println("Count Vowels : "+map);
		
		StringBuilder sb = new StringBuilder();
		for(String e: map.values()) {
			sb.append(e).append(" ");
		} 
		
		return sb.toString();
	}
}
