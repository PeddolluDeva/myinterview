package I.TOPStreamAPI;

public class RepatingDuplicateElements {
  public static void main(String[] args)
  {
	  	String str="devanjineyulu";
	  	char ch;
	  	int count;
	 // 	str=str.toLowerCase();
	  	for(ch ='a';ch <='z';ch++) {
	  		count = 0;
	  		for(int i=0;i<str.length();i++) {
	  			if(str.charAt(i)==ch) {    //(i)==ch) {
	  				count++;
	  			}}
	  	System.out.println("nomber of repating elements :- "+ch+"   is  "+count+"  =  "+str.length());
	  	}
	  	char c ;
	  	for(c='a';c<='z';c++) {
	  		System.out.print(c+" ");
	  	}
  }
}
 