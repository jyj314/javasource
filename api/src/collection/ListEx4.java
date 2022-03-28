package collection;

import java.util.List;
import java.util.Vector;

// ArrayList 와 Vector 동일
// ArrayList 가 더 나중에나와서 성능이좋음
// 데이터를 읽어오고 저장하는 데 효율이 좋음
// 단, 용량을 변경할 때는 효율이 떨어짐


public class ListEx4 {
	public static void main(String[] args) {
		
		List<String> list = new Vector<String>();
		
		list.add("1");
		list.add("3");
		list.add("5");
		list.add("7");
		
		System.out.println(list);
		
		list.clear();
		
		System.out.println("clear() 후 "+list);

	}

}
