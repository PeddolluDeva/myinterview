package DuplicatesArrayelements;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArraySetINT {
 public static void main(String[] args) {
	 List<Integer> num = new ArrayList<Integer>(Arrays.asList(1,2,9,3,4,7,5,6,1,7,8,3,9,0,5));
	 System.out.println("Duplicate element :- "+num);
	 List<Object>newnum = num.stream().distinct().collect(Collectors.toList());
	 System.out.println("unick element :- "+newnum);
	 
 }
}
