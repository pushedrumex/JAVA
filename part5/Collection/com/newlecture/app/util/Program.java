package part5.Collection.com.newlecture.app.util;

import java.util.ArrayList; // List인터페이스를 구현한 클래스
import java.util.HashMap;
import java.util.HashSet;
import java.util.List; // List : 인터페이스
import java.util.Map;
import java.util.Set;

public class Program {

	public static void main(String[] args) {
		// GList<Integer> list = new GList<>();
		List<Integer> list = new ArrayList<>();
		list.add(3);
		list.add(5);
		list.add(6);
		list.add(7);
		
		// 집합구조로 순서가 없음. get()메서드 사용 불가
		// 중복 제거용으로 사용
		Set<Integer> set = new HashSet<>();
		list.add(3);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(7);
		
		// (속성,값) (key, value)
		Map<String,Object> map = new HashMap<>();
		map.put("id",3);
		map.put("title", "Hello");
		map.put("hit",12);
		
		System.out.println(map.get("id"));
	}
}
