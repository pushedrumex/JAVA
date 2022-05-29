package part5.Collection.com.newlecture.app.util;

public class GList<T> { // T : 설정할 자료
	// 제네릭 사용
	// T에는 모든 참조자료형이 올 수 있음
	private Object[] list;
	private int current;
	private int capacity;
	private int amount;
	
	public GList() {
		current = 0;
		capacity = 3;
		amount = 5;
		list = new Object[capacity];
	}
	
	// 가변크기 컬렉션으로 변경하기
	public void add(T num) {
		
		// 공간이 부족하다면
		if (current>=capacity) {
			Object[] temp = new Object[capacity+amount];
			for (int i=0;i<current;i++)
				temp[i] = list[i];
			list = temp;
			capacity += amount;
		}
		list[current] = num;
		current++;
	}

	public void clear() {
		//nums = new int[3];
		current = 0;
	}

	public int size() {
		return current;
	}

	public T get(int index) {
		if(current <= index)
			throw new IndexOutOfBoundsException();
		return (T)list[index];
	}
}
