package DuplicatesArrayelements;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class ArraySetSTR {
public static void main(String[] args)
{
	//String []str = {"a","b","c","d","e","f","c","e","f","a"};
	List<String> str = new ArrayList<String>(Arrays.asList("a","b","c","d","e","f","c","e","f","a"));
	System.out.print("Duplicet elements :- "+str);
	List<Object> newstr  = str.stream().distinct().collect(Collectors.toList());
	System.out.println("UNICK Elements :- "+newstr);
		
}
}
