import java.util.*;

public class Hash{
	public static void main(String[] arg) {
		//HashMap - 순서 상관x - 비동기처리 - O(1)
		HashMap<Integer,String> map1 = new HashMap<>();
		map1.put(1,"A");
		map1.put(2,"B");
		map1.put(3,"C");
		map1.remove(1);
		map1.put(2, "D");
		System.out.println(map1);
		
		//LinkedHashMap - key의 삽입순서 보장 - 비동기처리 - O(N)
		LinkedHashMap<Integer,String> map2 = new LinkedHashMap<>();
		map2.put(1,"A");
		map2.put(2,"B");
		map2.put(3,"C");
		map2.remove(1);
		map2.put(2, "D");
		System.out.println(map2);
		
		//TreeMap - key가 오름차순으로 정렬 출력 - Red-Black tree사용 - O(logN)
		TreeMap<Integer, String> map3 = new TreeMap<>();
		map3.put(2,"A");
		map3.put(3,"B");
		map3.put(1,"C");
		map3.put(0,"D");
		map3.remove(2);
		System.out.println(map3);
		
		//HashTable과 HashMap의 차이는 동기화에서 나옴
		//동기화 처리 때문에 HashMap에 비해 느리다고한다.
		//동기처리를 위해 ConcurrentHashMap을 사용하기도 함
		
	}
}