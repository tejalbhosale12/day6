package Day06;
import java.util.*;
public class AdditionOfTwoArray {
public static void main(String[] args) {
	int[] array1 = {1, 2, 3};  
    int[] array2 = {4, 5, 6, 7};  
    int[] sumArray = new int[Math.max(array1.length, array2.length)];  
    for (int i = 0; i < sumArray.length; i++) {  
        int num1 = (i < array1.length) ? array1[i] : 0;  
        int num2 = (i < array2.length) ? array2[i] : 0;  
        sumArray[i] = num1 + num2;  
    }  
    
    System.out.print("Sum Array: ");  
    for (int num : sumArray) {  
        System.out.print(num + " ");  
    }  
	
  
}
}

