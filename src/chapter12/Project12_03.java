package chapter12;

public class Project12_03 extends Project12_02 {
	
	public static void main(String[] args){
		Project12_03 list = new Project12_03(10);
		list.add("error");
		list.add(12);
		list.add("String");
		list.add("a");
		list.add('z');
		System.out.println(list);
		
		System.out.println("Removed element 0: " + list.remove(0));
		System.out.println("New list: " + list);
		System.out.println("Can add PI at 2: " + list.add(2, Math.PI));
		System.out.println("New array: " + list);
	}

	public Project12_03(){
		super();
	}
	public Project12_03(int length){
		super(length);
	}
	public Project12_03(Project12_03 list){
		super(list);
	}
	
	public Object remove(int i) throws IndexOutOfBoundsException {
		if(i < 0 || i >= size())
			throw new IndexOutOfBoundsException();
		Object[] placeholder = new Object[1];
		placeholder[0] = get(i);
		for(int j = i; j < size(); j++){
			array[j] = array[j+1];
		}
		logical_size--;
		
		return placeholder[0];
	}
	public boolean add(Object o){
		return add(size(), o);
	}
	public boolean add(int i, Object o){
		if(array.length <= size())
			return false;
		if(i < 0){
			add(0, o);
		} else if(size() >= 1 && i >= size()){
			add(size() - 1, o);
		} else {
			for(int j = size(); j > i; j--){
				array[j] = array[j-1];
			}
			array[i] = o;
			logical_size++;
		}
		return true;
	}
	
}
