package Day06;
import java.util.*;
public class DisplayPosition {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
System.out.println("enter the array");
int arr[]=new int[5];


	
	
	for(int i=0;i<arr.length;i++) {
		arr[i]=sc.nextInt();
	}
	System.out.println("Enter position");
	int no=sc.nextInt();
	int add=1 ;
	if(no<=5) {
		add=arr[no-1];
		System.out.println(add);
	}
	else {
		System.out.println("error");
	}
	
	
	
}

}
