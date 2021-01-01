import java.util.*;

public class Bubble_sort{
	public static void main(String[] args) {
		int array[] = new int[] {5,4,6,7,3,2,1,8,10,9};
		
		for (int i=0;i<array.length;i++) {
			for (int j=0;j<array.length-1;j++) {
				if(array[j+1]>array[j]) {
					int tmp=array[j+1];
					array[j+1]=array[j];
					array[j]=tmp;		
				}
			}
		}
		for (int number:array) {
			System.out.println(number);
		}
	}
}