package DuplicatesArrayelements;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;  
public class ArrayUsedSetINT {
public static void main(String[] args)
{
	
	ArrayList<Integer> num = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,0,1,3,5,7,9));
	System.out.println("Duplicate element :- "+num);
	HashSet<Integer> newnum = new HashSet<Integer>(num);
	System.out.println("unick elements :- "+newnum);
	
}
}
