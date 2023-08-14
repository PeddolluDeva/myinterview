package I.TOPStreamAPI;

import java.util.HashMap;

public class RepatingDuplicateElements3 {
public static void main(String[] args)
{
	String str = "aabbbccccdeeer";
	HashMap<Character,Integer> can = new HashMap<>();
	for(int i=0;i<str.length();i++) {
		Character ch = str.charAt(i);
		can .computeIfPresent(ch, (Character,count)->count+1);
		can .computeIfAbsent(ch, (Character)->1);
	//	System.out.print(can);
	}
	System.out.print(can);
}
}