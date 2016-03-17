package chapter12;

public class Project12_02 extends Project12_01 {
	
	public Project12_02() {
		super();
	}
	public Project12_02(int length) {
		super(length);
	}
	public Project12_02(Project12_02 list) {
		super(list);
	}
	
	public Object get(int i) throws IndexOutOfBoundsException {
		if(i < 0 || i >= size())
			throw new IndexOutOfBoundsException();
		return array[i];
	}
	public int size() {
		return logical_size;
	}
	
}