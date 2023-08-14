package I.TOPStreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
public class streamIntermediateOperations {
public static void main(String[] args)
{
	List<Integer> num = Arrays.asList(1,2,3,4,5,6,7,8,9);
	String str[] = {"Deva","Ram","seatha","Arjun","Dasu","Ravi","Mahadeva","Davi",};
	List<String> name = Arrays.asList(str);
	//Intermediate Operations  using in filter
	List<String> newname = name.stream().filter(s->s.startsWith("D")).collect(Collectors.toList());
	System.out.println(newname);
	//Intermediate Operations  using in sorted
	List<String> newname1 = name.stream().sorted().collect(Collectors.toList());
	System.out.println(newname1);
	//Intermediate Operations  using in map
	List<Integer> squar = num.stream().map(x->x*5).collect(Collectors.toList());
	System.out.print(squar);
	//qList<String> name1 = Arrays.asList("Deva","Ram","seatha","Arjun","Dasu","Ravi","Mahadeva","Davi");
//	List<String> newname1 = name1.stream().sorted().map(String::toUpperCase).forEach(System.out::println);
	
}
}
