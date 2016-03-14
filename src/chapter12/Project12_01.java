package chapter12;

public class Project12_01 {

	public static void main(String[] args){
		
	}
	
}

class ArrayList {
	private Object[] array;
	private int size = 0;
	
	public ArrayList() {
		this(5);
		size = 5;
	}
	public ArrayList(int length) {
		size = length;
		array = new Object[size];
	}
	public ArrayList(ArrayList list) {
		this(list.size());
		for(int i = 0; i < size(); i++){
			array[i] = list.get(i);
		}
	}
	
	public Object get(int i) throws IndexOutOfBoundsException {
		return array[i];
	}
	public int size() {
		return size;
	}
	
	public String toString() {
		String string = "";
		for(Object x : array){
			string += x + " ";
		}
		return string;
	}
}