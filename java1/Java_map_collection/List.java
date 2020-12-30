import java.util.*;

public class List{
	public static void main(String[] args) {
		//ArrayList - 단방향 포인터 구조 - 검색에 적절 - 삽입, 삭제가 비효율(데이터를 복제하는 방법으로 실행)
		ArrayList<Integer> list1 = new ArrayList<>();
		list1.add(1);
		list1.add(2);
		list1.add(0,3);
		System.out.println(list1);
		
		//LinkedList - 양방향 포인터 구조 - 삽입, 삭제가 효율적
		LinkedList<Integer> list2 = new LinkedList<>();
		list2.add(1);
		list2.add(2);
		list2.add(0,3);
		System.out.println(list2);
		
		//Vector - 성능이 무거워 잘 사용되지 않음
		Vector<Integer> list3 = new Vector<>();
		list3.add(1);
		list3.add(2);
		list3.add(0,3);
		System.out.print(list3);
	}
}