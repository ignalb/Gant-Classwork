package chapter12;

public class Project12_01 {
	
	protected Object[] array;
	protected int logical_size = 0;
	
	public Project12_01() {
		this(5);
	}
	public Project12_01(int length) {
		array = new Object[length];
	}
	public Project12_01(Project12_01 list) {
		this(list.logical_size);
		for(int i = 0; i < list.logical_size; i++, logical_size++){
			array[i] = list.array[i];
		}
	}
	
	public String toString() {
		String string = "";
		for(int i = 0; i < logical_size; i++){
			string += array[i];
			string += (i != logical_size - 1) ? ", " : "";
		}
		return string;
	}
}