package Example;

public class EvenOddNum {
public static void main(String[] args)
{  
		int a[]={1,2,3,4,5,6,7,8,9,0};  
		System.out.println("Odd Numbers:");  
		for(int i=0;i<a.length;i++){  
		if(a[i]%2!=0){  
		System.out.println(a[i]);  
		}  
		}  
		System.out.println("Even Numbers:");  
		for(int i=0;i<a.length;i++){  
		if(a[i]%2==0){  
		System.out.println(a[i]);  
		}  
		}  
		}}
//	int arr[] ={1,2,3,4,5,6,7,8,9,0};
//	System.out.println("Numbers even:- ");
//  for(int i=0;i<=arr.length;i++) {
//	  if(i%2==0) {
//		  System.out.println("Even Numbers is  :- "+arr[i]);
//	  } 
//  }
// System.out.println(" Number Odd :- ");
// for(int i=0;i<=arr.length;i++) {
//	 if(i%2!=0) {
//		 System.out.println("Odd numbers is :- "+arr[i]);
//	 }
// }
