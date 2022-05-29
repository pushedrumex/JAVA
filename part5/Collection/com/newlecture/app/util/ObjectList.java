package part5.Collection.com.newlecture.app.util;

public class ObjectList {
	
	// Object : 모든 클래스가 기본적으로 상속하는 클래스
	// 모든 클래스의 부모로, 참조 가능
	private Object[] nums;
	private int current;
	
	public ObjectList() {
		nums = new Object[3];
		current = 0;
	}

	public void add(Object num) {
		nums[current] = num;
		current++;
	}

	public void clear() {
		//nums = new int[3];
		current = 0;
	}

	public int size() {
		return current;
	}

	public Object get(int index) {
		if(current <= index)
			throw new IndexOutOfBoundsException();
		return nums[index];
	}
}
