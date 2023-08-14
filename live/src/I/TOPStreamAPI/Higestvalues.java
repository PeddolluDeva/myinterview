package I.TOPStreamAPI;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
public class Higestvalues {
public static void main(String[] args)
{
	Integer arr[] = {1,77,4,23,7,80};
	//3 higest value in arr 
	//ex:- 1 , 4 ,7,23,5,80,70
	List<Integer> newarr = Arrays.asList(arr);
	newarr.stream().skip(3).collect(Collectors.toList());
	System.out.println(newarr);
	//newarr.stream().sorted().forEach(System.out::println);
	//newarr.stream().sorted(Comparator.reverseOrder()).skip(2).forEach(System.out::println);
	System.out.println(arr);//  80 me	
	newarr.stream().sorted(Comparator.reverseOrder()).skip(3).limit(1).forEach(System.out::println);
	//  7
	newarr.stream().sorted(Comparator.reverseOrder()).skip(0).limit(1).forEach(System.out::println);
	//80
	newarr.stream().sorted(Comparator.reverseOrder()).skip(2).limit(3).forEach(System.out::println);
	// 23,7 , 4   
	
}
}
