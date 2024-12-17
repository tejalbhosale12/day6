package Day06;
import java.util.*;
public class SqaureAndCube {
public static void main(String[] args) {
	int[] temp = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
int [] tem=new int [0];
    for (int value : temp) {
        System.out.println(value);
    }

    for (int i = 0; i < temp.length; i++) {
        temp[i] = (int) Math.pow(temp[i], 2);
        
    }
    for(int i=0;i<tem.length;i++) {
    	tem[i]=(int) Math.pow(temp[i],3);
    }

    for (int value : temp) {
        System.out.print(value);
    }
    for (int val:tem) {
    System.out.println(val);
    }
}
}
