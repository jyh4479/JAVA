import java.util.*;

public class Selection_sort{
	public static void main(String[] args) {
		int array[] = new int[] {5,4,6,7,3,2,1,8,10,9};
		
		for(int i=0;i<array.length;i++) {
			int min_index=i;
			
			for(int j=i;j<array.length;j++) { //최소값 찾기
				if(array[j]<array[min_index]) {				
					min_index=j;
				}
			}
			int tmp=array[i]; //스왑
			array[i]=array[min_index];
			array[min_index]=tmp;
		}
		for(int number:array) {
			System.out.println(number);
		}
	}
}
