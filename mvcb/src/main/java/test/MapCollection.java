package test;

import java.util.HashMap;
import java.util.Map;

public class MapCollection {
	public static void main(String[] args) {
		//List , Map
		//Map 컬렉션 클래스
		//Map 인터페이스 구현 클래스 HashMap, Hashtable, TreeMap
		//키와 값을 하나의 쌍으로 저장하는 방식
		//리스트나 배열처럼 순차적으로 저장되지 않고 key를 통해 value를
		//얻는다
		//key는 중복이 허용하지 않는다.
		//key의 데이터 타입 String, value의 데이터 타입 String
		Map<String,String> hashMap=new HashMap<>();
//		Map<String,Integer> hashMap1=new HashMap<>();
		//put 메서드로 데이터를 추가
		hashMap.put("people", "사람");
		hashMap.put("baseball", "야구");
		//get 메서드로 key에 해당하는 value를 얻을 때 사용한다.
		System.out.println(hashMap.get("people"));
		//키값이 없을 때는 get메서드는 null값을 리턴
		//contailsKey 메서드는 맵에 해당 key가 있는지를 불값으로 리턴
		System.out.println(hashMap.containsKey("people"));
		System.out.println(hashMap.containsKey("book"));
		//remove메서드는 맵의 항목을 삭제하는 매서드 key값으로 value값도
		//삭제됩니다. 리턴값으로 value값을 리턴한다.
		hashMap.remove("people");
		String r1=hashMap.remove("baseball");
		System.out.println(r1);
		//size 메서드는 앱 요소의 개수를 리턴한다
		System.out.println(hashMap.size());
		hashMap.put("book", "책");
		System.out.println(hashMap.size());
		//keySet()메서드는 맵의 모든 key를 모아서 리턴한다
		System.out.println(hashMap.keySet());
		hashMap.put("keyboard", "키보드");
		System.out.println(hashMap.keySet());
		hashMap.put("searchField", "제목");
	}

}




