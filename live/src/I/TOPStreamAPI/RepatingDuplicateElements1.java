package I.TOPStreamAPI;

public class RepatingDuplicateElements1 
{
	public static void main(String[] args)
	{
		String str = "hii Devanjienulu can you do every thing";
		char ch = 'e';
		int count =0;
	str = str.toLowerCase();
	for(int i=0;i<str.length();i++) {
		if(str.charAt(i)==ch) {
			count++;
		}
	}
	System.out.print(count);
	}
}