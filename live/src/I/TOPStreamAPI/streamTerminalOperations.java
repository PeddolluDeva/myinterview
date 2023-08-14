package I.TOPStreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class streamTerminalOperations {
public static void main(String[] args)
{
	List<Integer> num = Arrays.asList(1,2,3,4,5,6,7,8,9);
	//Terminal Operations    U   sing in collect
		List<Integer> qube = num.stream().map(x->x*3).collect(Collectors.toList());
		System.out.print(" collect :- "+qube);
		////Terminal Operations    Using in forEach
	   Integer number = num.stream().filter(x->x%2==0).reduce(0,(ans,i)->ans+i);
	   System.out.println("reduce :- "+number);
	   num.stream().map(x->x*x).forEach(y->System.out.println(y));
	   System.out.print("forEach :- "+num);
	 //  List<Integer> num=limiting_func(num,5);
	   

}
}
