package DuplicatesArrayelements;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class ArrayUserSetSTR {
public static void main(String[] args)
{
	ArrayList<String> name = new ArrayList<String>(Arrays.asList("a","d","b","c","e","b","d"));
	System.out.println("Duplcate elements :-"+name);
	HashSet<String> newname=new HashSet<String>(name);
	System.out.println("Unick element :- "+newname);
}
}
