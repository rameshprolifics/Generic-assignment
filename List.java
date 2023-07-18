package drn.generics;

class ListOperation<T> {
	
	private T[]a;
	
	private int front=0;
	private int index =-1;
	
	public ListOperation() {};
	
	public ListOperation(T[]a) {
		this.a=a;
	}
	
	public boolean isFull() {
		return index == a.length-1;
	}
	public void Append(T ele) {
		if(!isFull()) {
			System.out.println(a[++index]=ele);
		}
		else {
			throw new RuntimeException("List is Full");
		}
	}
	public boolean isEmpty() {
		return front == index;
	}
	
	public T DeleteBeg() {
		if(!isEmpty()) {
			return a[front--];
		}
		else {
			throw new RuntimeException("List is Empty");
		}
	}
	
	public void AddAtBeg(T ele) {
		if(!isEmpty()) {
			System.out.println(a[++front]=ele);
		}
		else {
			throw new RuntimeException("NO elements at beginning");
		}
	}
	
	public T Deleteend() {
		if(!isFull()) {
			return a[index--];
		}
		else {
			throw new RuntimeException("No elements at End");
		}
	}

}

public class List {
	public static void main(String[] args) {
		ListOperation<Employee> s = new ListOperation<Employee>(new Employee[6]);
		
		s.AddAtBeg(new Employee(101,"ramesh",123456));
		s.AddAtBeg(new Employee(102,"ramesh",123456));
		s.AddAtBeg(new Employee(103,"ramesh",123456));
		
		s.Append(new Employee(104,"ramesh",123456));
		s.Append(new Employee(105,"ramesh",123456));
		s.Append(new Employee(106,"ramesh",123456));
		
		
		System.out.println();
		System.out.println("Deleting the elements at Begging");
		System.out.println();
		System.out.println(s.DeleteBeg());
		
		System.out.println();
		System.out.println("Deleting the elements at End");
		System.out.println();
		System.out.println(s.Deleteend());
		
				
		
		
		
		
		
	}
}

