//자바로 구현하는 삽입정렬
import java.util.*;

public class Insertion_sort{
	public static void main(String[] args) {
		int array[] = new int[] {5,4,6,7,3,2,1,8,10,9};
		int i, j, key;
		for (i=1;i<array.length;i++) {
			key=array[i];
			for (j=i-1; j>=0 && array[j]>key  ;j--) {
				array[j+1] = array[j];
			}
			array[j+1]=key;
		}
		for(int number:array) {
			System.out.println(number);
		}
	}
}