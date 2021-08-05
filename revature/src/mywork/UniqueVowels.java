package mywork;
import java.util.*;

public class UniqueVowels {

	public static void main(String[] args) {
		String s = "hey hello everyone its getting complicated right that's why we should wrap up the tasks given on same day but we rarely stick to it sad";
				System.out.println(uniqueVowels(s));

	}
	public static String uniqueVowels(String s) {
		Map<Integer, String> map = new TreeMap<>(Collections.reverseOrder());
			Set<Character> set = new HashSet<>();
			
			String[] str = s.split(" ");
			
			for (int i = 0; i < str.length; i++) {
				set.clear();
				for (int j = 0; j < str[i].length(); j++) {
					if(str[i].charAt(j)=='a' || str[i].charAt(j)=='e' || str[i].charAt(j)=='i'|| str[i].charAt(j)=='o' || str[i].charAt(j)=='e') {
						set.add(str[i].charAt(j));
					} 
				}
				if(map.containsKey(set.size())) {
					String temp = map.get(set.size());
					temp = temp + " " + str[i];
					map.put(set.size(), temp);
				} else {
					map.put(set.size(), str[i]);
				}
			}
			
			System.out.println("Unique Vowel Count :  "+map);
		   StringBuilder sb = new StringBuilder();
			for(String e: map.values()) {
				sb.append(e).append(" ");
			}
		return sb.toString();
		}

	}
