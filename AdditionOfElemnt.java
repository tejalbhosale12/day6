package Day06;
import java.util.*;
public class AdditionOfElemnt {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println(":Enter a array element");
	int sum=0;
	int arr[]=new int[5];
	
	
	for(int i=0;i<arr.length;i++) {
		arr[i]=sc.nextInt();
	}
	for(int i=0;i<arr.length;i++) {
		sum=sum+arr[i];
		
	}
	System.out.println("the sum of array element is =" +sum);
	
}
}
