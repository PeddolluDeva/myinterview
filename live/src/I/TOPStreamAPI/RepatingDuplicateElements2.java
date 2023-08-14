package I.TOPStreamAPI;

import java.util.ArrayList;
import java.util.Collections;

public class RepatingDuplicateElements2 {

	public static void main(String[] args) {
	 ArrayList<String> ar = new ArrayList<String>();
	 ar.add("aba"); ar.add("aaa"); ar.add("bbb"); ar.add("aab"); ar.add("aba"); ar.add("aab");
	 Collections.sort(ar);
	 System.out.println(ar);
	 Collections.reverse(ar);
	 System.out.println(ar);
	 ar.add(1,"aab");
	 System.out.println(ar);
}
}